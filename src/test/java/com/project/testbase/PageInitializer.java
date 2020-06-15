package com.project.testbase;

import com.project.pages.AddEmployeePageElements;
import com.project.pages.DashBoardPageElements;
import com.project.pages.DefinedPredefinedReportsPageElements;
import com.project.pages.EmployeeListPage;
import com.project.pages.EmployeeQualificationSkills;
import com.project.pages.EmployeeQualificationWorkPageElements;
import com.project.pages.LoginPageElements;
import com.project.pages.PersonalDetailsPageElements;
import com.project.pages.QualificationPageElements;
import com.project.pages.ViewEmployeePageElements;

public class PageInitializer extends BaseClass {
	public static AddEmployeePageElements addEmp;
	public static DashBoardPageElements dashboard;
	public static LoginPageElements login;
	public static PersonalDetailsPageElements pdetails;
	public static DefinedPredefinedReportsPageElements reports;
	public static ViewEmployeePageElements viewEmp;
	public static EmployeeListPage empList;
	public static QualificationPageElements qualify;
	public static EmployeeQualificationWorkPageElements empQualifyw;
	public static EmployeeQualificationSkills empQualifyS;
	
	
	public static void initialize() {
		addEmp = new AddEmployeePageElements();
		dashboard = new DashBoardPageElements();
		login = new LoginPageElements();
		pdetails = new PersonalDetailsPageElements();
		reports = new DefinedPredefinedReportsPageElements();
		viewEmp=new ViewEmployeePageElements();
		empList=new EmployeeListPage();
		qualify=new QualificationPageElements();
		empQualifyw=new EmployeeQualificationWorkPageElements();
		empQualifyS=new EmployeeQualificationSkills();
	}

}
