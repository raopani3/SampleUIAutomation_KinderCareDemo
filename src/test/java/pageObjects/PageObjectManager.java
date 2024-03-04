package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	


	public WebDriver driver;

	public ManageYourAccountObjetcs manageYourAccountObjects;
	public HomePageObjects homepageObjects;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public ManageYourAccountObjetcs getManageYourAccount()
	{
	
	 manageYourAccountObjects= new ManageYourAccountObjetcs(driver);
	 return manageYourAccountObjects;
	}

	public HomePageObjects getHomePageObjects() {
		// TODO Auto-generated method stub
		homepageObjects = new HomePageObjects(driver);
		return homepageObjects;
	}
	
}
