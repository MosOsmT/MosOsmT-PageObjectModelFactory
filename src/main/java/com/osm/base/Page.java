package com.osm.base;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import com.aventstack.extentreports.ExtentTest;


import com.osm.pages.actions.TopNavigation;
 




public class Page {
	
	/*
	 * WebDriver
	 * 
	 * ExcelReader
	 * Logs
	 * WebDriverWait
	 * ExtentReports
	 * 
	 * 
	 * 
	 */
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	/*public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");*/
	
	public static WebDriverWait wait;
	public static ExtentTest test;
 
	//public static String browser;
	public static TopNavigation topNav;
	
	public static void initConfiguration(){
		
		if(Constants.browser.equals("firefox")){
			
			driver = new FirefoxDriver();
			log.debug("Launching Firefox");
		}else if(Constants.browser.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver",
							System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");

			driver = new ChromeDriver(options);
		    log.debug("Launching Chrome");
			 
		} else if(Constants.browser.equals("edge")){
			
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\msedgedriver.exe");
			   driver = new EdgeDriver();
		    log.debug("Launching edge");
		}
		
		
		driver.get(Constants.testurl);
		driver.manage().window().maximize();
		
		topNav = new TopNavigation( );
	}
		
public void select(WebElement locator, String value) {
		
		Select select = new Select(locator);
		select.selectByVisibleText(value);
		test.info("Selectig value from dropdown"+value);

		
	}
	
	
	public void mouseOver(WebElement locator) {
		
		 Actions actions = new Actions(driver);
		 //actions.build().perform();
		 actions.moveToElement(locator).perform();
		 test.info("Mouse over on  :"+ locator);
	}
	public static void quitBrowser() {
		
		driver.quit();
		log.debug("Browser successfully quit");
		
	}
	
	
	
	public static void click(WebElement element) {
		
		element.click();
		log.debug("Clicking on an element : "+element);
		
		test.info("Clicking on an element : "+element);

	}
	public static void type(WebElement element, String value) {

		element.sendKeys(value);

		log.debug("Typing in an Element : "+element+" entered value as : "+value);
		
		test.info("Typing in : " + element + " entered value as " + value);
		

	}
	
	

}
