package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	
	By LetsBegin=By.xpath("//*[@id=\"formsWrapper\"]/div/div/div/button");
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement letsBegin() {
		// TODO Auto-generated method stub
		return driver.findElement(LetsBegin);
	}
	
	
	
}
