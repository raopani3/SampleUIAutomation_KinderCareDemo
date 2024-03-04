package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObjects;
import utils.TestContextSetup;


public class HomePageSteps {
	
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	public HomePageObjects homepageObjects;
	TestContextSetup testContextSetup;
	
	public HomePageSteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.homepageObjects = testContextSetup.pageObjectManager.getHomePageObjects();
	}
	
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
    
	@When("the user clicks on Find a center")
	public void the_user_clicks_on_Find_a_center() {
		
		homepageObjects.FindACenter();
	}
	@Then("^the user enters a valid (.+) into the search field$")
	public void userEntersZipcode(int zipcode) throws InterruptedException
	{

		homepageObjects.selectZipCode(zipcode);
//		homepageObjects.selectDistance(raduis);
		
	}
	@When("the user clicks on the search button")
	public void SearchAgain() throws InterruptedException
	{
		homepageObjects.searchAgain();
		
	}
	
	@Then("the user should see a list of day care facilities in that zipcode area")
	public void the_user_should_see_a_list_of_day_care_facilities_in_that_zipcode_area() {
		homepageObjects.extractData();
	  
	}




}
