package com.osm.pages.actions;

 
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.osm.base.Page;
import com.osm.pages.locators.HomepageLocators;

public class HomePage extends Page {
	
  public HomepageLocators home;
  
  public HomePage() {
	  
	  this.home= new HomepageLocators();
	  AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
	  PageFactory.initElements(factory, this.home);
  }
  
	
	public void goToAdmin() {
		
	//home.adminTab.click();
		
		click(home.adminTab);
		
	}
	
	public void goToUserManagement() {
		
	//home.userManagementTab.click();
	//home.usersTab.click();
		
		click(home.userManagementTab);
		click(home.usersTab);

		
	}
	
	public int findtabCount() {
		
		
		return home.tabcount.size();
		
		
	}
	

	


}
