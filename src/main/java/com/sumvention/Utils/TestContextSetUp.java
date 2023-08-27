package com.sumvention.Utils;

import org.openqa.selenium.WebDriver;

import com.sumvention.PageObject.PageObjectManager;

public class TestContextSetUp {
	
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	
	
	
	public TestContextSetUp() {
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		
	}
	
	
	
	
	

}
