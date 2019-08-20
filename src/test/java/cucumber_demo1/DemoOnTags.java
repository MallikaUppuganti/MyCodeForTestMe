package cucumber_demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DemoOnTags {
	WebDriver driver;
	
	@Given("Flipkart application is launched and running")
	public void flipkart_application_is_launched_and_running() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\Week 3\\SeleniumBroDrivers\\chromedriver.exe\\");
		//driver=new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		System.out.println("App Launched");
	}

	@Then("Valid Credentials are entered for login")
	public void valid_Credentials_are_entered_for_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Valid credentials are entered");
	}

	@Given("User searching the product with code")
	public void user_searching_the_product_with_code() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User dearch through code");
	}

	@Then("User able to add it to the cart")
	public void user_able_to_add_it_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Able to add to cart");
	}

	@Given("user able to see items count on cart")
	public void user_able_to_see_items_count_on_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("See items in cart");
	}

	@Then("user decides to remove an item")
	public void user_decides_to_remove_an_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Decided to remove an item");
	}

	@Given("user has active order")
	public void user_has_active_order() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Active order is seen");
	}

	@Then("user verifies the status of the order")
	public void user_verifies_the_status_of_the_order() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Verified the status of Order");
	}
	

}
