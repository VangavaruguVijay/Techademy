package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.base;

public class LoginPage extends base {

	public WebDriver driver;
	
	
	By UserName=By.id("userName");
	By Password=By.id("password");
	By Login=By.id("login");
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}


	public WebElement UserName() {
	
	return driver.findElement(UserName);
	}
	
	public WebElement Password() {
		
		return driver.findElement(Password);
	}
	
	public WebElement Login() {
		
		return driver.findElement(Login);
	}
	

	
	
}
