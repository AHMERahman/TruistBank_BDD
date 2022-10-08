package com.truist.bdd.steps;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalInfoFormSteps extends Base {

	@Given("The user is in personal info form page")
	public void the_user_is_in_personal_info_form_page() {
		personalInfoPage.getTitle();
	}

	@When("the user write first name {string}")
	public void the_user_write_first_name(String string) {
		personalInfoPage.inputFirstName(string);
	}

	@When("the user write last name {string}")
	public void the_user_write_last_name(String string) {
		personalInfoPage.inputLastName(string);
	}
	@Then("the user opens citizenship question")
	public void the_user_opens_citizenship_question() {
		personalInfoPage.clickSelectCitizenship();
	}

	@Then("the user selects permanent resident")
	public void the_user_selects_permanent_resident() {
		personalInfoPage.clickPermanentResident();
	}

	@Then("the user inputs dob {int}")
	public void the_user_inputs_dob(Integer int1) {
	   personalInfoPage.inputDOB(int1.toString());
	}

	@Then("the user inputs SSN {string}")
	public void the_user_inputs_ssn(String string) {
		personalInfoPage.inputSSN(string);
	}


}
