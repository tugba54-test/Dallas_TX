package com.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.testbase.BaseClass;
import com.project.utils.CommonMethods;
import com.project.utils.ConfigsReader;

public class LoginPageElements extends CommonMethods {
    //Not using PageFactory, You have to extend 
	
	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(name="txtPassword")
	public WebElement password;
	
	@FindBy(css="input#btnLogin")
	public WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='divLogo']/img")
	public WebElement logo;
	
	@FindBy(id="spanMessage")
	public WebElement errorMsg;
	
	@FindBy(id="welcome")
	public WebElement logoutBtn;
	
	@FindBy(linkText="Logout")
	public WebElement logout;
	
	public LoginPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void login(String uid,String Pwd) {
		sendText(username,uid);
		sendText(password,Pwd);
		jsClick(loginBtn);
	}
	public void adminLogin() {
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		click(loginBtn);
	}
}