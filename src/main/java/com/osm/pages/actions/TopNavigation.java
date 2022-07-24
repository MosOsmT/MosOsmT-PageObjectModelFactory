package com.osm.pages.actions;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.osm.base.CommonMethods;
import com.osm.base.Page;
import com.osm.pages.locators.TopNavigationLocators;

public class TopNavigation extends Page {

	public TopNavigationLocators topNavigation;

	public TopNavigation() {

		this.topNavigation = new TopNavigationLocators();

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.topNavigation);
	}

	CommonMethods cmmet = new CommonMethods();

	public void goToAdminModule() {

		topNavigation.adminTab.click();

	}

	public void goToJobModule() {

		mouseOver(topNavigation.jobTab);

		topNavigation.jobTab.click();
	}

	public void goToJobTitlesList() {

		mouseOver(topNavigation.jobTab);

		topNavigation.jobTitleList.click();
	}

	public void goToPIMModule() {

		// CommonMethods cmmet=new CommonMethods();
		boolean stas = topNavigation.pimModule.isDisplayed();
		System.out.println(stas);
		// cmmet.mouseOver(topNavigation.pimModule);
		mouseOver(topNavigation.pimModule);
		topNavigation.pimModule.click();

	}

	public void goToPIMCOnfiguration() {

		topNavigation.pimConfig.click();

	}

	public void goToOptionalFields() {

		topNavigation.pimOptionalFields.click();

	}

	public void goToCustomFields() {

		topNavigation.pimCustomFields.click();

	}
	
	public void goToEmployeeList() {
		
		topNavigation.pimEmployList.click();
	}
	public void goToAddEmployee() {
		mouseOver(topNavigation.pimaddEmployee);
		topNavigation.pimaddEmployee.click();
	}
	
	public void goToQulifications() {
		
		//mouseOver(topNavigation.qulaiFication);
		topNavigation.qulaiFication.click();
		//mouseOver(topNavigation.viewSkill);
		topNavigation.viewSkill.click();
	}

}