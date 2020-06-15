package com.project.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.project.testbase.BaseClass;
import com.project.utils.CommonMethods;

public class EmployeeQualificationSkills extends CommonMethods{

	@FindBy(linkText = "Qualifications")
	public WebElement qualification;
	
	@FindBy(id="addSkill")
	public WebElement addbtn;
	
	
	@FindBy(xpath="//select[@id='skill_code']")
	public WebElement skill;
	
	@FindBy(xpath="//input[@id='skill_years_of_exp']")
	public WebElement yearsoExp;
	
	@FindBy(id="skill_comments")
	public WebElement comments;
	
	@FindBy(id="btnSkillSave")
	public WebElement svbtn;
	
	@FindBy(xpath="//a[@class='edit']")
	public WebElement skilltable;
	
	public EmployeeQualificationSkills() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void navigateSkill() {
		jsClick(qualification);
		jsClick(addbtn);
	}
	
	public void addSkill(String string,String year,String comment) {

waitForClickability(skill);
//		jsClick(empQualifyS.skill);
	selectDdValue(empQualifyS.skill, string);
	//wait(3);
	sendText(empQualifyS.yearsoExp,year);
	sendText(empQualifyS.comments,comment);
	jsClick(empQualifyS.svbtn);
	
	}
}
