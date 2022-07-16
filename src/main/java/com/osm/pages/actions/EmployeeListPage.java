package com.osm.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.osm.base.Page;
import com.osm.pages.locators.AddEmployeeLocators;
 

public class EmployeeListPage extends Page {
	
	public AddEmployeeLocators ademp;
	  
	  public EmployeeListPage() {
		  
		  this.ademp= new AddEmployeeLocators();
		  AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		  PageFactory.initElements(factory, this.ademp);
	  }
	  
	  
	  public void addEmployeeForm() {
		  
		  topNav.goToPIMModule();
		  topNav.goToAddEmployee();
		  ademp.firstName.sendKeys("OSMTest");
		  ademp.lastName.sendKeys("Mtest");
		  ademp.saveButton.click();
		  
		  
		  
		  
	  }

}
