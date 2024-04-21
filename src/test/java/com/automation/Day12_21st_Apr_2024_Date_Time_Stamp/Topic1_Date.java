package com.automation.Day12_21st_Apr_2024_Date_Time_Stamp;

import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic1_Date {
	public WebDriver driver;

	@Test
	public String understandingDateTimeStamp() {
		Date date = new Date();
		System.out.println(date);
		//when there are multiple String operations
		//first remove the space with underscore, then remove the : with underscore
		
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(timeStamp); // Sun_Apr_21_13_54_57_EDT_2024
		
		return "seleniumpanda" + timeStamp  + "@gmail.com";
		        
	}
	
	
	@Test(invocationCount = 10)
	public void registerTN() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
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

}
