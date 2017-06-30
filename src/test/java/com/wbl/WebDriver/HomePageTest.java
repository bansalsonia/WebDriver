package com.wbl.WebDriver;

import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.pages.HomePage;

public class HomePageTest extends BaseTest {
	
	HomePage hm ;
	
	@Test
	public void homePageTest(){
		hm = new HomePage(driver);
		String actual = hm.search("Laptop");
		System.out.println("Title of page is - " +actual);
		Assert.assertEquals("Laptop - Walmart.com", actual);
	}
	
	

}
