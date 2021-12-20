package pageobjects;

import com.github.javafaker.Faker;
import helpers.PopupWindow;
import helpers.WritePropertiesFile;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import step_definitions.BaseClass;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.util.concurrent.TimeUnit.SECONDS;

//import com.sharepoint.qa.base.TestBase;

public class PropertiesPageObject extends BaseClass {

	private Faker faker = new Faker();


	@FindBy(xpath = "//span[contains(text(),'Create new opportunity approval request')]")
	public WebElement CreateNewOpportunityRequest;

	@FindBy(xpath =   "//a[@href='/sites/oam/Lists/OAM/All Items new.aspx']" )    //"(//iframe)[1]")
	public	WebElement OAMMeueOption;

	@FindBy(xpath = "//input[@title='CRM ID Required Field']")
	public WebElement CrmIDRequired;

	@FindBy(xpath = "//select[@title='Business Segment Required Field']")  //Government,Housing,Health & Cloud
	public WebElement businessSegment;

	@FindBy(xpath = "//select[@title='Proposition Group Required Field']")  //Government
	public WebElement PropositionGroup;

	@FindBy(xpath = "//select[@title='Customer']")
	public WebElement CustomerGrp;

	@FindBy(xpath = "//input[@title='Opportunity Description Required Field']")
	public WebElement OpportunityRqrField;

	@FindBy(xpath = "//input[@title='Revenue (TCV) Required Field']")
	public WebElement RevenueRqrField;

	@FindBy(xpath = "//select[@title='Sales Lead']")
	public WebElement SalesLead;

	@FindBy(xpath = "//select[@title='Governance Category Required Field']")
	public WebElement GovernanceRqrField;

	@FindBy(xpath = "//Select[@title='Risk Assessment Status Required Field']")
	public WebElement RiskAssessmentRqrField;

	@FindBy(xpath = "//input[@title='Risk Score Required Field']")
	public WebElement RiskScoreRqrField;

	@FindBy(xpath = "//select[@title='Estimated effort days Required Field']")
	public WebElement EstimatedRqrField;

	@FindBy(xpath =   "//iframe[contains(@src,'/_layouts/15/listform.aspx?')]" )    //"(//iframe)[1]")
	public	WebElement SwitchFrame;

	@FindBy(xpath = "//span[@class='ms-DetailsHeader-cellName']")
	public WebElement getPageHeaderName;

	@FindBy(xpath = "//span[contains(@class,'ms-ContextualMenu-itemText') and contains(text(),'Filter by')]")
	public WebElement filterBy;

	@FindBy(xpath = "//input[contains(@class,'ms-BasePicker-input pickerInput')]")
	public WebElement InputFilterVal;

	@FindBy(xpath = "//div[@class='od-FieldRenderer-text']/span")
	public WebElement RecordsVerifyState;

	@FindBy(xpath = "//span[@class='CommandBarItem-commandText' and text()='Edit']")
	public WebElement EditBtnClick;

	@FindBy(xpath = "//span[contains(@id,'OVERALL')]")
	public WebElement overAllStatus;

	@FindBy(xpath = "//span[@style]//select[contains(@title,'Delivery')]")    //"//select[@title='Delivery Director Approval']")  //Approved
	public WebElement deliveryDirectorApproval;

	@FindBy(xpath = "//span[@style]//select[contains(@title,'CRO')]")    //"//select[@title='Delivery Director Approval']")  //Approved
	public WebElement CROApproval;

	@FindBy(xpath = "//span[@style]//select[@title='EDM Approval']")    //"//select[@title='Delivery Director Approval']")  //Approved
	public WebElement EDMApproval;

	@FindBy(xpath = "//span[@style]//select[contains(@title,'Sales Director')]")//Approved
	public WebElement salesDirectorApproval;

	@FindBy(xpath = "//span[@style]//select[contains(@title,'Executive Director')]")  //Approved
	public WebElement executiveDirectorApproval;

	@FindBy(xpath = "//span[@style]//select[contains(@title,'Finance Manager')]")  //Approved
	public WebElement financeManagerApproval;

	@FindBy(xpath = "//span[@style]//select[contains(@title,'Legal Team')]")  //Approved
	public WebElement legalTeamApproval;

	@FindBy(xpath = "//select[@title='COO Approval']")  //Approved
	public WebElement CooApproval;

	@FindBy(xpath = "//select[@title='CFO Approval']")  //Approved
	public WebElement CFOApproval;

	@FindBy(xpath = "//*[contains(@id,'Comments') and @title]")
	public WebElement comments;

	@FindBy(xpath = "(//input[@class='ms-ButtonHeightWidth' and @value='Save'])[2]")
	public WebElement SaveBtn;

	@FindBy(xpath = "//select[@title='Approval Type Required Field']")  //Approved
	public WebElement approvalTypeRequie;

	@FindBy(xpath = "//span[@style]//select[contains(@title,'Delivery')]")
	public WebElement ReleaseRequestDeliveryApproval;

	@FindBy(xpath = "//span[@style]//select[contains(@title,'Delivery')]")
	public WebElement ReleaseRequestDeliveryApprovalTC06;

	@FindBy(xpath = "//span[@style]//select[contains(@title,'Sales Director')]")
	public WebElement ReleaseRequestSalesApproval;

	@FindBy(xpath = "//span[@style]//select[contains(@title,'Sales Director')]")
	public WebElement ReleaseRequestSalesApprovalTC06;

	@FindBy(xpath = "//span[@style]//select[contains(@title,'Executive Director')]")
	public WebElement ReleaseRequestExecutiveApproval;

	@FindBy(xpath = "//span[@style]//select[contains(@title,'Executive Director')]")
	public WebElement ReleaseRequestExecutiveApprovalTC06;

	@FindBy(xpath = "//select[@title='General Counsel Approval']")
	public WebElement GeneralCounselApprovals;

	@FindBy(xpath = "//select[@title='CEO_Approval']")
	public WebElement CEO_approvals;


