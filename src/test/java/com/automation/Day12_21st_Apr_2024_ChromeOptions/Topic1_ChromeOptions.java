package com.automation.Day12_21st_Apr_2024_ChromeOptions;

import java.util.Arrays;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Topic1_ChromeOptions {

	//you can make your coding execution faster, slower, keep the same speed
	//you can directly maximize the window
	//you can use other Arguments
	
	public WebDriver driver;
	public ChromeOptions options;
	
	
	@Test
	public String understandingDateTimeStamp() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");	
		return "seleniumpanda" + timeStamp  + "@gmail.com";
		        
	}
	
	
	@Test(priority=1, invocationCount = 1)
	public void registerTN() {
		//Step1 : Create the object of ChromeOptions class
		options = new ChromeOptions();
		//Step 2: I want to increase the speed of my execution
		options.setPageLoadStrategy(PageLoadStrategy.EAGER); //16.81 secs
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL); //24.011 secs
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		driver = new ChromeDriver(options);
		
		//driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(understandingDateTimeStamp());
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
	}
	
	@Test(priority=2)
	public void headlessMode() {
		
				options = new ChromeOptions();
				options.setPageLoadStrategy(PageLoadStrategy.EAGER); 
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
				driver.get("https://tutorialsninja.com/demo");
				driver.findElement(By.linkText("My Account")).click();
				driver.findElement(By.linkText("Register")).click();
				driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
				driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
				driver.findElement(By.cssSelector("input#input-email")).sendKeys(understandingDateTimeStamp());
				driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
				driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
				driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
				driver.findElement(By.cssSelector("input[name = agree]")).click();
				driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@AfterMethod
	public void tearDown() {
	//	driver.quit();
	}

}
