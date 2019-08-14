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
		cart.Continue1.click();
		Thread.sleep(1000);
		cart.Continue2.click();
		Thread.sleep(1000);
		cart.Continue3.click();
		Thread.sleep(1000);
		cart.payment.click();
		Thread.sleep(1000);
		cart.Continue4.click();
		Thread.sleep(1000);
		cart.Continue5.click();
		Thread.sleep(1000);
		cart.Confirm.click();
	}

	@Then("^The product should be delivered to new address$")
	public void the_product_should_be_delivered_to_new_address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Product is delivered");
		driver.close();
	}

}
