package com.automation.Day11_20th_Apr_2024_SoftAssert_in_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Automation {
	
	public WebDriver driver;
	
	
	@Test
	public void openApplicationAndLoginUsingAssert() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertFalse(driver.findElement(By.linkText("Logout")).isDisplayed());
		driver.findElement(By.linkText("Logout")).click();
		
		
		//you are guilty or not
		//plead guilty
		//plead not guilty 
		
		Assert.assertTrue(1 == 1);         //            true(true statement) == true
		Assert.assertFalse(1 == 1);        //            false(true statement) == false
	}
	
	@Test
	public void openApplicationAndLoginUsingSoftAssert() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		SoftAssert softassert = new SoftAssert();
		softassert.assertFalse(driver.findElement(By.linkText("Logout")).isDisplayed());
		driver.findElement(By.linkText("Logout")).click();
		softassert.assertAll();
		
	}

}
