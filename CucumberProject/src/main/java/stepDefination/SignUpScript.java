package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Utils.UtilityDriver;

public class SignUpScript {
	WebDriver driver;
	@Given("^Launch the Browser$")
	public void launch_the_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = UtilityDriver.getDriver("chrome");
		driver.get("https://www.google.com/");
	}

	@And("^Launch the WebPage$")
	public void launch_the_WebPage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://demowebshop.tricentis.com/");
		
	}

	@When("^Pass the username \"([^\"]*)\" and  password \"([^\"]*)\"$")
	public void pass_the_username_and_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("haritanair8@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abc1812");
		Thread.sleep(1000);
	
	}

	@Then("^User should Login$")
	public void user_should_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		driver.close();
	}




}
