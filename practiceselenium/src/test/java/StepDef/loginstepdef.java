package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdef {

	@Given("user has launched the url")
	public void user_has_launched_the_url() {
		System.out.println("in given step");
	    
	}

	@When("user has entered credentials")
	public void user_has_entered_credentials() {
		System.out.println("in When step");
	}

	@When("user has click on login button")
	public void user_has_click_on_login_button() {
		System.out.println("in button click step");
	    
	}

	@Then("user should land to homepage")
	public void user_should_land_to_homepage() {
		System.out.println("in then step"); 
	}
	

}
