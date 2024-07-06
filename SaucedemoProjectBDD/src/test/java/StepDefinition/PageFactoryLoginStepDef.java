package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePage;
import PageFactory.LoginPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageFactoryLoginStepDef {
	
	
	  static WebDriver driver;
	  LoginPageFactory login;
	  HomePage home;
	  
	  @Given("User is on login page") public void user_is_on_login_page() { driver=
	  new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.saucedemo.com/");
	  
	  }
	  
	  @When("User enters valid {string} and {string}")
	  public void user_enters_valid_and(String username, String password) 
	  {
	       login = new LoginPageFactory(driver);
	       login.enterUsername(username);
	       login.enterPassword(password);
	  
	  
	  }
	  
	  @And("Clicks on login page button") 
	  public void clicks_on_login_page_button()
	  { driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  login.clickOnLoginButton();
	  
	  }
	  
	  @Then("User is navigate to homepage") 
	  public void user_is_navigate_to_homepage() { 
		  home = new HomePage(driver);
		  home.isCartDisplayed();
	  }
	  
	  @And("Close the browser") 
	  public void close_the_browser() { 
		  //driver.close();
		  driver.quit();
	  
	  }
	 
	 
}
