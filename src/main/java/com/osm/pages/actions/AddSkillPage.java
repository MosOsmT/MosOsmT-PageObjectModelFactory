package com.osm.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.osm.base.Page;

import com.osm.pages.locators.QualiFicationPageLocators;

public class AddSkillPage extends Page {
	
	
	public QualiFicationPageLocators adskill;
	
	public AddSkillPage() {
		  
		  this.adskill= new QualiFicationPageLocators();
		  AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		  PageFactory.initElements(factory, this.adskill);
	  }
	
	
	public void addSkillFormString(String skillName, String skillDesc) {
		
		 topNav.goToAdminModule();
		 topNav.goToQulifications();
		 adskill.addkillButton.click();
		 adskill.skillName.sendKeys(skillName);
		 adskill.skillDescription.sendKeys(skillDesc);
		 adskill.saveskillButton.click();
	}

}
