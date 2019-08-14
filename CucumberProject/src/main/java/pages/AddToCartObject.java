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
	
	@FindBy(xpath="//div[@id='billing-buttons-container']//input[@value='Continue']")
	public WebElement Continue1;
	
	@FindBy(xpath="//div[@id='shipping-buttons-container']//input[@value='Continue']")
	public WebElement Continue2;
	

	@FindBy(xpath="//div[@id='shipping-method-buttons-container']//input[@value='Continue']")
	public WebElement Continue3;
	
	@FindBy(id="paymentmethod_0")
	public WebElement payment;
	
	
	@FindBy(xpath="//div[@id='payment-method-buttons-container']//input[@value='Continue']")
	public WebElement Continue4;
	
	
	@FindBy(xpath="//div[@id='payment-info-buttons-container']//input[@value='Continue']")
	public WebElement Continue5;
	
	@FindBy(xpath="//input[@value='Confirm']")
	public WebElement Confirm;
			
	
	
}
