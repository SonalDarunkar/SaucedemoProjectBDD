package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMLoginPage {
   WebDriver driver;
   By txt_username = By.xpath("//input[@id='user-name']");
   By txt_password = By.xpath("//input[@id='password']");
   By txt_button = By.xpath("//input[@id='login-button']");
   By lbl_logo = By.xpath("//div[text()='Swag Labs']");
   
   
   public POMLoginPage(WebDriver driver) {
	   this.driver=driver;
   }
   
   public void enterUsername(String username) {
	   driver.findElement(txt_username).sendKeys(username);
   }
   
   public void enterPassword(String password) {
	   driver.findElement(txt_password).sendKeys(password);
   }
   
   public void clickLogin() {
	   driver.findElement(txt_button).click();;
   }
   
   public void isLogoDisplayed() {
	   driver.findElement(lbl_logo).isDisplayed();
   }
   
   public void userLogin(String username, String password) {
	   driver.findElement(txt_username).sendKeys(username);
	   driver.findElement(txt_password).sendKeys(password);
	   driver.findElement(txt_button).click();;
   }
}
