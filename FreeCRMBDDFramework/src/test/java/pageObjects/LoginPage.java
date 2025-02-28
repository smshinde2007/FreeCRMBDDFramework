package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import utility.PageUtil;
import utility.TestBase;

public class LoginPage extends TestBase
{
	public WebDriver driver;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement login;
	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	WebElement user;
	@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
	WebElement pass;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement loginButton;
	@FindBy(xpath="//div[normalize-space()='Hi sagar']")
	WebElement profile;
	
	@FindBy(xpath="//div[contains(text(),'Hotels')]")
	WebElement hotel;
	@FindBy(xpath="//input[@id='txtHotelCity']")
	WebElement cityName;
	@FindBy(xpath="//a[@class='button btn-medium full-width uppercase sky-blue1']")
	WebElement searchNow;
	
	@FindBy(xpath="//input[@class=\"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"]")
	WebElement from;
	@FindBy(xpath="//input[@class=\"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"]")
	WebElement toword;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement searchFlight;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-18u37iz']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n']//*[name()='svg']//*[name()='path' and contains(@fill-rule,'nonzero')]")
	WebElement dateClcik;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void clickLogin()
	{
		//Actions action= new Actions(driver);
		//action.click(login).perform();
		login.click();
	}
	public void enterUsername(String username)
	{
		user.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		pass.sendKeys(password);
	}
	public void clickButton()
	{
		loginButton.click();
	}
	public void validateLogin()
	{
		profile.isDisplayed();
	}
	public void addCities()
	{
		from.sendKeys("Delhi");
		toword.sendKeys("Pune");
		dateClcik.click();
		
	}
	public void search()
	{
		searchFlight.click();
	}
	
}
