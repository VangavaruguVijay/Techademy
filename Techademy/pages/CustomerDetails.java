package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerDetails {
	
	public WebDriver driver;
	By NationalID=By.name("saudi_iqama");
	By Continue=By.xpath("//button[text()='Continue']");
	
	public CustomerDetails(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement NationalID()
	{
		return driver.findElement(NationalID);
	}
	
	public WebElement Continue()
	{
		return driver.findElement(Continue);
	}
	
	
}
