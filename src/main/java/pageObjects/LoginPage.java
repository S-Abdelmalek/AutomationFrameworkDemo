package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	By emailTxtBox = By.cssSelector("#emailInput_4-input");
	By PwdTxtBox = By.cssSelector("input[type='password']");
	By LoginBtn = By.cssSelector("._1hx9z6hg.w-100");
	
	public WebElement getEmailTxtBox ()
	{
		return driver.findElement(emailTxtBox);
	}
	public WebElement getPwdTxtBox ()
	{
		return driver.findElement(PwdTxtBox);
	}
	public WebElement getLoginBtn ()
	{
		return driver.findElement(LoginBtn);
	}

}
