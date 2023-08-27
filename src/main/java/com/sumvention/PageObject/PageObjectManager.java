package com.sumvention.PageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage homePage;

	public HomePage getHomePage() {
		homePage = new HomePage(driver);
		return homePage;
	}
}
