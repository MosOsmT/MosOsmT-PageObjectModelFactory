package com.osm.testcases;

import org.testng.annotations.Test;

import com.osm.base.Page;
import com.osm.pages.actions.EmployeeListPage;
import com.osm.pages.actions.LoginPage;

public class ValidateAddEmployee extends Page {
	
	
	@Test
	public void validateAddEmployeeTest() {
		
		initConfiguration();
		LoginPage lgn= new LoginPage();
		lgn.doLogin();

	    log.debug("successfully login");
	    
	    EmployeeListPage adempt =new EmployeeListPage();
	    adempt.addEmployeeForm();
	    
	    
	}

}
