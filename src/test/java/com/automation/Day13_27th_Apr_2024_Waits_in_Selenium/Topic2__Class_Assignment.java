package com.automation.Day13_27th_Apr_2024_Waits_in_Selenium;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Topic2__Class_Assignment {

	//Create one @Test
	//Write your TN registration code
	//Apply WebDriverWait for all the WebElements
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@Test(invocationCount = 5)
	public void registerTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-firstname")))).sendKeys("Selenium");
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-lastname")))).sendKeys("Panda");
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-email")))).sendKeys(understandingDateTimeStamp());
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-telephone")))).sendKeys("9876543210");
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-password")))).sendKeys("Selenium@123");
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-confirm")))).sendKeys("Selenium@123");
	    
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("agree")))).click();
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("input.btn.btn-primary")))).click();
	}
	
	@Test
	public String understandingDateTimeStamp() {
		Date date = new Date();
		System.out.println(date);
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(timeStamp); 
		
		return "seleniumpanda" + timeStamp  + "@gmail.com";
		        
	}
}
