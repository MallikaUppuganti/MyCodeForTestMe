package cucumber_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TestMeApp_Login {
	WebDriver driver;
	

	@Given("TestMeApp is launched")
	public void testmeapp_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\Week 3\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		
	}

	@When("User clicks on SignIn link")
	public void user_clicks_on_SignIn_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		
	}

	@Then("User enters valid Username {string}")
	public void user_enters_valid_Username(String string1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .id("userName")).sendKeys(string1);
		
	}

	@Then("User enters valid Password {string}")
	public void user_enters_valid_Password(String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .id("password")).sendKeys(string2);
		
	}

	@Then("clicks on Login button")
	public void clicks_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("Login")).click();
		
	}

	@Then("verifies the login data")
	public void verifies_the_login_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String exp = driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
		String act = "SignOut";
		Assert.assertEquals(exp,act);
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a"));
	}
	
	
	
	
}
