package com.truist.bdd.steps;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenAccountSteps extends Base{

	@Given("The user is in home page")
	public void the_user_is_in_home_page() {
	  openAccountPage.getTitle();  
	}

	@Then("the user  clicks on Open Account")
	public void the_user_clicks_on_open_account() {
	  openAccountPage.clickOpenAccount();
	}

	@Then("the user  clicks on credit card")
	public void the_user_clicks_on_credit_card() {
		openAccountPage.clickCreditCard();
	}

	@Then("the user clicks on card details")
	public void the_user_clicks_on_card_details() {
		openAccountPage.clickCardDetails();
	}

	@Then("the subheading will be")
	public void the_subheading_will_be() {
		openAccountPage.getSubHeading1("Compare Truist Visa® credit cards");
	}

	@When("the user clicks Apply Now")
	public void the_user_clicks_apply_now() {
		openAccountPage.clickApplyNow();
	}

	@Then("the url of the page is")
	public void the_url_of_the_page_is() {
		openAccountPage.getTitle();
	}

	@Then("the user clicks Start")
	public void the_user_clicks_start() {
		openAccountPage.clickStart();
	}

}
