package com.osm.base;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods extends Page {
	
	public void select(WebElement locator, String value) {
		
		Select select = new Select(locator);
		select.selectByVisibleText(value);

		
	}
	
	
	public void mouseOver(WebElement locator) {
		
		 Actions actions = new Actions(driver);
		 //actions.build().perform();
		 actions.moveToElement(locator).perform();
		
	}
	

	
}
