package com.sumvention.Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public WebDriver driver;
	
	
	public WebDriver WebDriverManager() {
		
		String browser="chrome";
		
		if(driver == null) {
			if(browser.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver=new ChromeDriver(options);
			}
			
			assert driver != null;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://admin-demo.nopcommerce.com/login");
		}
		
		return driver;
		
	}

}
