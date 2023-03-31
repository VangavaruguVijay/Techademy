package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.base;

public class BookStore extends base {
	
	
	WebDriver driver;
	RegisterPage r=new RegisterPage(driver);
	HomePage h=new HomePage(driver);
	LoginPage l=new LoginPage(driver);
	
	@Given("URL is launched and user is on login page")
	public void url_is_launched_and_user_is_on_login_page() throws IOException {
	    
	base b=new base();
	driver=b.initializeDriver();
	driver.get(b.getUrl());
		
	}
	@When("User enters {string}, {string},{string},{string} and click on register button")
	public void user_enters_and_click_on_register_button(String firstName, String lastName, String userName, String password) {
	  
		
		r.NewUser().click();
		r.FirstName().sendKeys(firstName);
		r.LastName().sendKeys(lastName);
		r.UserName().sendKeys(userName);
		r.Password().sendKeys(password);
		r.Register().click();
		
	}

	@Then("User should be registered succesfully")
	public void user_should_be_registered_succesfully() {
	 
		String ConfirmationMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(ConfirmationMessage, "registeredsucessfully");
		driver.switchTo().alert().accept();
		
	}
	
	
	@Given("user is on register page and click on BackToLogin button")
	public void user_is_on_register_page_and_click_on_back_to_login_button() {
	   r.BackToLogin().click();
		
		
	}
	@When("User enters {string},{string} and click on login button")
	public void user_enters_and_click_on_login_button(String userName, String password) {
	    
		
		l.UserName().sendKeys(userName);
		l.Password().sendKeys(password);
		l.Login().click();
		
		
	}
	@Then("User should be logged in succesfully")
	public void user_should_be_logged_in_succesfully() {
	    
		String buttonText=h.GoToBookStore().getText();
				
		Assert.assertEquals(buttonText, "Go To Book Store");
	
		
		
	}
	
	
		
	@Given("user is on home page of book store")
	public void user_is_on_home_page_of_book_store() {
	   h.GoToBookStore().click();
	 
		
	}
	
	@When("User select a book and click on Add to collection button")
	public void User_select_a_book_and_click_on_Add_to_collection_button() {
	   h.BookSelection().click();
	   h.AddToCollection().click();
		
		
	}
	
	@Then("Book should be added to collection")
	public void Book_should_be_added_to_collection() {
		String ConfirmationMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(ConfirmationMessage, "Book added to your collection");
		driver.switchTo().alert().accept();
		
	}
	@And("User should be logged out succesfully")
	public void User_should_be_logged_out_succesfully() {
		h.Logout().click();
		driver.close();
		
	}
	
	
	

}