	@FindBy(xpath = "//span[@style]//select[contains(@title,'Finance Manager')]")
	public WebElement ReleaseRequestFinanceApproval;

	@FindBy(xpath = "//span[@style]//select[contains(@title,'Finance Manager')]")
	public WebElement ReleaseRequestFinanceApprovalTC06;

	@FindBy(xpath = "//span[@style]//select[contains(@title,'Legal Team')]")
	public WebElement ReleaseRequestLegalApproval;

	@FindBy(xpath = "//span[@style]//select[contains(@title,'Legal Team')]")
	public WebElement ReleaseRequestLegalApprovalTC06;

	@FindBy(xpath = "//select[@title='COO_Approval']")
	public WebElement ReleaseRequestCOOApproval;

	@FindBy(xpath = "//select[@title='CFO_Approval']")
	public WebElement ReleaseRequestCFOApproval;

	@FindBy(xpath = "//span[@class='CommandBarItem-icon']/i[contains(@class,'od-IconGlyph ms-Icon ms-Icon--Filter')]")
    public WebElement filterIcon;

	@FindBy(xpath = "//*[contains(@class,'od-CommandBarItem-down ms-Icon')]")
	public WebElement filterMenu;

	@FindBy(xpath = "//span[text()='Approved'and contains(@class,'ms-ContextualMenu-itemText')]")
	public WebElement approvedState;

	@FindBy(xpath = "//select[@title='CEO_Approval']")
	public WebElement CEOApprovals;

	@FindBy(xpath = "//select[@title='General Counsel Approval']")
	public WebElement GeneralCounselApproval;

	@FindBy(xpath = "//div[contains(@data-automation-key,'OpportunityLevel')]/div/span")
	public WebElement OpportunitySignOffLevel;

	@FindBy(xpath = "//input[@title='Opportunity sign off level']")
	public WebElement SignoffLevel;

	@FindBy(xpath = "//span[@class='ms-DetailsHeader-cellName']")
	public WebElement VerifyHeaderRecord;

	@FindBy(xpath = "//div[contains(@data-automation-key,'OVERALL')]")
	public WebElement overAllStatuss;



	@FindBy(xpath = "(//input[@value='Save'])[2]")
	WebElement SaveContractBtn;

	@FindBy(xpath = "//span[contains(@class,'owaimg ms-Icon ms-Icon--Settings ms-icon')]")
	WebElement siteSettingIcon;

	@FindBy(xpath = "//a[text()='Site permissions']")
	WebElement siteSettingIconLink;

	@FindBy(xpath = "//a[text()='Advanced permissions settings']")
	WebElement AdvancePermissionSettinglink;

	@FindBy(xpath = "//a[contains(text(),'Government and Housing Finance Approvers')]")
	WebElement govtAndHouseing;

	@FindBy(xpath = "//a[text()='Test User Sharepoint']")
	WebElement testUser;

	@FindBy(xpath = "//a[@class='ms-core-menu-root' and @title='Open Menu' and text()='New']")
	WebElement NewBtn;

	@FindBy(xpath = "//iframe[@class='ms-dlgFrame']")
	WebElement uplaodFrame;

	@FindBy(xpath = "//input[@class='sp-peoplepicker-editorInput']")
	WebElement testInput;

	@FindBy(xpath = "//input[@class='ms-button-emphasize ms-aclinv-share-button']")
	WebElement ShareBtn;

	@FindBy(xpath = "//input[@title='Name Required Field']")
	WebElement Name;

	@FindBy(xpath = "//div[contains(@class,'ms-Button-label') and contains(@id,'id') and text()='Apply']")
	public  WebElement filterApplyBtn;



	public void clickOnOAMS() throws InterruptedException {
		OAMMeueOption.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void NewOpportunityApprovalRequest() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOf(VerifyHeaderRecord));
		CreateNewOpportunityRequest.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	public Integer setNameandCRMIDDynamic() throws InterruptedException {
		Thread.sleep(20000);
		Integer a = ThreadLocalRandom.current().nextInt();
		return  a;
	}

