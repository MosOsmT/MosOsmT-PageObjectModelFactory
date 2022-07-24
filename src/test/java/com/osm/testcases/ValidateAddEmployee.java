package com.osm.testcases;

import java.util.Hashtable;



import org.testng.annotations.Test;

import com.osm.base.Page;
import com.osm.pages.actions.EmployeeListPage;
import com.osm.pages.actions.LoginPage;
import com.osm.utilities.DataUtil;

public class ValidateAddEmployee extends Page {
	
	
	@Test(dataProviderClass=DataUtil.class,dataProvider="dp")
	public void validateAddEmployeeTest(Hashtable<String,String> data) {
		
		initConfiguration();
		LoginPage lgn= new LoginPage();
		lgn.doLogin();

	    log.debug("successfully login");
	    
	    EmployeeListPage adempt =new EmployeeListPage();
	    adempt.addEmployeeForm(data.get("firstName"),data.get("lastName"));
	    
	    
	}

}
