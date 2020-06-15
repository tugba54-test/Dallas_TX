package com.project.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.testbase.BaseClass;
import com.project.utils.CommonMethods;

public class DashBoardPageElements extends CommonMethods {

	@FindBy(id = "welcome")
	public WebElement welcome;

	@FindBy(xpath = "//div[@id='branding']/a[1]/img")
	public WebElement logo;

	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
	public WebElement Pim;

	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmployee;

	@FindBy(id = "menu_core_viewDefinedPredefinedReports")
	public WebElement reports;

	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement empListPage;
	
	@FindBy(xpath = "div[@class='menu']/ul/li")
	public List<WebElement> dashmenu;
	
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']/b")
    public WebElement Admin;
	
	@FindBy(xpath="//a[@id='menu_admin_Qualifications']")
    public WebElement Qualification;
	
	@FindBy(xpath="//a[@id='menu_admin_viewSkills']")
	public WebElement skills;

	public DashBoardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void navigateEmpList() {
		jsClick(Pim);
		jsClick(empListPage);
	}
	public void navigateToAddEmployee() {
		jsClick(Pim);
		jsClick(addEmployee);
	}

	public void navigateToReports() {
		jsClick(Pim);
		jsClick(reports);

	}

	public void navigateToQualification() {
		jsClick(Admin);
		jsClick(Qualification);
		jsClick(skills);
	}
}
