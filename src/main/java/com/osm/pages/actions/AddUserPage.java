package com.osm.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


import com.osm.base.CommonMethods;
import com.osm.base.Page;
import com.osm.pages.locators.AddUserPageLocator;


public class AddUserPage extends Page {
	
	
	public AddUserPageLocator aduser;
	  
	  public AddUserPage() {
		  
		  this.aduser= new AddUserPageLocator();
		  AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		  PageFactory.initElements(factory, this.aduser);
	  }
	  
	  
	  public void addUserForm() {
		  HomePage hmpage =new HomePage();
		  //hmpage.goToAdmin();
		  topNav.goToAdminModule();
		  hmpage.goToUserManagement();
		  aduser.addButton.click();
		 
		  //CommonMethods cmnmethods = new CommonMethods();
		  //cmnmethods.select(aduser.userType, "ESS");
		  select(aduser.userType, "ESS");
		  aduser.employeeName.sendKeys("John Smith");
		  aduser.addusrName.sendKeys("osm12345");
		  //cmnmethods.select(aduser.userStatus, "Disabled");
		  select(aduser.userStatus, "Disabled");
		  aduser.userPass.sendKeys("osm@@1234");
		  aduser.userConfirmPass.sendKeys("osm@@1234");
		  aduser.saveButton.submit();
		  
		  
		
		  
		  
	  } 
	  
	
	

}
