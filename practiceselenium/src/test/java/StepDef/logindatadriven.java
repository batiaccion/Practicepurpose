package StepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logindatadriven {

	@When("user has entered valid (.+)$")
	public void user_has_entered_valid_jilnosepos_gmail_com(String email) {
	    System.out.println(">>user has entered the valid email address>>"+email);
	}

	@When("User has entered valid (.+)$")
	public void user_has_entered_valid(String password) {
		System.out.println(">>user has entered the valid password >>"+password);
	}

	@When("user has clicked on login button")
	public void user_has_clicked_on_login_button() {
	    System.out.println(">>Clicked<<");
	}

	@Then("user should login successfully")
	public void user_should_login_successfully() {
		System.out.println(">>Login successfully>>");
	}

	
}
