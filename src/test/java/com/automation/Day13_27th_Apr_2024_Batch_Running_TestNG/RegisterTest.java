package com.automation.Day13_27th_Apr_2024_Batch_Running_TestNG;

import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();	
	}
	
	
	public String understandingDateTimeStamp() {
	Date date = new Date();
	System.out.println(date);
	String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
	System.out.println(timeStamp); 
	return "seleniumpanda" + timeStamp  + "@gmail.com";
	        
}
	
	@Test(priority=1)
	public void registerUsingAllDetails() {
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(understandingDateTimeStamp());
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(), 'Congratulations! Your new account has been successfully created!')]")).isDisplayed());
		
	}
	
	@Test(priority=2)
	public void registerUsingMandatoryDetails() {
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(understandingDateTimeStamp());
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(), 'Congratulations! Your new account has been successfully created!')]")).isDisplayed());
	}
	
	@Test(priority=3)
	public void registerUsingNodetails() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@Test(priority=4)
	public void registerUsingExistingEmail() {
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
		
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
