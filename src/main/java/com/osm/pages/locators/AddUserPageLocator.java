package com.osm.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPageLocator {
	
	
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	public WebElement addButton;
	@FindBy(xpath="//*[@id=\"systemUser_userType\"]")
	public WebElement userType;
	@FindBy(xpath="//*[@id=\"systemUser_employeeName_empName\"]")
	public WebElement employeeName;
	@FindBy(xpath="//*[@id=\"systemUser_userName\"]")
	public WebElement addusrName;
	@FindBy(xpath="//*[@id=\"systemUser_status\"]")
	public WebElement userStatus;
	
	@FindBy(xpath="//*[@id=\"systemUser_password\"]")
	public WebElement userPass;
	@FindBy(xpath="//*[@id=\"systemUser_confirmPassword\"]")
	public WebElement userConfirmPass;
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public WebElement saveButton;
	@FindBy(xpath="//*[@id=\"frmSystemUser\"]/fieldset/ol/li[3]/span")
	public WebElement existingUser;
	
	
	
	
	
	
	
	

}
