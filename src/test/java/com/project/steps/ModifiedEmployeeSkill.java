package com.project.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.project.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class ModifiedEmployeeSkill extends CommonMethods {
	@Then("user navigate employee search page")
	public void user_navigate_employee_search_page() {
		dashboard.navigateEmpList();
	}

	@Given("admin search employee {string}")
	public void admin_search_employee(String string) {
		sendText(viewEmp.EmpId,string);
		  jsClick(viewEmp.searchBtn);
		  jsClick(viewEmp.id);
		  
		  }

	@Then("modified employee {string},{string},{string}")
	public void modified_employee(String string, String year, String comment) {
		empQualifyS.addSkill(string,year,comment);
		String actual=empQualifyS.skilltable.getText();
		Assert.assertEquals("mismatch skill", string, actual);
	}


	@Given("navigate to Personal Details page and click Qualification")
	public void navigate_to_Personal_Details_page_and_click_Qualification() {
		empQualifyS.navigateSkill() ;
	}

	


}
