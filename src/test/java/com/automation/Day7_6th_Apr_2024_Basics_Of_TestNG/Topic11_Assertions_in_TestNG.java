package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Topic11_Assertions_in_TestNG {
	//Assertions or Validations are essential
	//TestNG gives us 2 classes which help us in Assertions
	
	//Assert is a Class
	//Assert class has lot of methods which help us to do assertions
	//assertEquals
	//assertTrue
	//assertNotequals
	//assertFalse
	
	//SoftAssert
	
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
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	}
	
	@Test(priority=2)
	public void loginWithinvalidCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmaill.com");
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
	
	@Test(priority=4)
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
	
	@Test(priority=6)
	public void loginWithSameInvalidCredentialsAfterMultipleFailures() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmaill.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@1234567");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String expectedWarningMessage = "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		Assert.assertNotEquals(actualWarningMessage, expectedWarningMessage);
		//Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		
	}

	@AfterMethod
	public void tearDown() {
		//driver.quit();
	
	}

}
