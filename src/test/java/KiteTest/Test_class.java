package KiteTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pom_classes.KiteZirothaHomePage;
import Pom_classes.KiteZirothaLogin1Page;
import Pom_classes.KiteZirothaLogin2Page;
import Utility.Utility_Class;

public class Test_class extends BaseClass {
	//Declare All useful member global
	KiteZirothaLogin1Page page1;
	KiteZirothaLogin2Page page2;
	KiteZirothaHomePage page3;
	
	
	@BeforeClass
	public void openBrowser() {
		initilizeBrowser();
		Utility_Class.captureScreenshot(driver,"vaibhav1");
  
		
		// create object of POM class
		 page1=new KiteZirothaLogin1Page(driver);
		 page2=new KiteZirothaLogin2Page(driver);
		 page3=new KiteZirothaHomePage(driver);
		
		}
	
		
	
	@BeforeMethod
	public void logInTOApplication() throws Throwable {
		
		Utility_Class.captureScreenshot(driver,"vaibhav1");
		// Enter user name
		page1.enterUserName(Utility_Class.getTD(1, 0));
		System.out.println((Utility_Class.getTD(1, 0)));
		
		//Enter password
		page1.enterPassword(Utility_Class.getTD(1, 1));
		System.out.println(Utility_Class.getTD(1, 1));
		
		//click on login button
		page1.clickOnLoginButton();
		
		//Enter pin
		page2.enterPin(Utility_Class.getTD(1, 2));
		
		//click on continue button
		page2.clickOnContinueButton();
		
	
	}
	
	@Test
	public void verifyUserID() throws Throwable {
		
		Utility_Class.captureScreenshot(driver,"vaibhav1");
		
		Reporter.log("running verify user id",true);
		String actId = page3.verifyID();
		String expId = Utility_Class.getTD(1, 0);
		Assert.assertEquals(actId, expId,"Both are different TC fail");
	}
	@AfterMethod
	public void logOutApplication() {
		Reporter.log("Logout Application",true);
		
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close Browser",true);
	}

}
