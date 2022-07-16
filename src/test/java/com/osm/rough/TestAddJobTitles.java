package com.osm.rough;

import org.openqa.selenium.By;

import com.osm.base.Page;
import com.osm.pages.actions.JobInfoPage;

public class TestAddJobTitles extends Page {

	public static void main(String[] args) {
		initConfiguration();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	 
	    driver.findElement(By.id("btnLogin")).submit();
	    
	    JobInfoPage jobinfo= new JobInfoPage();
	    
	    jobinfo.addJobTitles();
	    

	}

}
