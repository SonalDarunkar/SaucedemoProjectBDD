package BackgroundStepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePage;
import PageFactory.LoginPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundStepDef {
	 static WebDriver driver;
	 //LoginPageFactory login;
	  HomePage home;
	
	@Given("User is accessing saucedemo login page")
	public void user_is_accessing_saucedemo_login_page() {
		driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
				  
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

	@Then("User should be able to navigate home page")
	public void user_should_be_able_to_navigate_home_page() {
		home = new HomePage(driver);
		home.isCartDisplayed();
	    
	}

	@When("Clicks on breacrumb icon")
	public void clicks_on_breacrumb_icon() {
		home.clikckOnMenu();
	    
	}

	@Then("User should be able to see menu items")
	public void user_should_be_able_to_see_menu_items() {
		home.isMenuItemsVisible();
	    
	}

	@When("Clicks on add to cart button")
	public void clicks_on_add_to_cart_button() {
		home.clickOnAddToCart();
	    
	}

	@Then("Item should be added to the cart")
	public void item_should_be_added_to_the_cart() {
		home.clickOnCart();
		home.removeButtonIsVisible();
	    
	}





}
