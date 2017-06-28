package com.wbl.WebDriver;

import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.pages.HomePage;

public class HomePageTest extends BaseTest {
	
	HomePage hm;
	
	@Test
	public void homePageTest(){
		hm.search("Laptop");
	}
	
	

}
