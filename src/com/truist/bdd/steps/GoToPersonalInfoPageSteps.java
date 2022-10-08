package com.truist.bdd.steps;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoToPersonalInfoPageSteps extends Base{
	@Given("the url of this page is")
	public void the_url_of_this_page_is() {
		openAccountPage.getUrl();
	}

	@When("The user clicks No")
	public void the_user_clicks_no() {
		goToPersonalInfoFormPage.clickNo();
	}

	@When("the user inputs zipcode")
	public void the_user_inputs_zipcode() throws InterruptedException {
		goToPersonalInfoFormPage.inputZipcode("17057");
		
		Thread.sleep(5000);
	}
	
	@Then("The user clicks continue")
	public void the_user_clicks_continue() {
		goToPersonalInfoFormPage.clickContinue();
	}

	@Then("The subheading of the page is")
	public void the_subheading_of_the_page_is() {
		goToPersonalInfoFormPage.getSubheading2("Let's get started");
	}

}
