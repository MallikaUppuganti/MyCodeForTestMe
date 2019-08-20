package cucumber_demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;

public class Mercury_Login {
	WebDriver driver;
	@Given("User has launched the application")
	public void user_has_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\Week 3\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		
	}

	@Then("User enters valid credentials")
	public void user_enters_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("userName")).sendKeys("mallika");
		driver.findElement(By .name("password")).sendKeys("mallika123");
		
	}

	@Then("user clicks on Submit")
	public void user_clicks_on_Submit() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("login")).click();
		
	}

	@Then("User verifies the login status")
	public void user_verifies_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String exp = driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).getText();
		String act = "SIGN-OFF";
		Assert.assertEquals(exp,act);
		driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
		driver.close();
		
	}

	@Given("User has launched the app of Mercury Tours")
	public void user_has_launched_the_app_of_Mercury_Tours() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\Week 3\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		
	}

	@Then("User clicks on SignUp link")
	public void user_clicks_on_SignUp_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .linkText("REGISTER")).click();
		
	}

	@When("User enters the valid data in the form")
	public void user_enters_the_valid_data_in_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("country")).sendKeys("TOGO");
		driver.findElement(By .name("email")).sendKeys("mallika1998");
		driver.findElement(By .name("password")).sendKeys("mallika1998");
		driver.findElement(By .name("confirmPassword")).sendKeys("mallika1998");
		
	}

	@When("User clicks on Submit Button available")
	public void user_clicks_on_Submit_Button_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("register")).click();
	}

	@Then("User verifies the registration status")
	public void user_verifies_the_registration_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String exp = driver.findElement(By .linkText(" sign-in ")).getText();
		String act = " sign-in ";
		
	}

}
