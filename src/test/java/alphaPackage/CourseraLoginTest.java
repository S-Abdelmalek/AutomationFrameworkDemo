package alphaPackage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class CourseraLoginTest extends Base{
	
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	WebDriver driver ;
	
	@BeforeTest
	void init () throws IOException
	{
		driver =  initializeDriver () ;
		log.info("Driver is initialized");
		
		
	}

	
	
	@Test (dataProvider = "getData")
	public void goToHomePage (String username, String pwd , String text ) throws IOException
	{
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get(prop.getProperty("url"));
		LandingPage LP = new LandingPage(driver);
		//js.executeScript("arguments[0].scrollIntoView();",LP.getLoginBtn());
		LP.getLoginBtn().click();
		log.info("Button in Landing page to go to Login page is clicked");
		Assert.assertTrue(driver.getCurrentUrl().contentEquals("https://www.coursera.org/?authMode=login"));
		LoginPage LoginPg = new LoginPage(driver);
		LoginPg.getEmailTxtBox().sendKeys(username);
		log.info("email successfully entered");
		LoginPg.getPwdTxtBox().sendKeys(pwd);
		log.info("password successfully entered");
		LoginPg.getLoginBtn().click();
		log.info("login button successfully clicked");
		System.out.println(text);
	}
	
	@DataProvider 
	public Object[][] getData ()
	{
		Object[][] data = new Object[2][3];
		data[0][0] = "sara@yahoo.com";
		data[0][1] = "password5123";
		data[0][2] = "Testcase execution No.1";
		
		data[1][0] = "saranmaher@yahoo.com";
		data[1][1] = "pass1/2/3";
		data[1][2] = "Testcase execution No.2";
		
		return data;
	}
	
	@AfterTest
	void end ()
	{
		driver.close();
		log.info("Driver successfully closed");
		driver= null;
	}

}
