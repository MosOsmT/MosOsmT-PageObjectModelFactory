package com.osm.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageLocators {
	
	
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]")
	public WebElement adminTab;
	@FindBy(xpath="//*[@id=\"menu_admin_UserManagement\"]")
	public WebElement userManagementTab;
	@FindBy(xpath="//*[@id=\"menu_admin_viewSystemUsers\"]")
	public WebElement usersTab;
	
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	public WebElement addButton;
	
	@FindBy(className="main-menu-first-level-list-item")
	
	public List<WebElement> tabcount;
	

}
