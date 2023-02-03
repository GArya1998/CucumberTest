package com.stepdef.in;

import org.openqa.selenium.WebDriver;

import com.Baseclass.in.BaseClassPrjct;
import com.runner.in.Runner;

import io.cucumber.java.en.*;

public class Steps extends BaseClassPrjct {
	
	public static WebDriver driver=Runner.driver;
	POM pom= new POM(driver);
	@Given("page should be launched.")
	public void page_should_be_launched() {

		getTheUrl("https://phptravels.com/demo/");
	}
	@When("user enters the Firstname in the First Name field.")
	public void user_enters_the_firstname_in_the_first_name_field() {

	enterValue(pom.getFirstname(), "Test");
	}
	@And("user enters LastName in the Last Name field.")
	public void user_enters_last_name_in_the_last_name_field() {

	enterValue(pom.getLastname(), "User");
	}
	@And("user enters Businessname in the Business Name field.")
	public void user_enters_businessname_in_the_business_name_field() {
		enterValue(pom.getBusinessname(), "TestUser");
	}
	@And("user enters email in the Email field.")
	public void user_enters_email_in_the_email_field() {
		enterValue(pom.getEmail(), "Testuser@86gmail.com");
	}
	@Then("click on Submit button.")
	public void click_on_submit_button() {

		clickOnElement(pom.getSubmit());
	}




}
