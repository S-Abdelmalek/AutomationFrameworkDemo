package alphaPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class MultiLogoTest extends Base{
	
	//public static Logger log = LogManager.getLogger(Base.class.getName());
	WebDriver driver ;
	
	@BeforeTest
	void init () throws IOException
	{
		driver =  initializeDriver () ;
		driver.get(prop.getProperty("url"));
	}

	
	
	@Test (dataProvider = "getData")
	public void logoTest (String logoname) 
	{
		
		LandingPage lp = new LandingPage(driver);
		Assert.assertTrue(lp.getLogo(logoname).isDisplayed());
			
	}
	
	
	@DataProvider
	public Object[][] getData ()
	{
		Object[][] data = new Object[8][1];
		data[0][0] =  "IBM";
		data[1][0] =  "University of Illinois at Urbana-Champaign";
		data[2][0] =  "Duke University";
		data[3][0] =  "Google";
		data[4][0] =  "University of Michigan";
		data[5][0] =  "Imperial College of London";
		data[6][0] =  "Stanford University";
		data[7][0] =  "University of Pennsylvania";
		return data;
	}
	
	@AfterTest
	void end ()
	{
		driver.close();
		driver= null;
	}

}
