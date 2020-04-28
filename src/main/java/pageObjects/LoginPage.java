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
	
	private By emailTxtBox = By.cssSelector("#emailInput_4-input");
	private By PwdTxtBox = By.cssSelector("input[type='password']");
	private By LoginBtn = By.cssSelector("._1hx9z6hg.w-100");
	private By errorMsg = By.xpath("//div[@id='login-form-error']/span");
	
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
	public WebElement getErrorMsg ()
	{
		return driver.findElement(errorMsg);
	}

}
