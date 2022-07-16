package com.osm.rough;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngTest {
	
	@Test(dataProvider="getData")
	public void validteTest(String username, String Pass){
		
	System.out.println("Username :"+ username + "password : "+ Pass);	
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data= new Object[2][2];
		data[0][0] =  "osmtest";
		data[0][1] =  "tetspass";
		data[1][0] =   "osmtest";
		data[1][1] =  "tetspass";
		
		return data;
		
		
	}
	
	

}
