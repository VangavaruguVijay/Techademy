package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MonsterHomePage {

public WebDriver driver;
	
	By uploadResume=By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[2]/div[2]");
	
	
	public MonsterHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement uploadResume() {
		// TODO Auto-generated method stub
		return driver.findElement(uploadResume);
	}
}
