package com.osm.testcases;

import org.testng.annotations.Test;

import com.osm.base.Page;
import com.osm.pages.actions.JobInfoPage;
import com.osm.pages.actions.LoginPage;

public class ValidateAddJobTitles extends Page{
	
	@Test
	public void verifyJobTitlesadded() {
		
		initConfiguration();
		LoginPage lgn= new LoginPage();
		lgn.doLogin();
		JobInfoPage jobinfo= new JobInfoPage();
	    
	    jobinfo.addJobTitles();
		
	}

}
