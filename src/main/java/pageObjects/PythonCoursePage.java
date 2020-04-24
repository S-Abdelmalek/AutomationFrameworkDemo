package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PythonCoursePage {
	
	WebDriver driver;
	
	public PythonCoursePage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By courseTitle = By.xpath("//h1");
	
	public String getCourseTitle ()
	{
		return driver.findElement(courseTitle).getText();
	}

}
