package com.sumvention.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Submention.AbstractCompnent.Abstractcomponent;

public class HomePage extends Abstractcomponent{

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//*[text()='Logout']")
	WebElement LogoutBtn;
	
	
	public void EnterEmail(String Email) {
		email.clear();
		email.sendKeys(Email);
	}
	
	
	public void EnterPassword(String Password) {
		password.clear();
		password.sendKeys(Password);
	}
	
	public void clickOnLoginBtn() {
		LoginBtn.click();
	}
	
	public void ClickOnLogoutBtn() {
		LogoutBtn.click();
	}
		

}
