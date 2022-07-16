package com.osm.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.osm.base.Page;
import com.osm.pages.locators.LoginPageLocators;

public class LoginPage extends Page{
	
	public LoginPageLocators login;
	
	
	public LoginPage() {
		
		this.login= new LoginPageLocators();
		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		
		PageFactory.initElements(factory, this.login);
		
	}
	
	public void doLogin() {
		/*
		login.userName.sendKeys("Admin");
		login.passWord.sendKeys("admin123");
		login.submitLogin.click();*/
		
	
		type(login.userName,"Admin");
		type(login.passWord,"admin123");
		click(login.submitLogin);
	}
	

}
