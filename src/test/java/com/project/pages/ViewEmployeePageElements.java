package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.testbase.BaseClass;
import com.project.utils.CommonMethods;

public class ViewEmployeePageElements extends CommonMethods{
	@FindBy(id="empsearch_employee_name_empName")
	public WebElement EmpName;
	
	@FindBy(id="empsearch_id")
	public WebElement EmpId;
	
	@FindBy(id="searchBtn")
	public WebElement searchBtn;
	
	@FindBy(id="empsearch_id")
	public WebElement RealId;
	
	@FindBy(xpath="//table[@id='resultTable']//td[2]/a")
	public WebElement id;
	
public ViewEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
		
	}

}
