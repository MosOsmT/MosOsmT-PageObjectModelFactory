package com.osm.rough;

 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.osm.base.Page;
import com.osm.errorcollectors.ErrorCollector;
import com.osm.pages.actions.HomePage;

 

public class Testhrm extends Page {


	public static void main(String[] args) {
			
		initConfiguration();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	 
	    driver.findElement(By.id("btnLogin")).submit();
	    log.debug("successfully login");
	   /* HomePage home =PageFactory.initElements(driver, HomePage.class);
	    home.goToAdmin();*/
	    
	  List<WebElement> list=  driver.findElements(By.className("main-menu-first-level-list-item"));
	 System.out.println(list.size());
	 
	 HomePage homep=new HomePage();
	 
	 try {
		 Assert.assertEquals(homep.findtabCount(), 10);
	 }catch(Throwable e) {
		 
		 e.printStackTrace();
	 }
	
	
	  

	}
 
}
 
