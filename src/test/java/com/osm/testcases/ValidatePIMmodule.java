package com.osm.testcases;

import org.testng.annotations.Test;

import com.osm.base.Page;
import com.osm.pages.actions.LoginPage;

public class ValidatePIMmodule extends Page {
	
	@Test
	public void verifyOptionalFields() {
		
		
		initConfiguration();
		LoginPage lgn= new LoginPage();
		lgn.doLogin();
		topNav.goToPIMModule();
		topNav.goToPIMCOnfiguration();
		
		topNav.goToOptionalFields();
		quitBrowser();
		
		
	}
	

}
