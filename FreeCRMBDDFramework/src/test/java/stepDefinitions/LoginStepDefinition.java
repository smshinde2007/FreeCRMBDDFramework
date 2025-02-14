package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.LoginPage;

public class LoginStepDefinition
{
	 public WebDriver driver;
	 LoginPage login;
	 @Given("user is on login page")
	 public void user_is_on_login_page()
	 {
		   System.setProperty("WebDriver.chrome.driver", "C:/Users/POOJA/Downloads/chromedriver_win32");
		   driver= new ChromeDriver();
		   driver.get("https://www.spicejet.com");
		   System.out.println("Open url successfully");
	 }
	 @When("tilte is name of web")
	 public void tilte_is_name_of_web()
	 { 
		 String title= driver.getTitle();
			System.out.println(title);
		    Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", title);
		    System.out.println("Title validated correctly");
	 } 
	 
	 @Then("user add {string} and {string}")
	 public void user_add_and(String username, String password)
	 {
		  login= new LoginPage(driver);
		  login.clickLogin();
		  login.enterUsername(username);
		  login.enterPassword(password);
	 }
	 
	@Then("user click on login button")
	public void user_click_on_login_button() 
	{
		login.clickButton();

	}
	
	@When("user validate homePage")
	public void user_validate_homePage()
	{
		boolean name= driver.getPageSource().contains("Hi Sagar");
		System.out.println(name);
	}
	@And("close the browser")
	public void close_the_browser() 
	{
		driver.quit();

	}
	
	@Given("user click on hotel tab")
	public void user_click_on_hotel_tab() throws InterruptedException
	{
		Thread.sleep(5000);
		//login.addCities();
	}
	@When("Hotel page opens add city name")
	public void hotel_page_opens_add_city_name()
	{
		
	}
	@Then("click on search button")
	public void click_on_search_button() 
	{
		login.search();
	}
	@And("close web")
	public void close_web()
	{
		driver.quit();
	}

}
