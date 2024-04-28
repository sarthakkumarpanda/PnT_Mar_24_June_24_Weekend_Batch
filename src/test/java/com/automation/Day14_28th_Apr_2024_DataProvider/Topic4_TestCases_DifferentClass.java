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
import org.testng.annotations.Test;

public class Topic4_TestCases_DifferentClass {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public ChromeOptions options;
	
	@Test(priority = 1, dataProvider  = "LOGINTN", dataProviderClass = Topic5_DataProviders_DifferentClass.class)
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
	
	@Test(priority = 2, dataProvider = "REGISTERTN", dataProviderClass = Topic5_DataProviders_DifferentClass.class)
	public void registerTN(String firstname, String lastname, String telephone, String password, String confirmpassword) {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(firstname);
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(lastname);
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(Topic3_DataProvider_with_RegisterExample.understandingDateTimeStamp());
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(telephone);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(confirmpassword);
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
