package com.sumvention.defination;

import org.junit.Assert;

import com.sumvention.PageObject.HomePage;
import com.sumvention.Utils.TestContextSetUp;

import io.cucumber.java.en.*;

public class HomePageStepDefination {

	TestContextSetUp testContextSetup;

	public HomePageStepDefination() {
//		testContextSetup = new TestContextSetUp();
	}


	public HomePageStepDefination(TestContextSetUp testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Given("User Lunch Chrome Browser")
	public void user_lunch_chrome_browser() {
		System.out.println("Step 1 : This is the chrome browser lunch	");
	}

	@When("User open url {string}")
	public void user_open_url(String url) throws InterruptedException {

		System.out.println("Step 2 : The Browser URL are = " + url);

//		Thread.sleep(7000);

	}

	@When("User enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String username, String password) throws InterruptedException {

		HomePage homePage = testContextSetup.pageObjectManager.getHomePage();
		homePage.EnterEmail(username);
		Thread.sleep(2000);
		homePage.EnterPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() {
		HomePage homePage = testContextSetup.pageObjectManager.getHomePage();
		homePage.clickOnLoginBtn();
	}

	@Then("Page Title Should Be {string}")
	public void page_title_should_be(String excepted) {
//		HomePage homePage = testContextSetup.pageObjectManager.getHomePage();
		String actual = "Dashboard / nopCommerce administration";
		if (actual.equals(excepted))
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);

	}

	@When("User click on the logout link")
	public void user_click_on_the_logout_link() {
		HomePage homePage = testContextSetup.pageObjectManager.getHomePage();
		homePage.ClickOnLogoutBtn();
	}

	@Then("Close the Browser")
	public void close_the_browser() {

		HomePage homePage = testContextSetup.pageObjectManager.getHomePage();
		homePage.driver.close();
	}

}
