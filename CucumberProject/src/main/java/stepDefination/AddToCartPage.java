package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddToCartObject;
import pages.LoginPageObject;

public class AddToCartPage {
	public static WebDriver driver;
	AddToCartObject cart;

	@Given("^User is already registered$")
	public void user_is_already_registered() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is already registered");
	}

	@Given("^Add product to cart$")
	public void add_product_to_cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = LoginPage.driver;
		cart = new AddToCartObject(driver);
		cart.linkclick.click();
		cart.selectProd.click();
		cart.addtocart.click();
		cart.gotocart.click();

	}

	@When("^User increases the product quantity by (\\d+)$")
	public void user_increases_the_product_quantity_by(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		cart.changeQty.clear();
		Thread.sleep(1000);
		cart.changeQty.sendKeys("2");

	}

	@When("^Continue for checkout$")
	public void continue_for_checkout() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		cart.clickcheckbox.click();
		cart.checkout.click();
	}

	@When("^Change the shipping address to new address$")
	public void change_the_shipping_address_to_new_address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Select dropdown = new Select(cart.selectnew);
		dropdown.selectByVisibleText("New Address");
		Thread.sleep(1000);
		Select selectloc = new Select(cart.loc);
		selectloc.selectByVisibleText("India");
		
		cart.newadd.sendKeys("Pune");
		cart.newadd1.sendKeys("Magarpatta");
		cart.code.sendKeys("440010");
		cart.mob.sendKeys("9734219038");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@id='billing-buttons-container']//input[@value='Continue']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@id='shipping-buttons-container']//input[@value='Continue']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("shippingoption_0")).click();
//		driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']//input[@value='Continue']"))
//				.click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("paymentmethod_0")).click();
//		driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']//input[@value='Continue']")).click();
////		  Thread.sleep(1000);
////		  driver.findElement(By.id("CardholderName")).sendKeys("Barbara Gordon");
////		  driver.findElement(By.id("CardNumber")).sendKeys("4485564059489345");
////		  Select dropdown1 = new Select(driver.findElement(By.id("ExpireMonth")));
////		  dropdown1.selectByVisibleText("04");
////		  Select dropdown2 = new Select(driver.findElement(By.id("ExpireYear")));
////		  dropdown2.selectByVisibleText("2020");
////		  driver.findElement(By.id("CardCode")).sendKeys("123");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']//input[@value='Continue']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']//input[@value='Continue']")).click();
//		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
//		Thread.sleep(2000);
	}

	@Then("^The product should be delivered to new address$")
	public void the_product_should_be_delivered_to_new_address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

}
