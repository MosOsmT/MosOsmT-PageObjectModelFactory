package com.osm.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.osm.base.Page;
import com.osm.pages.locators.AddJobInfoLocators;



public class JobInfoPage extends Page{
	
	public AddJobInfoLocators jobinfo;
	
	
	public JobInfoPage() {
		
		this.jobinfo= new AddJobInfoLocators();
		  AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		  PageFactory.initElements(factory, this.jobinfo);
	}
	
	public void addJobTitles() {
		
		topNav.goToAdminModule();
		topNav.goToJobModule();
		topNav.goToJobTitlesList();
		jobinfo.jobAddTitlesButton.click();
		jobinfo.jobTitleName.sendKeys("Testname");
		jobinfo.jobTitleDesc.sendKeys("Testdescrrption");
		//jobinfo.jobTitljobSpec.sendKeys("F://Java_Workspace//PageobjectWithFactories//src//test//resources//testData//JobSpec.docx");
		jobinfo.jobTitljobSpec.sendKeys(System.getProperty("user.dir")+"//src//test//resources//testData//JobSpec.docx");
		log.debug("Susessfully uploaded file");
		jobinfo.jobTitleNote.sendKeys("sucessfully added");
		jobinfo.jobTitleSaveBtn.click();
	
	}

}
