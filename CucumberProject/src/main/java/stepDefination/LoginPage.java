package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPageObject;

public class LoginPage {
	public static WebDriver driver;

	@Given("^Navigate to homepage$")
	public void navigate_to_homepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
//		driver = new ChromeDriver();

		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		LoginPageObject po = new LoginPageObject(this.driver);
		po.loginlink.click();
		po.username.sendKeys("haritanair8@gmail.com");
		po.password.sendKeys("abc1812");
		po.loginbutton.click();
	}

	@Then("^User logged in successfully$")
	public void user_logged_in_successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User logged in successfully");

	}
	

}
