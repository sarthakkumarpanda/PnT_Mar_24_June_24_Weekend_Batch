package com.java.Day16_5th_May_2024_DATE_SCANNER_WRAPPER_classes;

import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Topic1_Date_Class {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(dateUtility());
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(), 'Congratulations! Your new account has been successfully created!')]")).isDisplayed());
	
	}
	
	
	public static String dateUtility() {
		Date date = new Date();
		System.out.println(date); //Sun May 05 10:28:17 EDT 2024
		
		String dateTimeStamp = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(dateTimeStamp);
		
		//seleniumpanda  int    @gmail.com
		return "seleniumpanda" + dateTimeStamp + "@gmail.com";
	}

}
