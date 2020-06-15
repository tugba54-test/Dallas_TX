package com.project.steps;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.project.pages.LoginPageElements;
import com.project.utils.CommonMethods;
import com.project.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ModifiedQualificationSteps extends CommonMethods{
	
	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
	login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));
	}

	@Then("navigated to qualification page and click add button")
	public void navigated_to_qualification_page_and_click_add_button() {
		dashboard.navigateToQualification();
		jsClick(qualify.btnAdd);
	}

	

	@Then("user modified different skills {string} and {string}")
	public void user_modified_different_skills_and(String string, String string2) {
		sendText(qualify.skillname,string);
		waitForClickability(qualify.description);
		qualify.description.sendKeys(string2,Keys.ENTER);
		
		jsClick(qualify.savbtn);
		wait(5);
		Assert.assertEquals("mismatch skill name", qualify.tname.getText(), string);
		Assert.assertEquals("mismatch description", qualify.tdescription.getText(), string2);
	}



}