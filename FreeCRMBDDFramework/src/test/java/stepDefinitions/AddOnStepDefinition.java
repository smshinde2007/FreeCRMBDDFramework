package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.AddOnPage;
import utility.TestBase;

public class AddOnStepDefinition extends TestBase
{
	AddOnPage adp;
	
	@Given("User click on addOn tab and go to spiceMax opttion")
	public void user_click_on_add_on_tab_and_go_to_spice_max_opttion()
	{
		adp= new AddOnPage(driver);
		adp.addonclick();
		adp.spiceMaxClick();
	}
	@Then("check terms and condition")
	public void check_terms_and_condition() 
	{
		adp.tncClick();
	}

	@And("user close broser")
	public void user_close_broser() 
	{
	    driver.quit();
	}
}
