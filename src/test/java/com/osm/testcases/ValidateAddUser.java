package com.osm.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.osm.base.Page;
import com.osm.pages.actions.AddUserPage;
 
import com.osm.pages.actions.LoginPage;

public class ValidateAddUser extends Page {
	
	
	
	@Test
	
	public void addUserintheSystem() {
		
		initConfiguration();
		LoginPage lgn= new LoginPage();
		lgn.doLogin();

	    log.debug("successfully login");
	   
	    AddUserPage addusrPage =new AddUserPage();
	    addusrPage.addUserForm();
	  
	    quitBrowser();
		
		
	}

}