	public void fillOAMSNewOpportunity(String CategoryType, String EffortDays,String revenueVal) throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(businessSegment));
		CrmIDRequired.sendKeys("CRMID"+setNameandCRMIDDynamic());
		String getCrmID = CrmIDRequired.getAttribute("value").trim();
		WriteDataIntoConfig("WriteDataConfig",getCrmID);
		String BusnessSegment = ReadIntoConfig("BusinessSegment","/config/config.properties");
		Select propertyNames = new Select(businessSegment);
		propertyNames.selectByVisibleText(BusnessSegment);
		String PropositionGrp = ReadIntoConfig("PropositionGroup","/config/config.properties");
		Select propositionGroup = new Select(PropositionGroup);
		propositionGroup.selectByVisibleText(PropositionGrp);
		String CustomerOAMS = ReadIntoConfig("CustomerOams","/config/config.properties");
		Select CustomerOAM = new Select(CustomerGrp);
		CustomerOAM.selectByVisibleText(CustomerOAMS);
		OpportunityRqrField.sendKeys(ReadIntoConfig("OpportunityDescription","/config/config.properties"));
		RevenueRqrField.sendKeys(revenueVal);
		String SalesLeads = ReadIntoConfig("SalesLead","/config/config.properties");
		Select SalesL = new Select(SalesLead);
		SalesL.selectByVisibleText(SalesLeads);
		Select GoveranceCatType = new Select(GovernanceRqrField);
		GoveranceCatType.selectByVisibleText(CategoryType);
		String RiskAssestStatus = ReadIntoConfig("RiskAssessmentStatus","/config/config.properties");
		Select riskStatus = new Select(RiskAssessmentRqrField);
		riskStatus.selectByVisibleText(RiskAssestStatus);
		String riskScore = ReadIntoConfig("RiskScore","/config/config.properties");
		if(!(CategoryType.equals("Exemption"))) {
			RiskScoreRqrField.sendKeys(riskScore);
		}
		Select effortDays = new Select(EstimatedRqrField);
		effortDays.selectByVisibleText(EffortDays);
	}


	public void switchToCreateFrame() throws InterruptedException {
		manageFluientWait(SwitchFrame);
		driver.getTitle();
		System.out.println(driver.getTitle());
		//driver.switchTo().defaultContent();
		driver.switchTo().frame(SwitchFrame);
	}

	public void VerifyRecordApprovalType() throws InterruptedException, IOException {
		//Thread.sleep(20000);
		//WebDriverWait waits = new WebDriverWait(driver, 60);
		//waits.until(ExpectedConditions.visibilityOf(filterBy));
		manageFluientWait(CreateNewOpportunityRequest);
		String crmid = ReadIntoConfig("WriteDataConfig","/config/RunTimeData.properties");
		WebElement approvalType = driver.findElement(By.xpath("//span[text()='"+crmid+"']"));
		if(approvalType.isDisplayed()){
			List<WebElement> headerSize = driver.findElements(By.xpath("//span[@class='ms-DetailsHeader-cellName']"));
			Integer getTblHeaderSize = headerSize.size();
			System.out.println("Table Header Size"+ getTblHeaderSize);
			for(int i=0;i<=getTblHeaderSize;i++)
			{
				   String HeaderName = headerSize.get(i).getText();
				   if(HeaderName.equals("CRM ID"))
				   {
				   	   System.out.println(i);
					   headerSize.get(i).click();
					   WaitForSpecificTime();
					   filterBy.click();
					   manageFluientWait(InputFilterVal);
					   //waits.until(ExpectedConditions.visibilityOf(InputFilterVal));
					   InputFilterVal.sendKeys(crmid);
					   Thread.sleep(15000);
					   InputFilterVal.sendKeys(Keys.ENTER);
					   //Thread.sleep(200);
					   JavascriptExecutor js = (JavascriptExecutor)driver;
					   js.executeScript("arguments[0].click();", filterApplyBtn);
					   Thread.sleep(5000);
					   break;
				   }
			}
		}else{

		}
	}

	public void VerifyRecordsAndClickForEdit() throws InterruptedException, IOException {
		//Thread.sleep(10000);
		WebElement test = driver.findElement(By.xpath("//div[@class='od-FieldRenderer-text']/span"));
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOf(test));
		List<WebElement> recordsVerify = driver.findElements(By.xpath("//div[@class='od-FieldRenderer-text']/span"));
		for(int i=0;i<recordsVerify.size();i++)
		{
			recordsVerify.get(i).click();
			wait = new WebDriverWait(driver, 180);
			wait.until(ExpectedConditions.visibilityOf(EditBtnClick));
			EditBtnClick.click();
			break;
		}
	}

	public void verifyOverAllStatus(String approvalStatus){
		//WaitForSpecificTime();
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOf(overAllStatus));
		selectDropDown(deliveryDirectorApproval,approvalStatus);
		selectDropDown(salesDirectorApproval,approvalStatus);
		selectDropDown(executiveDirectorApproval,approvalStatus);
		selectDropDown(financeManagerApproval,approvalStatus);
		selectDropDown(legalTeamApproval,approvalStatus);
		selectDropDown(CooApproval,approvalStatus);
		selectDropDown(CFOApproval,approvalStatus);
		try{
			selectDropDown(CROApproval,approvalStatus);
		}catch (Exception e){
		}
		try{
			selectDropDown(EDMApproval,approvalStatus);
		}catch (Exception e){
		}
		comments.sendKeys("all approved");
		SaveBtn.click();
	}

	public void verifyPermission(String approvalStatus){
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(overAllStatus));
		if(deliveryDirectorApproval.isEnabled()){
			Assert.assertTrue("Editable",deliveryDirectorApproval.isEnabled());
			System.out.println("editable");
		}else {
			Assert.fail("Not editable");
		}
		if(salesDirectorApproval.isEnabled()){
			Assert.assertTrue("Editable",salesDirectorApproval.isEnabled());
		}else {
			Assert.fail("Not editable");
		}
		if(executiveDirectorApproval.isEnabled()){
			Assert.assertTrue("Editable",executiveDirectorApproval.isEnabled());
		}else {
			Assert.fail("Not editable");
		}
		if(financeManagerApproval.isEnabled()){
			Assert.assertTrue("Editable",financeManagerApproval.isEnabled());
		}else {
			Assert.fail("Not editable");
		}
		if(legalTeamApproval.isEnabled()){
			Assert.assertTrue("Editable",legalTeamApproval.isEnabled());
		}else {
			Assert.fail("Not editable");
		}
		if(CooApproval.isEnabled()){
			Assert.assertTrue("Editable",CooApproval.isEnabled());
		}else {
			Assert.fail("Not editable");
		}
		if(CFOApproval.isEnabled()){
			Assert.assertTrue("Editable",CFOApproval.isEnabled());
		}else {
			Assert.fail("Not editable");
		}
		comments.sendKeys("only givn permission approved");
		SaveBtn.click();
	}

	public void CategoryBLessThan25Approvers(String approvalStatus){
		manageFluientWait(overAllStatus);
		selectDropDown(deliveryDirectorApproval,approvalStatus);
		selectDropDown(salesDirectorApproval,approvalStatus);
		try {
			selectDropDown(executiveDirectorApproval, approvalStatus);
		}catch(Exception e){
			System.out.println("ExecutiveDirectoryApproval");
			}
		comments.sendKeys("all approved");
		SaveBtn.click();
	}

	public void CategoryCApproval(String approvalStatus){
		manageFluientWait(overAllStatus);
		selectDropDown(deliveryDirectorApproval,approvalStatus);
		selectDropDown(salesDirectorApproval,approvalStatus);
		comments.sendKeys("all approved");
		SaveBtn.click();
	}

	public void verifyOverAllStatusForReleaseRequest(String approvalStatus){
		manageFluientWait(overAllStatus);
		selectDropDown(ReleaseRequestDeliveryApproval,approvalStatus);
		selectDropDown(ReleaseRequestSalesApproval,approvalStatus);
		selectDropDown(ReleaseRequestExecutiveApproval,approvalStatus);
		selectDropDown(ReleaseRequestFinanceApproval,approvalStatus);
		selectDropDown(ReleaseRequestLegalApproval,approvalStatus);
		selectDropDown(ReleaseRequestCOOApproval,approvalStatus);
		selectDropDown(ReleaseRequestCFOApproval,approvalStatus);
		try{
			selectDropDown(CROApproval,approvalStatus);
		}catch (Exception e){
		}
		try{
			selectDropDown(EDMApproval,approvalStatus);
		}catch (Exception e){
		}
		comments.sendKeys("all approved");
		SaveBtn.click();
	}


	public void AppLeve1(String approvalStatus){
		manageFluientWait(overAllStatus);
		if(ReleaseRequestDeliveryApproval.isEnabled()){
			selectDropDown(ReleaseRequestDeliveryApproval,approvalStatus);
		}
		selectDropDown(ReleaseRequestSalesApproval,approvalStatus);
		selectDropDown(ReleaseRequestExecutiveApproval,approvalStatus);
		selectDropDown(GeneralCounselApproval,approvalStatus);
		selectDropDown(CEO_approvals,approvalStatus);
		selectDropDown(ReleaseRequestFinanceApproval,approvalStatus);
		selectDropDown(ReleaseRequestLegalApproval,approvalStatus);
		selectDropDown(ReleaseRequestCOOApproval,approvalStatus);
		selectDropDown(ReleaseRequestCFOApproval,approvalStatus);
		try{
			selectDropDown(CROApproval,approvalStatus);
		}catch (Exception e){
		}
		try{
			selectDropDown(EDMApproval,approvalStatus);
		}catch (Exception e){
		}
		comments.sendKeys("all approved");
		SaveBtn.click();
	}

	public void AppLeve1TC05(String approvalStatus){
		manageFluientWait(overAllStatus);
		if(ReleaseRequestDeliveryApproval.isEnabled()){
			selectDropDown(ReleaseRequestDeliveryApprovalTC06,approvalStatus);
		}
		selectDropDown(ReleaseRequestSalesApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestExecutiveApprovalTC06,approvalStatus);
		selectDropDown(GeneralCounselApproval,approvalStatus);
		selectDropDown(CEO_approvals,approvalStatus);
		selectDropDown(ReleaseRequestFinanceApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestLegalApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestCOOApproval,approvalStatus);
		selectDropDown(ReleaseRequestCFOApproval,approvalStatus);
		try{
			selectDropDown(CROApproval,approvalStatus);
		}catch (Exception e){
		}
		try{
			selectDropDown(EDMApproval,approvalStatus);
		}catch (Exception e){
		}
		comments.sendKeys("all approved");
		SaveBtn.click();
	}

	public void AppLeve1TC09(String approvalStatus){
		manageFluientWait(overAllStatus);
		if(ReleaseRequestDeliveryApproval.isEnabled()){
			selectDropDown(ReleaseRequestDeliveryApprovalTC06,approvalStatus);
		}
		selectDropDown(ReleaseRequestSalesApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestExecutiveApprovalTC06,approvalStatus);
		selectDropDown(GeneralCounselApproval,approvalStatus);
		selectDropDown(CEO_approvals,approvalStatus);
		selectDropDown(ReleaseRequestFinanceApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestLegalApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestCOOApproval,approvalStatus);
		selectDropDown(ReleaseRequestCFOApproval,approvalStatus);
		try{
			selectDropDown(CROApproval,approvalStatus);
		}catch (Exception e){
		}
		try{
			selectDropDown(EDMApproval,approvalStatus);
		}catch (Exception e){
		}
		comments.sendKeys("all approved");
		SaveBtn.click();
	}

	public void AppLeve1TC06(String approvalStatus){
		manageFluientWait(overAllStatus);
		if(ReleaseRequestDeliveryApproval.isEnabled()){
			selectDropDown(ReleaseRequestDeliveryApprovalTC06,approvalStatus);
		}
		selectDropDown(ReleaseRequestSalesApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestExecutiveApprovalTC06,approvalStatus);
		//selectDropDown(GeneralCounselApproval,approvalStatus);
	//	selectDropDown(CEO_approvals,approvalStatus);
		selectDropDown(ReleaseRequestFinanceApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestLegalApprovalTC06,approvalStatus);
		//selectDropDown(ReleaseRequestCOOApproval,approvalStatus);
	//	selectDropDown(ReleaseRequestCFOApproval,approvalStatus);
		comments.sendKeys("all approved");
		try{
			selectDropDown(CROApproval,approvalStatus);
		}catch (Exception e){
		}
		try{
			selectDropDown(EDMApproval,approvalStatus);
		}catch (Exception e){
		}
		SaveBtn.click();
	}

	public void AppLeve3(String approvalStatus){
		manageFluientWait(overAllStatus);

		selectDropDown(ReleaseRequestDeliveryApproval,approvalStatus);
		selectDropDown(ReleaseRequestFinanceApproval,approvalStatus);
		selectDropDown(ReleaseRequestExecutiveApproval,approvalStatus);
		selectDropDown(ReleaseRequestSalesApproval,approvalStatus);
		selectDropDown(ReleaseRequestLegalApproval,approvalStatus);
		try{
			selectDropDown(CROApproval,approvalStatus);
		}catch (Exception e){
		}
		try{
			selectDropDown(EDMApproval,approvalStatus);
		}catch (Exception e){
		}
		comments.sendKeys("all approved");
		SaveBtn.click();
	}

	public void AppLeve3TC10(String approvalStatus){
		manageFluientWait(overAllStatus);
		selectDropDown(ReleaseRequestDeliveryApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestFinanceApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestExecutiveApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestSalesApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestLegalApprovalTC06,approvalStatus);
		try{
			selectDropDown(CROApproval,approvalStatus);
		}catch (Exception e){
		}
		try{
			selectDropDown(EDMApproval,approvalStatus);
		}catch (Exception e){
		}
		comments.sendKeys("all approved");
		SaveBtn.click();
	}

	public void AppLeve3TC06(String approvalStatus) throws InterruptedException {
		manageFluientWait(overAllStatus);

		selectDropDown(ReleaseRequestDeliveryApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestFinanceApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestExecutiveApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestSalesApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestLegalApprovalTC06,approvalStatus);
		try{
			selectDropDown(CROApproval,approvalStatus);
		}catch (Exception e){
		}
		try{
			selectDropDown(EDMApproval,approvalStatus);
		}catch (Exception e){
		}
		comments.sendKeys("all approved");
		SaveBtn.click();
		Thread.sleep(20000);
	}


	public void AppLeve1TC01(String approvalStatus){
		WaitForSpecificTime();
		//WebDriverWait wait = new WebDriverWait(driver, 180);
		//wait.until(ExpectedConditions.visibilityOf(overAllStatus));
		manageFluientWait(overAllStatus);
		if(ReleaseRequestDeliveryApproval.isEnabled()){
			selectDropDown(ReleaseRequestDeliveryApprovalTC06,approvalStatus);
		}
		selectDropDown(ReleaseRequestSalesApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestExecutiveApprovalTC06,approvalStatus);
		selectDropDown(GeneralCounselApproval,approvalStatus);
		selectDropDown(CEO_approvals,approvalStatus);
		selectDropDown(ReleaseRequestFinanceApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestLegalApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestCOOApproval,approvalStatus);
		selectDropDown(ReleaseRequestCFOApproval,approvalStatus);
		try{
			selectDropDown(CROApproval,approvalStatus);
		}catch (Exception e){
		}
		try{
			selectDropDown(EDMApproval,approvalStatus);
		}catch (Exception e){
		}
		comments.sendKeys("all approved");
		SaveBtn.click();
		WaitForSpecificTime();
	}


	public void ReleaseRequest(String approvalStatus) throws InterruptedException {
		//WaitForSpecificTime();
		//WebDriverWait wait = new WebDriverWait(driver, 180);
		//wait.until(ExpectedConditions.visibilityOf(overAllStatus));
		manageFluientWait(overAllStatus);
		selectDropDown(approvalTypeRequie,approvalStatus);
		comments.sendKeys("all approved");
		Thread.sleep(500);
		SaveBtn.click();
		//WaitForSpecificTime();
	}

	public void filterOption() throws InterruptedException {
	//	WebDriverWait wait = new WebDriverWait(driver, 180);
		//wait.until(ExpectedConditions.visibilityOf(filterIcon));
		manageFluientWait(filterIcon);
		filterIcon.click();
		Thread.sleep(5000);
	}

	public void filterMenu() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver, 180);
	//	wait.until(ExpectedConditions.visibilityOf(filterMenu));
		manageFluientWait(filterMenu);
		filterMenu.click();
		Thread.sleep(5000);
		approvedState.click();
		Thread.sleep(5000);
	}
	public void verifyOverAllStatusForReleaseRequestGreaterThan100(String approvalStatus){
		manageFluientWait(overAllStatus);
		selectDropDown(ReleaseRequestDeliveryApproval,approvalStatus);
		selectDropDown(ReleaseRequestSalesApproval,approvalStatus);
		selectDropDown(ReleaseRequestExecutiveApproval,approvalStatus);
		selectDropDown(ReleaseRequestFinanceApproval,approvalStatus);
		selectDropDown(GeneralCounselApproval,approvalStatus);
		selectDropDown(ReleaseRequestLegalApproval,approvalStatus);
		selectDropDown(ReleaseRequestCOOApproval,approvalStatus);
		selectDropDown(ReleaseRequestCFOApproval,approvalStatus);
		selectDropDown(CEOApprovals,approvalStatus);
		try{
			selectDropDown(CROApproval,approvalStatus);
		}catch (Exception e){
		}
		try{
			selectDropDown(EDMApproval,approvalStatus);
		}catch (Exception e){
		}
		comments.sendKeys("all approved");
		SaveBtn.click();
	}
	public void selectDropDown(WebElement xpath,String dropDownVal){
		Select select = new Select(xpath);
		select.selectByVisibleText(dropDownVal);
	}

	public void VerifyCatTypeAndApprovalStatus(String approvlType,String CategoryType) throws InterruptedException {
		WaitForSpecificTime();
		Boolean approveType=false;
		Boolean categoryType=false;
		List<WebElement> recordsVerify = driver.findElements(By.xpath("//div[@class='od-FieldRenderer-text']/span"));
		for(int i=0;i<recordsVerify.size();i++){
			String approvalType = recordsVerify.get(i).getText().trim();
			String GovernaceCat = recordsVerify.get(i).getText().trim();
			if(approvalType.equals(approvlType)){
				approveType=true;
			}
			if(GovernaceCat.equals(CategoryType)){
				categoryType = true;
			}
		}
		if(approveType && categoryType ){
			System.out.println("Approval Type and Category Type is as expected");
		}else{
			Assert.fail("Respective Approval Type and CategoryType not Matched");
		}
	}


	public void VerifyCatType(String approvlType) throws InterruptedException {
		WaitForSpecificTime();
		Boolean approveType=false;
		//div[contains(@data-automation-key,'OVERALL')]
		String OverAllStatus= overAllStatuss.getText().trim();
		if(OverAllStatus.equals(approvlType)){
			approveType=true;
		}else {
			Assert.fail("Respective Approval Type and CategoryType not Matched");
		}
	}

	public void VerifyOverallStatus(String approvlType,String CategoryType) throws InterruptedException {
		WaitForSpecificTime();
		Boolean approveType=false;
		Boolean categoryType=false;
		List<WebElement> recordsVerify = driver.findElements(By.xpath("//div[@class='od-FieldRenderer-text']/span"));
		for(int i=0;i<recordsVerify.size();i++){
			String approvalType = recordsVerify.get(i).getText().trim();
			String GovernaceCat = recordsVerify.get(i).getText().trim();
			if(approvalType.equals(approvlType)){
				approveType = true;
			}
			if(GovernaceCat.equals(CategoryType)){
				categoryType = true;
			}
		}
		if(approveType && categoryType ){
			System.out.println("Approval Type and Category Type is as expected");
		}else{
			Assert.fail("Respective Approval Type and CategoryType not Matched");
		}
	}
	public String WriteDataIntoConfig(String KeyName, String passValue) throws InterruptedException, FileNotFoundException {
		WritePropertiesFile writePropertiesFile = new WritePropertiesFile();
		writePropertiesFile.WritePropertiesFile(KeyName,passValue,System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		return KeyName;
	}
	public String ReadIntoConfig(String KeyNameVal,String targetPath) throws InterruptedException, IOException {
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" +targetPath );
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String keyValue = prop.getProperty(KeyNameVal);
		return keyValue;
	}


	public void verifyOverAllStatusForReleaseRequestCategoryB(String approvalStatus){
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(overAllStatus));
		selectDropDown(ReleaseRequestDeliveryApproval,approvalStatus);
		selectDropDown(ReleaseRequestSalesApproval,approvalStatus);
		selectDropDown(ReleaseRequestExecutiveApproval,approvalStatus);
		selectDropDown(ReleaseRequestFinanceApproval,approvalStatus);
		selectDropDown(ReleaseRequestLegalApproval,approvalStatus);
		try{
			selectDropDown(CROApproval,approvalStatus);
		}catch (Exception e){
		}
		try{
			selectDropDown(EDMApproval,approvalStatus);
		}catch (Exception e){
		}
		comments.sendKeys("all approved");
		SaveBtn.click();
	}

	public void AppLevel(String govCatType,String effrdays,Double DealVal) throws InterruptedException
	{
		String govCat = govCatType;
		String effrtDys = effrdays;
		Double dealVal = DealVal;
		String ExpectedLevel = "";
		Boolean flag=false;
		String ActualLevel =OpportunitySignOffLevel.getText().trim();
		//var govCat = $('select[title^="Governance Category"]').val();
		//var effrtDys = $('select[title^="Estimated effort days"]').val();
		//var dealVal = $('input[title^="Revenue (TCV)"]').val();
		//var oppLvl = "";
		if (govCat == "Exemption") {
			ExpectedLevel = "Level 3";
			if(ActualLevel.equals(ExpectedLevel)){
				flag=true;
			}else{
				//System.out.println("Excepmtion false*******False*******");
				flag=false;
			}
		} else{
			if (dealVal > 999999) // deal value greater than 1000K irrespective of effort
			{
				ExpectedLevel = "Level 1";
				if(ActualLevel.equals(ExpectedLevel)){
					flag=true;
				}else{
					//System.out.println("Greater than 999999 not working*******False*******");
					flag=false;
				}
			} else {
				if (govCat == "Category A" && effrtDys == ">100 days*******False*******") {
					ExpectedLevel = "Level 1";
					if(ActualLevel.equals(ExpectedLevel)){
						flag=true;
					}else{
						//System.out.println("Cat A Greater Than 100 days*******False*******");
						flag=false;
					}
				} else if (govCat == "Category C" && effrtDys != ">100 days*******False*******") {
					ExpectedLevel = "Level 3";
					if(ActualLevel.equals(ExpectedLevel)){
						flag=true;
					}else{
						//System.out.println("Cat C Greater Than 100 days*******False*******");
						flag=false;
					}
				} else if (govCat == "Category B" && effrtDys != ">100 days" && dealVal < 499999) {
					ExpectedLevel = "Level 3";
					if(ActualLevel.equals(ExpectedLevel)){
						flag=true;
					}else{
						//System.out.println("Cat B Greater Than 100 days*******False*******");
						flag=false;
					}
				} else {
					ExpectedLevel = "Level 2";
					if(ActualLevel.equals(ExpectedLevel)){
						flag=true;
					}else{
						//System.out.println("Final Else*******False*******");
						flag=false;
					}
				}
			}
		}
	}


	public void AppLevelAndCategory(String govCatType,String effrdays,Double DealVal,String approve) throws InterruptedException
	{
		String govCat = govCatType;
		String effrtDys = effrdays;
		Double dealVal = DealVal;
		String ExpectedLevel = "";
		Boolean flag=false;
		String ActualLevel =SignoffLevel.getAttribute("value").trim();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ActualLevel---->"+  ActualLevel);
		//var govCat = $('select[title^="Governance Category"]').val();
		//var effrtDys = $('select[title^="Estimated effort days"]').val();
		//var dealVal = $('input[title^="Revenue (TCV)"]').val();
		//var oppLvl = "";
		if (govCat == "Exemption") {
			ExpectedLevel = "Level 3";
			if(ActualLevel.equals(ExpectedLevel)){
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Exemption---->"+  ActualLevel);
				flag=true;
			}else{
				System.out.println("Excepmtion false*******False*******");
				flag=false;
			}
		} else{
			if (dealVal > 999999) // deal value greater than 1000K irrespective of effort
			{
				ExpectedLevel = "Level 1";
				if(ActualLevel.equals(ExpectedLevel)){
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ dealVal > 999999 ActualLevel Level 1---->"+  ActualLevel);
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ dealVal > 999999 ExpectedLevel Level 1---->"+  ExpectedLevel);
					AppLeve1(approve);
					flag=true;
				}else{
					System.out.println("Greater than 999999 not working*******False*******");
					flag=false;
				}
			} else {
				if (govCat == "Category A" && effrtDys.trim() == ">100 days") {
					ExpectedLevel = "Level 1";
					if(ActualLevel.equals(ExpectedLevel)){
						System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ govCat Category A && effrtDys >100 days ActualLevel Level 1---->"+  ActualLevel);
						System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ govCat Category A && effrtDys >100 days ExpectedLevel Level 1---->"+  ExpectedLevel);
						AppLeve1(approve);
						flag=true;
					}else{
						System.out.println("Cat A Greater Than 100 days*******False*******");
						flag=false;
					}
				} else if (govCat == "Category C" && effrtDys.trim() != ">100 days") {
					ExpectedLevel = "Level 3";
					if(ActualLevel.equals(ExpectedLevel)){

						AppLeve3(approve);
						flag=true;
					}else{
						System.out.println("Cat C Greater Than 100 days*******False*******");
						flag=false;
					}
				} else if (govCat == "Category B" && (effrtDys.trim() != ">100 days") && dealVal < 499999) {
					ExpectedLevel = "Level 3";
					if(ActualLevel.equals(ExpectedLevel)){
						AppLeve3(approve);
						flag=true;
					}else{
						System.out.println("Cat B Greater Than 100 days*******False*******");
						flag=false;
					}
				} else {
					ExpectedLevel = "Level 2";
					if(ActualLevel.equals(ExpectedLevel)){
						appLevel2(approve);
						flag=true;
					}else{
						System.out.println("Final Else*******False*******");
						flag=false;
					}
				}
			}
		}
	}

	public void AppLevelAndCategoryTC06(String govCatType,String effrdays,Double DealVal,String approve) throws InterruptedException
	{
		String govCat = govCatType;
		String effrtDys = effrdays;
		Double dealVal = DealVal;
		String ExpectedLevel = "";
		Boolean flag=false;
		String ActualLevel =SignoffLevel.getAttribute("value").trim();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ActualLevel---->"+  ActualLevel);
		if (govCat.contains("Category B")) {
			ExpectedLevel = "Level 3";
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ActualLevel------------->"+  ActualLevel);
			if(ActualLevel.equals(ExpectedLevel)){
				AppLeve1TC06(approve);
				flag=true;
			}else{
				System.out.println("Cat B Greater Than 100 days*******False*******");
				flag=false;
			}

		}
	}


	public void AppLevelAndCategoryTC13(String govCatType,String effrdays,Double DealVal,String approve) throws InterruptedException
	{
		String govCat = govCatType;
		String effrtDys = effrdays;
		Double dealVal = DealVal;
		String ExpectedLevel = "";
		Boolean flag=false;
		String ActualLevel =SignoffLevel.getAttribute("value").trim();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ActualLevel---->"+  ActualLevel);
		if (govCat.contains("Exemption")) {
			ExpectedLevel = "Level 3";
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ActualLevel------------->"+  ActualLevel);
			if(ActualLevel.equals(ExpectedLevel)){
				AppLeve1TC06(approve);
				flag=true;
			}else{
				System.out.println("Cat B Greater Than 100 days*******False*******");
				flag=false;
			}

		}
	}

	public void AppLevelAndCategoryTC05(String govCatType,String effrdays,Double DealVal,String approve) throws InterruptedException
	{
		String govCat = govCatType;
		String effrtDys = effrdays;
		Double dealVal = DealVal;
		String ExpectedLevel = "";
		Boolean flag=false;
		String ActualLevel =SignoffLevel.getAttribute("value").trim();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ActualLevel---->"+  ActualLevel);
		if (govCat.contains("Category B")) {
			ExpectedLevel = "Level 1";
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ActualLevel------------->"+  ActualLevel);
			if(ActualLevel.equals(ExpectedLevel)){
				AppLeve1TC05(approve);
				flag=true;
			}else{
				System.out.println("Cat B Greater Than 100 days*******False*******");
				flag=false;
			}

		}
	}



	public void AppLevelAndCategoryTC09(String govCatType,String effrdays,Double DealVal,String approve) throws InterruptedException
	{
		String govCat = govCatType;
		String ExpectedLevel = "";
		Boolean flag=false;
		String ActualLevel =SignoffLevel.getAttribute("value").trim();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ActualLevel---->"+  ActualLevel);
		if (govCat.contains("Category C")) {
			ExpectedLevel = "Level 1";
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ActualLevel------------->"+  ActualLevel);
			if(ActualLevel.equals(ExpectedLevel)){
				AppLeve1TC09(approve);
				flag=true;
			}else{
				System.out.println("Cat B Greater Than 100 days*******False*******");
				flag=false;
			}

		}
	}

	public void AppLevelAndCategoryTC10(String govCatType,String effrdays,Double DealVal,String approve) throws InterruptedException
	{
		String govCat = govCatType;
		String ExpectedLevel = "";
		Boolean flag=false;
		String ActualLevel =SignoffLevel.getAttribute("value").trim();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ActualLevel---->"+  ActualLevel);
		if (govCat.contains("Category C")) {
			ExpectedLevel = "Level 3";
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ActualLevel------------->"+  ActualLevel);
			if(ActualLevel.equals(ExpectedLevel)){
				AppLeve3TC10(approve);
				flag=true;
			}else{
				System.out.println("Cat B Greater Than 100 days*******False*******");
				flag=false;
			}

		}
	}

	public void AppLevelAndCategoryTC08(String govCatType,String effrdays,Double DealVal,String approve) throws InterruptedException
	{
		String govCat = govCatType;
		String effrtDys = effrdays;
		Double dealVal = DealVal;
		String ExpectedLevel = "";
		Boolean flag=false;
		String ActualLevel =SignoffLevel.getAttribute("value").trim();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ActualLevel---->"+  ActualLevel);
		if (govCat.contains("Category B")) {
			ExpectedLevel = "Level 2";
			if(ActualLevel.equals(ExpectedLevel)){
				appLevel2TC08(approve);
				flag=true;
			}else{
				System.out.println("Final Else*******False*******");
				flag=false;
			}

		}
	}


	public void AppLevelAndCategoryTC12(String govCatType,String effrdays,Double DealVal,String approve) throws InterruptedException
	{
		String govCat = govCatType;
		String effrtDys = effrdays;
		Double dealVal = DealVal;
		String ExpectedLevel = "";
		Boolean flag=false;
		String ActualLevel =SignoffLevel.getAttribute("value").trim();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ActualLevel---->"+  ActualLevel);
		if (govCat.contains("Category C")) {
			ExpectedLevel = "Level 2";
			if(ActualLevel.equals(ExpectedLevel)){
				appLevel2TC08(approve);
				flag=true;
			}else{
				System.out.println("Final Else*******False*******");
				flag=false;
			}

		}
	}

	public void AppLevelAndCategoryTC04(String govCatType,String effrdays,Double DealVal,String approve) throws InterruptedException
	{
		String govCat = govCatType;
		String effrtDys = effrdays;
		Double dealVal = DealVal;
		String ExpectedLevel = "";
		Boolean flag=false;
		String ActualLevel =SignoffLevel.getAttribute("value").trim();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ActualLevel---->"+  ActualLevel);
		if (govCat.contains("Category A")) {
			ExpectedLevel = "Level 1";
			if(ActualLevel.equals(ExpectedLevel)){
				AppLeve1(approve);
				flag=true;
			}else{
				System.out.println("Final Else*******False*******");
				flag=false;
			}

		}
	}

	public void AppLevelAndCategoryTC01(String govCatType,String effrdays,Double DealVal,String approve) throws InterruptedException
	{
		String govCat = govCatType;
		String effrtDys = effrdays;
		Double dealVal = DealVal;
		String ExpectedLevel = "";
		Boolean flag=false;
		String ActualLevel =SignoffLevel.getAttribute("value").trim();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ActualLevel---->"+  ActualLevel);
		if (govCat.contains("Category A")) {
			ExpectedLevel = "Level 1";
			if(ActualLevel.equals(ExpectedLevel)){
				AppLeve1TC01(approve);
				flag=true;
			}else{
				System.out.println("Final Else*******False*******");
				flag=false;
			}

		}
	}


	public void appLevel2(String approvalStatus){
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(overAllStatus));
		selectDropDown(ReleaseRequestDeliveryApproval,approvalStatus);
		selectDropDown(ReleaseRequestSalesApproval,approvalStatus);
		selectDropDown(ReleaseRequestExecutiveApproval,approvalStatus);
		selectDropDown(ReleaseRequestFinanceApproval,approvalStatus);
		selectDropDown(ReleaseRequestLegalApproval,approvalStatus);
		selectDropDown(ReleaseRequestCOOApproval,approvalStatus);
		selectDropDown(ReleaseRequestCFOApproval,approvalStatus);
		try{
			selectDropDown(CROApproval,approvalStatus);
		}catch (Exception e){
		}
		try{
			selectDropDown(EDMApproval,approvalStatus);
		}catch (Exception e){
		}
		comments.sendKeys("all approved");
		SaveBtn.click();
	}

	public void appLevel2TC08(String approvalStatus){
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(overAllStatus));
		selectDropDown(ReleaseRequestDeliveryApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestSalesApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestExecutiveApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestFinanceApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestLegalApprovalTC06,approvalStatus);
		selectDropDown(ReleaseRequestCOOApproval,approvalStatus);
		selectDropDown(ReleaseRequestCFOApproval,approvalStatus);
		try{
			selectDropDown(CROApproval,approvalStatus);
		}catch (Exception e){
		}
		try{
			selectDropDown(EDMApproval,approvalStatus);
		}catch (Exception e){
		}
		comments.sendKeys("all approved");
		SaveBtn.click();
	}


	public void clickSaveButton() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", SaveContractBtn);
		//	SaveContractBtn.click();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}

	}

	public void SitePermission() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(siteSettingIcon));
			siteSettingIcon.click();
			Thread.sleep(5000);
			siteSettingIconLink.click();
			Thread.sleep(10000);
			AdvancePermissionSettinglink.click();

			//Save.click();
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}

	}

	public void verifySitePermission() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(govtAndHouseing));
			govtAndHouseing.click();
			Thread.sleep(5000);
			try{
				testUser.isDisplayed();
			}catch (Exception e){
				NewBtn.click();
				Thread.sleep(10000);
				uploadFrameSwitch();
				testInput.sendKeys("sptestuser");
				Thread.sleep(5000);
				testInput.sendKeys(Keys.ENTER);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", ShareBtn);
				WaitForSpecificTime();
				driver.switchTo().defaultContent();
				testUser.isDisplayed();
			}

			//Save.click();
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}

	}
	public void uploadFrameSwitch()throws InterruptedException{
		try{
			//Thread.sleep(8000);
			waitForPageToLoad(uplaodFrame);
			driver.switchTo().frame(uplaodFrame);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void WaitForSpecificTime() {
		try {
			Thread.sleep(20000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}


	public void manageFluientWait(WebElement element){
		WebElement waitFluent=null;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(300))
				.pollingEvery(Duration.ofMillis(50))
				.ignoring(NoSuchElementException.class);
		WebElement elements = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement elements = element;
				String getTextOnPage = elements.getText();
				if(elements.isDisplayed()){
					System.out.println(getTextOnPage);
					return element;
				}
				return elements;
			}
		});
	}

	public String getTitle="";
	public void switchWindow() throws InterruptedException {
		PopupWindow window = new PopupWindow();
		window.getTitleOfNewPage(driver,getTitle);
	}


	public PropertiesPageObject() {
		PageFactory.initElements(driver, this);
	}

	public void setName(String Name) throws InterruptedException {
		this.Name.sendKeys(Name);
		Thread.sleep(2000);
	}

}
