package com.osm.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {
	
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]")
	public WebElement adminTab;
	@FindBy(xpath="//*[@id=\"menu_admin_Job\"]")
	public WebElement jobTab;
	@FindBy(xpath="//*[@id=\"menu_admin_viewJobTitleList\"]")
	public WebElement jobTitleList;
	
	//*[@id="menu_admin_viewJobTitleList"]
	@FindBy(xpath="//*[@id=\"menu_pim_viewPimModule\"]")
	public WebElement pimModule;
	@FindBy(xpath="//*[@id=\"menu_pim_Configuration\"]")
	public WebElement pimConfig;
	
	@FindBy(xpath="//*[@id=\"menu_pim_configurePim\"]")
	public WebElement pimOptionalFields;
	
	@FindBy(xpath="//*[@id=\"menu_pim_listCustomFields\"]")
	public WebElement pimCustomFields;
	
	@FindBy(xpath="//a[@id='menu_pim_viewEmployeeList']")
	public WebElement pimEmployList;
	
	@FindBy(xpath="//a[@id='menu_pim_addEmployee']")
	public WebElement pimaddEmployee;
	
	
	 
	
	 

}
