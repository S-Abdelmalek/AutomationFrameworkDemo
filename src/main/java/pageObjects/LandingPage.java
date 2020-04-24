package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;
	
	//constructor to give life to page via driver from TC
	public LandingPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	private By loginBtn = By.xpath("//a[@data-click-key='common.page_header.click.header_right_nav_button']");
	private By title = By.cssSelector(".rc-AchieveYourGoals__title");
	private By searchTxtBox = By.className("react-autosuggest__input");
	
	
	public WebElement getLoginBtn ()
	{
		return driver.findElement(loginBtn);
	}
	public WebElement getSearchTxtBox ()
	{
		return driver.findElement(searchTxtBox);
	}
	public WebElement getTitle ()
	{
		return driver.findElement(title);
	}
	
	
	
	
	
	
	
	
	public WebElement getLogo (String logoname)
	{
		if (logoname == "IBM")
		return driver.findElement(By.cssSelector("img[alt='IBM']"));
		if (logoname == "University of Illinois at Urbana-Champaign")
			return driver.findElement(By.cssSelector("img[alt='University of Illinois at Urbana-Champaign']"));
		if (logoname == "Duke University")
			return driver.findElement(By.cssSelector("img[alt='Duke University']"));
		if (logoname == "University of Michigan")
			return driver.findElement(By.cssSelector("img[alt='University of Michigan']"));
		if (logoname == "Imperial College of London")
			return driver.findElement(By.cssSelector("img[alt='Imperial College of London']"));
		if (logoname == "Stanford University")
			return driver.findElement(By.cssSelector("img[alt='Stanford University']"));
		if (logoname == "University of Pennsylvania")
			return driver.findElement(By.cssSelector("img[alt='University of Pennsylvania']"));
		if (logoname == "Google")
			return driver.findElement(By.cssSelector("img[alt='Google']"));
		return null;
	}
	
	public WebElement getIcon (String icon)
	{
		if (icon == "facebook") 
			return driver.findElement(By.xpath("//li[@class = 'rc-SocialMediaLinksV2__social-media-list-item' ][1]"));
		if (icon == "linkedin")
			return driver.findElement(By.xpath("//li[@class = 'rc-SocialMediaLinksV2__social-media-list-item' ][2]"));
		if (icon == "twitter")
			return driver.findElement(By.xpath("//li[@class = 'rc-SocialMediaLinksV2__social-media-list-item' ][3]"));
		if (icon == "youtube")
			return driver.findElement(By.xpath("//li[@class = 'rc-SocialMediaLinksV2__social-media-list-item' ][4]"));
		if (icon == "instagram")	
			return driver.findElement(By.xpath("//li[@class = 'rc-SocialMediaLinksV2__social-media-list-item' ][5]"));
		return null;
	}


}
