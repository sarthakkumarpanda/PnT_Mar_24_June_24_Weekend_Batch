package com.automation.Day14_28th_Apr_2024_DataProvider;

import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Topic3_DataProvider_with_RegisterExample {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test(dataProvider = "registerDataForTutorialsNinja")
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
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(understandingDateTimeStamp());
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(telephone);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(confirmpassword);
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	
	public static String understandingDateTimeStamp() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(timeStamp); 
		return "seleniumpanda" + timeStamp  + "@gmail.com";
		        
	}
	
	
	
	@DataProvider
	public Object[][] registerDataForTutorialsNinja() {
		Object[][] registerData = { {"Selenium", "Panda", "1234567", "Selenium@123", "Selenium@123"},
				                    {"Selenium", "Panda", "1234567", "Selenium@123", "Selenium@123"},
				                    {"Selenium", "Panda", "1234567", "Selenium@123", "Selenium@123"},
				                    {"Selenium", "Panda", "1234567", "Selenium@123", "Selenium@123"},
				                    {"Selenium", "Panda", "1234567", "Selenium@123", "Selenium@123"}};
		
		return registerData;
				
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
