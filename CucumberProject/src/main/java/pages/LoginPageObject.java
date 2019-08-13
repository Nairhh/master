package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	public LoginPageObject (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(className="ico-login")
	public  WebElement loginlink;
	
	@FindBy(id="Email")
	public  WebElement username;
	
	@FindBy(id="Password")
	public  WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	public WebElement loginbutton;
	
	@FindBy(linkText="Apparel & Shoes")
	public  WebElement linkclick;
	
	@FindBy(linkText="Casual Golf Belt")
	public  WebElement selectProd;
	
	@FindBy(id="add-to-cart-button-40")
	public  WebElement addtocart;
	
	@FindBy(className="ico-cart")
	public WebElement gotocart;
	
	
}
