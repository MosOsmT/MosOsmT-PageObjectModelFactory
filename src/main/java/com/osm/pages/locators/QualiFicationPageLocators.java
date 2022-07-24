package com.osm.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QualiFicationPageLocators {
	
	

	@FindBy(xpath="//input[@id='skill_name']")
	public WebElement skillName;
	
	@FindBy(xpath="//textarea[@id='skill_description']")
	public WebElement skillDescription;
	
	@FindBy(xpath="//input[@id='btnSave']")
	public WebElement saveskillButton;
	@FindBy(xpath="//input[@id='btnAdd']")
	public WebElement addkillButton;
	
	

}
