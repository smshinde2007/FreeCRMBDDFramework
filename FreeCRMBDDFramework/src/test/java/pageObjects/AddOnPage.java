package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.TestBase;

public class AddOnPage extends TestBase
{
	@FindBy(xpath="//div[contains(text(),'Add-ons')]")
	WebElement addon;
	@FindBy(xpath="//div[@class='css-76zvg2 r-homxoj r-ubezar'][normalize-space()='SpiceMax']")
	WebElement spiceMax;
	@FindBy(xpath="//label[@for='termsec1']")
	WebElement tnc;
	
	public AddOnPage(WebDriver driver)
	{
		AddOnPage.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addonclick()
	{
		Actions action= new Actions(driver);
		action.moveToElement(addon);
	}
	
	public void spiceMaxClick()
	{
		spiceMax.click();
	}
	public void tncClick()
	{
		tnc.click();
	}
	
	
}
