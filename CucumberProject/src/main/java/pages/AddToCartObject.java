package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartObject {
	
	public AddToCartObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/apparel-shoes']")
	public  WebElement linkclick;
	
	@FindBy(linkText="Casual Golf Belt")
	public  WebElement selectProd;
	
	@FindBy(id="add-to-cart-button-40")
	public  WebElement addtocart;
	
	@FindBy(className="ico-cart")
	public WebElement gotocart;
	
	@FindBy(xpath="//input[@name='itemquantity911537']")
	public WebElement changeQty;
	
	@FindBy(id="termsofservice")
	public WebElement clickcheckbox;
	
	@FindBy(id="checkout")
	public WebElement checkout;
	
	@FindBy(id="billing-address-select")
	public WebElement selectnew;
	
	@FindBy(id="BillingNewAddress_CountryId")
	public WebElement loc;
	
	@FindBy(id="BillingNewAddress_City")
	public WebElement newadd;
	
	@FindBy(id="BillingNewAddress_Address1")
	public WebElement newadd1;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	public WebElement code;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	public WebElement mob;
	
	
	
}
