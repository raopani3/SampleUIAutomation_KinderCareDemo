package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetup;

public class ManageYourAccountObjetcs {
	
	
	public WebDriver driver;
	public ManageYourAccountObjetcs manageYourAccountObjects;
	public ManageYourAccountObjetcs(WebDriver driver) {
		this.driver = driver;
	}
	
	By FindACenter = By.xpath("//a[contains(text(),'Find a Center')]");
	By Login = By.xpath("//a[contains(text(),'Login')]");
	By ManageAccount = By.className("pay-tuition");
	By UserName = By.id("cphPageContent_txtUsername");
	By Password = By.id("cphPageContent_txtPassword");
	By LoginButton = By.id("cphPageContent_Button2");
	By HealthAndSaftey=   By.xpath("//div[@class='flexible-feature__grid']//div[2]//a[1]//div[1]");
	By MeasureChildDevelopment = By.xpath("//div[@class='flexible-feature__grid']//div[3]//a[1]//div[1]");
	By SmallGroupEnrichment = By.xpath("//div[@class='flexible-feature__grid']//div[4]//a[1]//div[1]");
	By GetBeforeAndAfterSchoolCare = By.xpath("//div[@class='flexible-feature__grid']//div[5]//a[1]//div[1]");
	By WeAreHiring = By.xpath("//div[@class='flexible-feature__grid']//div[6]//a[1]//div[1]");
	By LoginUnsuccessful = By.xpath("//p[@class='ui-state-error rndCorner-a pdg5-b']");
	
	
	public Boolean VerifyManageAccount()
	{
		return driver.findElement(ManageAccount).isDisplayed();
	}
	public Boolean VerifyHealthAndSaftey()
	{
		return driver.findElement(HealthAndSaftey).isDisplayed();
	}
	public Boolean VerifyMeasureChildDevelopment()
	{
		return driver.findElement(MeasureChildDevelopment).isDisplayed();
	}
	public Boolean VerifySmallGroupEnrichment()
	{
		return driver.findElement(SmallGroupEnrichment).isDisplayed();
	}
	public Boolean VerifyGetBeforeAndAfterSchoolCare()
	{
		return driver.findElement(GetBeforeAndAfterSchoolCare).isDisplayed();
	}
	public Boolean VerifyWeAreHiring()
	{
		return driver.findElement(WeAreHiring).isDisplayed();
	}	
	public void FindACenter()
	{
		driver.findElement(FindACenter).click();
	}
	
	public void Login()
	{
		driver.findElement(FindACenter).click();
	}
	public void ManageAccount()
	{
		driver.findElement(ManageAccount).click();
	}
	
	public  String checkLoginPageURL() {
		
		return driver.getCurrentUrl();
	}
	
	public void UserName(String username) 
	{
		driver.findElement(UserName).clear();
		driver.findElement(UserName).sendKeys(username);
	}
	public void Password(String password)
	{
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys(password);
	}
	public void LoginButton()
	{
		driver.findElement(LoginButton).click();
	}
	public String UnSuccessfulLogin()
	{
		return driver.findElement(LoginUnsuccessful).getText();
	}

}
