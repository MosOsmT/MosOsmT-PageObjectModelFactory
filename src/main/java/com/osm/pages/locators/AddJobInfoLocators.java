package com.osm.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddJobInfoLocators {
	
	
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	public WebElement jobAddTitlesButton;
	
	

	@FindBy(xpath="//*[@id=\"jobTitle_jobTitle\"]")
	public WebElement jobTitleName;
	@FindBy(xpath="//*[@id=\"jobTitle_jobDescription\"]")
	public WebElement jobTitleDesc;
	@FindBy(xpath="//*[@id=\"jobTitle_jobSpec\"]")
	public WebElement jobTitljobSpec;
	
	@FindBy(xpath="//*[@id=\"jobTitle_note\"]")
	public WebElement jobTitleNote;
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public WebElement jobTitleSaveBtn; 
	
 
	
}
