package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.base;

public class HomePage extends base {

	public WebDriver driver;
	
	
	By GoToBookStore=By.id("gotoStore");
	By BookSelection=By.xpath("//*[@id=\"see-book-Git Pocket Guide\"]/a");
	By AddToCollection=By.id("addNewRecordButton");
	By Logout=By.id("submit");
	
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
	}


	public WebElement GoToBookStore() {
	
	return driver.findElement(GoToBookStore);
	}
	
	public WebElement BookSelection() {
		
		return driver.findElement(BookSelection);
	}
	
	public WebElement AddToCollection() {
		
		return driver.findElement(AddToCollection);
	}
	
	public WebElement Logout() {
		
		return driver.findElement(Logout);
	}
	

	
	
}
