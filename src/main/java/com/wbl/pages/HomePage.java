package com.wbl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wbl.base.CommonPage;

public class HomePage extends CommonPage{

	//Page classes are dependent on driver object  and we need to inject driver to all page classes -dependency injection
	//we can use Dependency injection using constructor or by getter/setter methods
	//we are using by creating Constructor
	public HomePage(WebDriver driver) {
		super(driver);
		}
	
	public String search(String searchData){
		driver.findElement(By.id("global-search-input")).sendKeys(searchData);
		driver.findElement(By.cssSelector(".header-GlobalSearch-submit.btn")).click();
		return driver.getTitle();
	}

}
