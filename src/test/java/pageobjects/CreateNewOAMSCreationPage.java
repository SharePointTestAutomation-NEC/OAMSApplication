package pageobjects;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.PageFactory;
import step_definitions.BaseClass;

public class CreateNewOAMSCreationPage extends BaseClass {

	private Faker faker = new Faker();
	public CreateNewOAMSCreationPage() {
		PageFactory.initElements(driver, this);
	}

	public String  fullPermission() throws Exception{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		String Username = prop.getProperty("fullPermissionUseName");
		String pwd  =  prop.getProperty("fullPermissionPwd");
		String url = prop.getProperty("url");
		String Url = "http://" + Username + ":" + pwd + "@" + url;
		System.out.println("URLS@@@@@@@@:==="+Url);
		//String url = "tc3-v-devsp05:8888/Bid%20List/Forms/Create%20New%20Bid/docsethomepage.aspx?ID=1586&FolderCTID=0x0120D52000AB2DF4A39E8CC84BA0A89A21CCB25A90007F5E2F2D8CB36146881852BD8BD2DFF9&List=2307072c-74f6-415f-ba02-f6878e18868b&RootFolder=%2FBid%20List%2FBID%2D1596136338424&RecSrc=%2FBid%20List%2FBID%2D1596136338424&InitialTabId=Ribbon%2ERead&VisibilityContext=WSSTabPersistence";
		//String Url = "http://tc3-v-devsp05:8888/Bid%20List/Forms/";
		return Url;
	}

	public String TestUser() throws  Exception{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		String Username = prop.getProperty("testUsername");
		String pwd  =  prop.getProperty("testPwd");
		String url = prop.getProperty("url");
		String Url = "http://"+ Username + ":" + pwd + "@" + url;
		System.out.println("=============TestUser"+ Url.trim());
		return Url.trim();
	}



}
