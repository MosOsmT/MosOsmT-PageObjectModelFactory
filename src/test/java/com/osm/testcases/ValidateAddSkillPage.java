package com.osm.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.osm.base.Page;
import com.osm.pages.actions.AddSkillPage;
import com.osm.pages.actions.LoginPage;
import com.osm.utilities.DataUtil;

public class ValidateAddSkillPage extends Page{
	
	
	@Test(dataProviderClass=DataUtil.class,dataProvider="dp")
	public void validateAddSkill(Hashtable<String,String> data) {
		
		if(data.get("runmode").equalsIgnoreCase("N")){

			throw new SkipException("Skipping the test as the Run Mode is N");

			}

		initConfiguration();
		LoginPage lgn= new LoginPage();
		lgn.doLogin();
	    
	    AddSkillPage addsk= new AddSkillPage();
	    
	    addsk.addSkillFormString(data.get("skillName"),data.get("skillDesc"));
	    
	    
	    
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		Page.quitBrowser();
	}
	

}
