package step_definitions;

import com.aventstack.extentreports.Status;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.asserts.SoftAssert;
import pageobjects.CreateNewOAMSCreationPage;
import pageobjects.HomePage;
import pageobjects.PropertiesPageObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Generic_Steps extends BaseClass {


	CreateNewOAMSCreationPage createNewOAMSCreationPage = new CreateNewOAMSCreationPage();
	public String SubmissonDate;
	SoftAssert sa;
	@Given("^I have logged in full permission user model$")
	public void iHaveLoggedInFullPermissionUserModel() throws Exception {
		String Url = createNewOAMSCreationPage.fullPermission();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		driver.get(Url);
	}
	@Given("^I have logged in full permission user model(.*)$")
	public void iHaveLoggedInFullPermissionUserModel(String AdminRights) throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		String permission= "AdminRights";
		try {
			if(permission.equals(AdminRights.trim())){
				String Url = createNewOAMSCreationPage.fullPermission();
				//driver.manage().deleteAllCookies();
				//Thread.sleep(10000);
				driver.get(Url);
			}else {
				String Url = createNewOAMSCreationPage.TestUser();
				driver.get(Url);
			}
		}catch (Exception e){
			e.printStackTrace();
		} finally {
			Thread.sleep(10000);
			HomePage homepage = new HomePage();
			sa = new SoftAssert();
			test = rep.createTest("Testing...");
			String expectedtitle = "Contracts - Contracts - All Items";
			String actualtitle = homepage.getPageTitle();
			System.out.println("------------------->actualtitle = " + actualtitle);
			sa.assertEquals(actualtitle, expectedtitle);
			test.log(Status.INFO, "Expected title = " + expectedtitle);
			test.log(Status.INFO, "Actual title = " + actualtitle);
			if (expectedtitle.equals(actualtitle.trim())) {
				test.log(Status.PASS, "Expected and Actual title is a match");
			} else {
				test.log(Status.FAIL, "Expected and Actual title does NOT match");
			}
		}

	}

	@Given("^I have logged in TestUser permission user model(.*)$")
	public void iHaveLoggedInTestUserUserModel(String AdminRights) throws Exception {
		String permission= "AdminRights";
		try {
			if(permission.equals(AdminRights.trim())){
				String Url = createNewOAMSCreationPage.TestUser();
				//driver.manage().deleteAllCookies();
				//Thread.sleep(10000);
				driver.get(Url);
			}else {
				String Url = createNewOAMSCreationPage.TestUser();
				driver.get(Url);
			}
		}catch (Exception e){
			e.printStackTrace();
		} finally {
			Thread.sleep(10000);
			HomePage homepage = new HomePage();
			sa = new SoftAssert();
			test = rep.createTest("Testing...");
			String expectedtitle = "Contracts - Contracts - All Items";
			String actualtitle = homepage.getPageTitle();
			System.out.println("------------------->actualtitle = " + actualtitle);
			sa.assertEquals(actualtitle, expectedtitle);
			test.log(Status.INFO, "Expected title = " + expectedtitle);
			test.log(Status.INFO, "Actual title = " + actualtitle);
			if (expectedtitle.equals(actualtitle.trim())) {
				test.log(Status.PASS, "Expected and Actual title is a match");
			} else {
				test.log(Status.FAIL, "Expected and Actual title does NOT match");
			}
		}

	}
	@And("^I click on OAM menu from side bar$")
	public void iClickOnOAMSMenuFromSideBar() throws InterruptedException {
		PropertiesPageObject property = new PropertiesPageObject();
		test.log(Status.INFO, "OAMS Application Menu cick: " + "");
		property.clickOnOAMS();
	}
	@And("^I click on New opportunity approval request$")
	public void iClickOnNewOpportunityApprovalRequest() throws InterruptedException {
		PropertiesPageObject property = new PropertiesPageObject();
		test.log(Status.INFO, "OAMS Create New OAMS opportunity approval request: "+"");
		property.NewOpportunityApprovalRequest();
	}
	@And("^I click the on the Save Button$")
	public void iClickTheOnTheSaveButton() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		homepage.clickSaveButton();
		homepage.WaitForSpecificTime();
	}

	@And("^Verify the permission$")
	public void iVerifyPermision() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		homepage.SitePermission();
		homepage.WaitForSpecificTime();
		homepage.switchWindow();
		homepage.verifySitePermission();
		driver.quit();
		Thread.sleep(10000);

	}
	@And("^Fill the OAMS New Opportunity Details for Category (.*) and required effort day as (.*) and (.*)$")
	public void fillTheOAMSNewOpportunityDetailsForCategoryCategoryTypeAndRequiredEffortDayAsEffortDay(String CategoryTye,String effortDays,String revenuVal) throws InterruptedException, IOException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Switch the frame " + "");
		homepage.switchToCreateFrame();
		homepage.fillOAMSNewOpportunity(CategoryTye,effortDays,revenuVal);
	}
	@And("^Verify the respective Records for Approval and (.*) and CategoryType is (.*)$")
	public void verifyTheRespectiveRecordsInSignOnForApproval(String approvalType,String CategoryType) throws IOException, InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Verify Records ");
		homepage.VerifyRecordApprovalType();
		homepage.VerifyCatTypeAndApprovalStatus(approvalType,CategoryType);
	}

	@And("^I Verify the respective Records for Approval(.*)$")
	public void verifyCateoryType(String approvalType) throws IOException, InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Verify Records ");
		homepage.VerifyRecordApprovalType();
		homepage.VerifyCatType(approvalType);
	}

	@And("^I click on Respective Records and click on edit button for approver requires$")
	public void iClickOnRespectiveRecordsAndClickOnEditButtonForApproverRequires() throws IOException, InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Records requires Approvers");
		homepage.VerifyRecordsAndClickForEdit();
	}
	@And("^Provided the required approvers as (.*)$")
	public void providedTheRequiredApproversAsApproved(String approverStatus) {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.verifyOverAllStatus(approverStatus);
	}

	@And("^Provided the required Pemission approvers as (.*)$")
	public void providedTheRequiredPermissionApproversAsApproved(String approverStatus) {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.verifyPermission(approverStatus);
	}

	@And("^I Provided the required approvers as (.*)$")
	public void ApproversApprove(String approverStatus) {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.CategoryBLessThan25Approvers(approverStatus);
	}

	@And("^I Provided the required for CategoryC (.*)$")
	public void CategoryCApproversApprove(String approverStatus) {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.CategoryCApproval(approverStatus);
	}

	@And("^Provide the require approvers for Development Request (.*)$")
	public void provideTheRequireApproversForDevRequest(String approvers) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.ReleaseRequest(approvers);
	}
	@And("^Provide the require approvers for Release Request (.*)$")
	public void provideTheRequireApproversForReleaseRequest(String approvers) {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.verifyOverAllStatusForReleaseRequest(approvers);
	}

	@And("^Relese RequestApprovers on the basis of effrtDays and tcv value (.*),(.*) and (.*) and (.*)$")
	public void effortDysAndTCVValue(String CatType,String effrdays,Double dealval,String approvers) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.AppLevelAndCategory(CatType,effrdays,dealval,approvers);
	}

	@And("^Relese RequestApprovers on the basis of effrtDays and tcv valueTC13 (.*),(.*) and (.*) and (.*)$")
	public void effortDysAndTCVValueTC13(String CatType,String effrdays,Double dealval,String approvers) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.AppLevelAndCategoryTC13(CatType,effrdays,dealval,approvers);
	}

	@And("^Relese RequestApprovers on the basis of effrtDays and tcv valueTC05 (.*),(.*) and (.*) and (.*)$")
	public void effortDysAndTCVValueTC05(String CatType,String effrdays,Double dealval,String approvers) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.AppLevelAndCategoryTC05(CatType,effrdays,dealval,approvers);
	}

	@And("^Relese RequestApprovers on the basis of effrtDays and tcv valueTC10 (.*),(.*) and (.*) and (.*)$")
	public void effortDysAndTCVValueTC10(String CatType,String effrdays,Double dealval,String approvers) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.AppLevelAndCategoryTC10(CatType,effrdays,dealval,approvers);
	}

	@And("^Relese RequestApprovers on the basis of effrtDays and tcv valueTC12 (.*),(.*) and (.*) and (.*)$")
	public void effortDysAndTCVValueTC12(String CatType,String effrdays,Double dealval,String approvers) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.AppLevelAndCategoryTC12(CatType,effrdays,dealval,approvers);
	}


	@And("^Relese RequestApprovers on the basis of effrtDays and tcv valueTC09 (.*),(.*) and (.*) and (.*)$")
	public void effortDysAndTCVValueTC09(String CatType,String effrdays,Double dealval,String approvers) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.AppLevelAndCategoryTC09(CatType,effrdays,dealval,approvers);
	}

	@And("^Relese RequestApprovers on the basis of effrtDays and tcv valueTC01 (.*),(.*) and (.*) and (.*)$")
	public void effortDysAndTCVValueTC01(String CatType,String effrdays,Double dealval,String approvers) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.AppLevelAndCategoryTC01(CatType,effrdays,dealval,approvers);
	}

	@And("^Relese RequestApprovers on the basis of effrtDays and tcv valueTC04 (.*),(.*) and (.*) and (.*)$")
	public void effortDysAndTCVValueTC04(String CatType,String effrdays,Double dealval,String approvers) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.AppLevelAndCategoryTC04(CatType,effrdays,dealval,approvers);
	}

	@And("^Relese RequestApprovers on the basis of effrtDays and tcv valueTC08 (.*),(.*) and (.*) and (.*)$")
	public void effortDysAndTCVValueTC08(String CatType,String effrdays,Double dealval,String approvers) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.AppLevelAndCategoryTC08(CatType,effrdays,dealval,approvers);
	}

	@And("^Relese RequestApprovers on the basis of effrtDays and tcv valueTC06 (.*),(.*) and (.*) and (.*)$")
	public void effortDysAndTCVValueTC06(String CatType,String effrdays,Double dealval,String approvers) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.AppLevelAndCategoryTC06(CatType,effrdays,dealval,approvers);
	}

	@And("^I Provide the require approvers for Release Request (.*)$")
	public void provideTheRequireApproversForReleaseRequestCategoryB(String approvers) {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.verifyOverAllStatusForReleaseRequestCategoryB(approvers);
	}

	@And("^I Provide the require approvers for Release Request greater than hundred (.*)$")
	public void provideTheRequireApproversForReleaseRequestGreaterThan100(String approvers) {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.verifyOverAllStatusForReleaseRequestGreaterThan100(approvers);
	}


	@And("^I click on filter option for approved$")
	public void iClickOnFilterOptionForApproved() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Filter Option approve");
		homepage.filterOption();
	}
	@And("^I select the Approved filter criteria$")
	public void iSelectTheApprovedFilterCriteria() throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Filter Menu Selection");
		homepage.filterMenu();
	}

	@And("^I verify the App Level Criteria on the basis of (.*),(.*) and (.*)$")
	public void iVerifyTheAppLevelCriteriaOnTheBasisOfGovCatEffrDysAndDealValue(String CatType,String effrdays,Double dealval) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Filter Menu Selection");
		homepage.AppLevel(CatType,effrdays,dealval);

	}
}
