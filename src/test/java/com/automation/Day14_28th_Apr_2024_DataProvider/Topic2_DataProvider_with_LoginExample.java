package com.automation.Day14_28th_Apr_2024_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Topic2_DataProvider_with_LoginExample {
	
	//You have 25 usernames and passwords out of which 1 combination is wrong. Determine that wrong combo

	
	public WebDriver driver;
	public WebDriverWait wait;
	public ChromeOptions options;
	
	@Test(dataProvider = "loginDataTutoruialsNinja")
	public void loginTest(String email, String password) {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Logout"))));
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	
	@DataProvider
	public Object[][] loginDataTutoruialsNinja() {
		
		Object[][] loginData = { {"seleniumpanda@gmail.com", "Selenium@123"},
				{"seleniumpanda1@gmail.com", "Selenium@123"},
				{"seleniumpanda2@gmail.com", "Selenium@123"},
				{"seleniumpanda3@gmail.com", "Selenium@123"},
				{"seleniumpanda4@gmail.com", "Selenium@123"},
				{"seleniumpand5@gmail.com", "Selenium@123456"},
				{"seleniumpanda6@gmail.com", "Selenium@123"},
				{"seleniumpanda7@gmail.com", "Selenium@123"},
				{"seleniumpanda8@gmail.com", "Selenium@123"},
				{"seleniumpanda9@gmail.com", "Selenium@123"},
				{"seleniumpanda10@gmail.com", "Selenium@123"},
				{"seleniumpanda11@gmail.com", "Selenium@123"},
				{"seleniumpanda12@gmail.com", "Selenium@123"},
				{"seleniumpanda13@gmail.com", "Selenium@123"},
				{"seleniumpanda14@gmail.com", "Selenium@123"},
				{"seleniumpanda15@gmail.com", "Selenium@123"},
				{"seleniumpanda16@gmail.com", "Selenium@123"},
				{"seleniumpanda17@gmail.com", "Selenium@123"},
				{"seleniumpanda18@gmail.com", "Selenium@123"},
				{"seleniumpanda19@gmail.com", "Selenium@123"},
				{"seleniumpanda20@gmail.com", "Selenium@123"},
				{"seleniumpanda21@gmail.com", "Selenium@123"},
				{"seleniumpanda22@gmail.com", "Selenium@123"},
				{"seleniumpanda23@gmail.com", "Selenium@123"},
				{"seleniumpanda24@gmail.com", "Selenium@123"}};
		
		return loginData;
				
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}

