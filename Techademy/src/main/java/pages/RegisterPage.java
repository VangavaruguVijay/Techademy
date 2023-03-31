package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.base;

public class RegisterPage extends base {

	public WebDriver driver;
	
	By NewUser=By.id("newUser");
	By FirstName=By.id("firstname");
	By LastName=By.id("lastname");
	By UserName=By.id("userName");
	By Password=By.id("password");
	By Register=By.id("register");
	By BackToLogin=By.id("gotologin");
	
	public RegisterPage(WebDriver driver) {
		
		this.driver=driver;
	}



	public WebElement NewUser() {
		
		return driver.findElement(NewUser);
	}
	
	public WebElement FirstName() {
		
		return driver.findElement(FirstName);
	}

	public WebElement LastName() {
	
	return driver.findElement(LastName);
	}

	public WebElement UserName() {
	
	return driver.findElement(UserName);
	}
	
	public WebElement Password() {
		
		return driver.findElement(Password);
	}
	
	public WebElement Register() {
		
		return driver.findElement(Register);
	}
	
	public WebElement BackToLogin() {
		
		return driver.findElement(BackToLogin);
	}
	
	
}
