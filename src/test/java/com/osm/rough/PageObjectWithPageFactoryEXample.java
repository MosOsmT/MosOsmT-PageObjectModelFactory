package com.osm.rough;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.osm.base.Page;

public class PageObjectWithPageFactoryEXample extends Page{
	
	
	//@FindBy(name="q")
	@FindBy(how = How.NAME, using = "q") 
	public WebElement gsearch;
	
 
	

}
