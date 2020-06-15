package com.project.pages;

import java.awt.RenderingHints.Key;

import org.junit.FixMethodOrder;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.testbase.BaseClass;
import com.project.utils.CommonMethods;

public class EmployeeListPage extends CommonMethods{
	
	@FindBy(id="empsearch_employee_name_empName")
	public WebElement Empname;
	
	@FindBy(xpath="//input[@name='empsearch[id]']")
	public WebElement EmpidS;
	
	@FindBy(id="searchBtn")
	public WebElement search;
	
	@FindBy(xpath="//table[@id='resultTable']//td[2]")
	public WebElement Fid;
	
	public void EmployeeListPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void SearchId(String id) {
		waitForClickability(EmpidS);
		getWaitObject();
		EmpidS.sendKeys(id,Keys.ENTER);
		getWaitObject();
		wait(5);
		jsClick(search);
		getWaitObject();
		wait(5);
		jsClick(Fid);
	}
	
}
