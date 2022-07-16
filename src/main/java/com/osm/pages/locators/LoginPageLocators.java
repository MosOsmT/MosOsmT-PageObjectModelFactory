package com.osm.pages.locators;

 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	  
	@FindBy(xpath="//*[@id=\"txtUsername\"]")
	public WebElement userName;
	@FindBy(xpath="//*[@id=\"txtPassword\"]")
	public WebElement passWord;
	@FindBy(xpath="//*[@id=\"btnLogin\"]")
	public WebElement submitLogin;
	
	
	
	
	

}
