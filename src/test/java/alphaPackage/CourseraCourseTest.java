package alphaPackage;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.PythonCoursePage;
import pageObjects.PythonSearchResultPage;
import resources.Base;

public class CourseraCourseTest extends Base {
	
	WebDriver driver;
	
	@BeforeTest
	public void init () throws IOException 
	{
		driver = initializeDriver () ;
	} 
	
	
	@Test (dataProvider = "getData")
	void getPythonCourse (String courseName)
	{
		driver.get(prop.getProperty("url"));
		LandingPage LP = new LandingPage(driver);
		PythonSearchResultPage pp = new PythonSearchResultPage(driver);
		PythonCoursePage pp3 = new PythonCoursePage(driver);
		LP.getSearchTxtBox().click();
		LP.getSearchTxtBox().sendKeys("python");
		LP.getSearchTxtBox().sendKeys(Keys.ENTER);
		assertEquals(driver.getCurrentUrl(), "https://www.coursera.org/search?query=python&");
		pp.getCourse(courseName).click();
		Assert.assertTrue(pp3.getCourseTitle().contains(courseName));
		
	}
	
	
	@DataProvider
	public Object[][] getData ()
	{
		Object[][] data = new Object[2][1];
		data[0][0] = "Python 3 Programming";
		data[1][0] = "Python for Data Science and AI";
		return data;
	}
	
	
	@AfterTest
	void end ()
	{
		driver.quit();
		driver= null;
	}

}
