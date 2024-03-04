package pageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePageObjects {
	public WebDriver driver;
	List<WebElement> centers;
	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	By FindACenter = By.xpath("//a[contains(text(),'Find a Center')]");
	By Login = By.xpath("//a[contains(text(),'Login')]");
	By ManageAccount = By.xpath("//div[@class='flexible-feature__grid']//div[1]//a[1]//div[1]");
	By HealthAndSaftey=   By.xpath("//div[@class='flexible-feature__grid']//div[2]//a[1]//div[1]");
	By MeasureChildDevelopment = By.xpath("//div[@class='flexible-feature__grid']//div[3]//a[1]//div[1]");
	By SmallGroupEnrichment = By.xpath("//div[@class='flexible-feature__grid']//div[4]//a[1]//div[1]");
	By GetBeforeAndAfterSchoolCare = By.xpath("//div[@class='flexible-feature__grid']//div[5]//a[1]//div[1]");
	By WeAreHiring = By.xpath("//div[@class='flexible-feature__grid']//div[6]//a[1]//div[1]");
	By InputZipCode = By.xpath("//input[@id='center-search-location']");
	By radius = By.xpath("//select[@class='distance valid']");
	By searchAgain = By.xpath("//button[contains(text(), 'Search Again')]");
	By listofCenters = By.xpath("//ol/li/div[@class='container']");
	By cookieButtonLocator = By.cssSelector("button.cookie-banner__button");
	//By OurCenters = By.xpath("//a[contains(text(),'Our Centers')]");

     // Create an instance of the Actions class

	public void acceptCookie() throws InterruptedException
	{
	
		
	}
	
	
	public void FindACenter()
	{
		WebElement ourCentersMenu = driver.findElement(By.xpath("//a[contains(text(),'Our Centers')]"));

        // Create an instance of the Actions class
        Actions actions = new Actions(driver);
	     // Hover over the "Our Centers" menu item
	    actions.moveToElement((WebElement) ourCentersMenu).perform();
		driver.findElement(FindACenter).click();
	}
	
	public void selectZipCode(int zipcode) 
	{
		if(zipcode!=0) 
		{
		String Zipcode = Integer.toString(zipcode);
		driver.findElement(InputZipCode).clear();
		driver.findElement(InputZipCode).sendKeys(Zipcode);
		}
	}
	
	public void selectDistance(String raduisofzipcode) throws InterruptedException
	{
		
		Select select = new Select(driver.findElement(radius));
		


	}
	
	public List<WebElement> searchAgain() throws InterruptedException {
		driver.findElement(searchAgain).click();
	    centers = driver.findElements(By.cssSelector("ol.center-search-results--primary"));
		return centers;
		
	}


	public void extractData() {
		
		
		
		List<WebElement> centers = driver.findElements(By.xpath("//ol/li/div[@class='container']"));

		for (int i = 1; i < centers.size() + 1; i++) {

			String address = "";
			String name = driver.findElement(By.xpath("(//ol/li/div[@class='container'])[" + i + "]/a/h2")).getText();
			String phone = driver.findElement(By.xpath("(//ol/li/div[@class='container'])[" + i + "]/div/p/a/span")).getText();

			List<WebElement> addr = driver.findElements(By.xpath("(//ol/li/div[@class='container'])[" + i + "]/div/div/span"));
			for (int j = 1; j < addr.size() + 1; j++) {
				String adrline = driver.findElement(By.xpath("(//ol/li/div[@class='container'])[" + i + "]/div/div/span[" + j + "]")).getText();
				address += " " + adrline;
			}

			System.out.println(i + ". Name = " + name);
			System.out.println("   Phone = " + phone);
			System.out.println("   Address = " + address);
	}
	}
}
