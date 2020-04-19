package alphaPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class TitleValidationTest extends Base {
	
	
	WebDriver driver;
	
	@BeforeTest
	void init () throws IOException
	{
		driver =  initializeDriver () ;
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void validateTitle  () throws IOException
	{
		
		LandingPage lp = new LandingPage(driver);
		Assert.assertTrue(lp.getTitle().getText().equalsIgnoreCase("achieve with coursera"));
	}
	
	@AfterTest
	void end ()
	{
		driver.close();
		driver= null;
	}

}
