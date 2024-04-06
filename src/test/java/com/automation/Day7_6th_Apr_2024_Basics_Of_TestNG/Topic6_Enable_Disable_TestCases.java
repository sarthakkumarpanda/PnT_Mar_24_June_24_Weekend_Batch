package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Topic6_Enable_Disable_TestCases {
	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	}

	@Test(priority=1)
	public void loginWithValidCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("This is what I expect to Execute 1st");
	}
	
	@Test(priority=2)
	public void loginWithinvalidCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmaill.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@1234567");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("This is what I expect to Execute 2nd");
	}
	
	@Test(priority=3)
	public void loginWithValidEmailInvalidPassword() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("This is what I expect to Execute 3rd");
	}
	
	@Test(priority=4, enabled = false)
	public void loginWithInvalidEmailValidPassword() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmaill.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("This is what I expect to Execute 4th");
	}
	
	@Test(priority=5)
	public void loginWithNoCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("This is what I expect to Execute 5th");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}


}
