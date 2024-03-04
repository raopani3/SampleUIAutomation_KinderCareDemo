package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ManageYourAccountObjetcs;
import utils.TestContextSetup;

public class ManageYourAccountStep {
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	public ManageYourAccountObjetcs manageYourAccount;
	TestContextSetup testContextSetup;
	
	public ManageYourAccountStep(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.manageYourAccount = testContextSetup.pageObjectManager.getManageYourAccount();
	}
    
    
    @Given("the user is on the Homepage")
    public void user_is_on_homePage()
    {
    	
    	String homepageurl = testContextSetup.pageObjectManager.driver.getCurrentUrl();
    	Assert.assertEquals(homepageurl, "https://www.kindercare.com/");
    	
    }
    
    @When("the user clicks on Login")
    public void user_clicks_on_manage_your_account() {
    	manageYourAccount.ManageAccount();
    	
    }
    @Then("the user should be redirected to the Family Connection Login Page")
    public void user_is_redirected_login_page() throws InterruptedException {
    	Thread.sleep(5000);
    	String currentURL = manageYourAccount.checkLoginPageURL();
    	assertTrue(currentURL.contains("parentportal.kindercare.com"));
    }
    
    @When("the user enters valid {string} and {string} credentials")
    public void the_user_enters_valid_and_credentials(String username, String password) throws InterruptedException {
    	Thread.sleep(5000);
    	manageYourAccount.UserName(username);
    	Thread.sleep(5000);
    	manageYourAccount.Password(password);
    	Thread.sleep(5000);
    }
    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() throws InterruptedException {
    	Thread.sleep(5000);
        manageYourAccount.LoginButton();
        Thread.sleep(5000);
    }
    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
    	
    	String unsuccessful = manageYourAccount.UnSuccessfulLogin();
    	Assert.assertEquals(unsuccessful, "Username and password is correct");
    }

}
