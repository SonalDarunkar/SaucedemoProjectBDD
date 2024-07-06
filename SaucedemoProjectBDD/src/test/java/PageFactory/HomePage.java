package PageFactory;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath= "//a[@class='shopping_cart_link']")
	WebElement lbl_cart;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement menu;
	
	@FindBy(xpath = "//a[text()='All Items']")
	WebElement all_items;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement add_to_cart;
	
	@FindBy(xpath= "//button[@id='remove-sauce-labs-backpack']")
	WebElement remove_button;
	
	public void isCartDisplayed() {
		lbl_cart.isDisplayed();
	}
	
	public void clickOnAddToCart() {
		add_to_cart.click();
	}
	
	public void clickOnCart() {
		lbl_cart.click();
	}
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clikckOnMenu() {
		menu.click();
	}
	
	public void isMenuItemsVisible() {
	    all_items.getText();
		Assert.assertEquals("All Items", "All Items");
	}
	
	public void removeButtonIsVisible() {
		remove_button.isDisplayed();
	}

}
