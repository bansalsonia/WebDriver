package com.wbl.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.wbl.utils.WebDriverUtils;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		driver = WebDriverUtils.getDriver("chrome");
		driver.get("https://www.walmart.com/");
		
	}
	
	@AfterClass(enabled = false)
	public void afterClass(){
		driver.close();
	}
	
	

}
