package com.osm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.osm.base.Page;
import com.osm.errorcollectors.ErrorCollector;
import com.osm.pages.actions.HomePage;
import com.osm.pages.actions.LoginPage;

public class VerifyTabcountofOrangeHrm extends Page {
	
	
	@Test
	public void tabcountTest() {
		initConfiguration();
		LoginPage lgn= new LoginPage();
		lgn.doLogin();
		HomePage homep=new HomePage();
		//ErrorCollector.verifyEquals(homep.findtabCount(), 10);
		ErrorCollector.verifyEquals(homep.findtabCount(), 11);
		System.out.println("Tabcounttest");
		 quitBrowser();
	}

}
