package pageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PythonSearchResultPage {
	
	WebDriver driver;
	
	public PythonSearchResultPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getCourse (String course)
	{
		int i=0 ;
		List <WebElement> courses = driver.findElements(By.xpath("//h2[@class = 'color-primary-text card-title headline-1-text']"));
		for ( i = 0 ; i<courses.size() ; i++)
		{
			if (courses.get(i).getText().equalsIgnoreCase(course))	
				break;
		}
		return courses.get(i);
	}

}
