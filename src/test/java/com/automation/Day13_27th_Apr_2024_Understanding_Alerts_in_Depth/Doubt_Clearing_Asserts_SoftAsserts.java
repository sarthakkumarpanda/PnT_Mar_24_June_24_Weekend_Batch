package com.automation.Day13_27th_Apr_2024_Understanding_Alerts_in_Depth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Doubt_Clearing_Asserts_SoftAsserts {
	
	//Code without Assertions
	
	//Code with Assert
	
	//Code with SoftAssert
	
	//SoftWare Development and Software Testing
	
	//Test means validation / assertion / checkpoints
	
	
	//Warning: No match for E-Mail Address and/or Password.
	
	
	//Warning: Match for E-Mail Address and/or Password.
	
	//Expected outcome - is already defined in the rq. document
	//Actual outcome - can vary
	
	//Your job - is to verify the actual outcome is same with expected outcome. If not raise a defect
	
	
	public WebDriver driver;
	public SoftAssert softassert;
	
	@Test
	public void loginWithValidCredentials() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		//
		//
		//
		//
		//
		//
		//
		//
		//
		
	}

}
