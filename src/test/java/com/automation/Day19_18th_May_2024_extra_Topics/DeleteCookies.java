package com.automation.Day19_18th_May_2024_extra_Topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteCookies {

	public WebDriver driver;
	
	@Test
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	}
}
