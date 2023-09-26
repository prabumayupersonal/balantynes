package com.tcs.stepdefinition;

import com.tcs.lib.PageObjectFactory;
import com.tcs.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	private HomePage  homePage=  (HomePage) PageObjectFactory.getPage("homepage");

	@Given("a user is on the home page")
	public void aUserIsOnTheHomePage() {
		 homePage.gotoHomePage();
	}

	@When("user clcik login link")
	public void userClcikLoginLink() {

	}

	@Then("user should be navigated to login page")
	public void userShouldBeNavigatedToLoginPage() {

	}

	@Given("a user is on the login page")
	public void aUserIsOnTheLoginPage() {

	}

	@When("user enter valid information \\(email, password) {string} {string}")
	public void userEnterValidInformationEmailPassword(String string, String string2) {

	}

	@When("user click login button")
	public void userClickLoginButton() {

	}

	@Then("user should verify login successfully")
	public void userShouldVerifyLoginSuccessfully() {

	}

}
