package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement text_username;
	@FindBy(id="password")
	WebElement text_password;
	@FindBy(id="login-button")
	WebElement text_button;
	
	
	public void enterUsername(String username) {
		text_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		text_password.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		text_button.click();
	}
	
	
	public LoginPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
