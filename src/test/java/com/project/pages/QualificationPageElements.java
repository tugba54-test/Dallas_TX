package com.project.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.testbase.BaseClass;

public class QualificationPageElements {
	
	
	
	@FindBy(id="btnAdd")
	public WebElement btnAdd;
	
	@FindBy(id="skill_name")
	public WebElement skillname;
	
	@FindBy(xpath="//textarea[@id='skill_description']")
	public WebElement description;
	
	@FindBy(id="btnSave")
	public WebElement savbtn;
	
	//*[@id="recordsListTable"]/tbody/tr[1]/td[2]/a
	@FindBy(xpath="//*[@id=\"recordsListTable\"]/tbody/tr[1]/td[2]/a")
	public WebElement tname;
	
	@FindBy(xpath="//table[@id='recordsListTable']//td/a")
	public List<WebElement> tnames;
	
	@FindBy(linkText="Friendly")
	public WebElement Friend;
	
	//*[@id="recordsListTable"]/tbody/tr[2]/td[3]
	@FindBy(xpath="//table[@id='recordsListTable']//td[3]")
	public WebElement tdescription;		
	
	public QualificationPageElements() {
		PageFactory.initElements(BaseClass.driver,this);
	}
}
