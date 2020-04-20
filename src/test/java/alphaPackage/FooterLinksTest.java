package alphaPackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class FooterLinksTest extends Base{
	
	WebDriver driver ;
	
	@BeforeTest
	void init () throws IOException
	{
		driver =  initializeDriver () ;
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	@Test (dataProvider = "getData")
	public void footerLinkTest (String icon) throws IOException
	{
		
		LandingPage lp = new LandingPage (driver);
		lp.getIcon(icon).click();
		Set <String> ids = driver.getWindowHandles();
		Iterator <String> wi = ids.iterator();
		String parentid = wi.next();
		String childid = wi.next();
		driver.switchTo().window(childid);
		Assert.assertTrue(driver.getCurrentUrl().contains(icon));
		driver.close();
		driver.switchTo().window(parentid);
	}
	
	
	@DataProvider
	public Object[][] getData ()
	{
		Object[][] data = new Object[5][1];
		data[0][0] = "facebook";
		data[1][0] = "linkedin";
		data[2][0] = "twitter";
		data[3][0] = "youtube";
		data[4][0] = "instagram";
		return data;
	}
	
	@AfterTest
	void end ()
	{
		driver.quit();
		driver= null;
	}
	
	

}
