package cucumber_demo1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Demo1 {
	@Given("Application is launched")
	public void application_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("Code for application launching");
	}

	@When("User enters Credentials")
	public void user_enters_Credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Code for Entry of Credentials");
	}

}
