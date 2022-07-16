package com.osm.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployeeLocators {
	
	
	@FindBy(xpath="//input[@id='empsearch_employee_name_empName']")
	public WebElement empName;
	
	@FindBy(xpath="//input[@id='empsearch_id']")
	public WebElement empID;
	
	@FindBy(xpath="//select[@id='empsearch_employee_status']")
	public WebElement empStatus;
	@FindBy(xpath="//input[@id='empsearch_supervisor_name']")
	public WebElement superWiserName;
	
	@FindBy(xpath="//input[@id='firstName']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement lastName;
	@FindBy(xpath="//input[@id='btnSave']")
	public WebElement saveButton;
	
	
	
	
}
