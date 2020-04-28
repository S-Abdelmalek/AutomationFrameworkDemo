package StepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class StepDefinition extends Base{
	
	
	
	
	
	@Given("^WebDriver is initialized$")
	public void webdriver_is_initialized() throws Throwable {
		 driver =  initializeDriver () ;
		 driver.manage().window().maximize();
	   
	}

	@When("^Navigate to url$")
	public void navigate_to_url() throws Throwable {
		driver.get(prop.getProperty("url"));
	}

	@When("^Click login button$")
	public void click_login_button() throws Throwable {
		LandingPage LP = new LandingPage(driver);
		LP.getLoginBtn().click();
	}

	@When("^Enter Credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Credentials_and(String arg1, String arg2) throws Throwable {
		LoginPage LoginPg = new LoginPage(driver);
		LoginPg.getEmailTxtBox().sendKeys(arg1);
		LoginPg.getPwdTxtBox().sendKeys(arg2);
	}

	@When("^Click Submit Button$")
	public void click_Submit_Button() throws Throwable {
		LoginPage LoginPg = new LoginPage(driver);
		LoginPg.getLoginBtn().click();
	}

	@Then("^Login refused$")
	public void login_refused() throws Throwable {
		LoginPage LoginPg = new LoginPage(driver);
		Assert.assertTrue(LoginPg.getErrorMsg().getText().contains("Something went wrong"));
		System.out.println("First Cucumber test case executed !");
	    
	}



}
