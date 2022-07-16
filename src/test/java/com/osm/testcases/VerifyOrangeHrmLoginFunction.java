package com.osm.testcases;

import org.testng.annotations.Test;

import com.osm.base.Page;
import com.osm.pages.actions.LoginPage;

public class VerifyOrangeHrmLoginFunction extends Page {
	
	
	@Test
	public void hrmLoginTest() {
		
		initConfiguration();
		LoginPage lgn= new LoginPage();
		lgn.doLogin();

	    log.debug("successfully login");
	    
	    
	    quitBrowser();
		
		
	}
	
	
	

}
