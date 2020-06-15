package com.project.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.testbase.BaseClass;
import com.project.utils.CommonMethods;

public class EmployeeQualificationWorkPageElements extends CommonMethods{
	@FindBy(id="addWorkExperience")
	public WebElement qaddbtn;
	
	@FindBy(id="experience_employer")
	public WebElement companyname;
	
	@FindBy(id="experience_jobtitle")
	public WebElement jobTitle;
	
	@FindBy(id="experience_comments")
	public WebElement comments;
	
	@FindBy(id="experience_from_date")
	public WebElement from;
	@FindBy(xpath="'ui-datepicker-year']")
	public List<WebElement> month;
	
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-w']")
	public WebElement Prev;
	
	@FindBy(xpath="'ui-datepicker-month']")
	public List<WebElement> year;
	
	//a[@class='ui-state-default']
	@FindBy(linkText = "4")
	public WebElement day;
	
	@FindBy(id="experience_comments")
	public WebElement comment;
	
	@FindBy(id="experience_to_date")
	public WebElement to;
	
	
	
	@FindBy(id="btnWorkExpSave")
	public WebElement save;
	public EmployeeQualificationWorkPageElements () {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void AddWorkExperience(String name,String title) {
		jsClick(qaddbtn);
		sendText(companyname, name);
		sendText(jobTitle, title);
	}

}
