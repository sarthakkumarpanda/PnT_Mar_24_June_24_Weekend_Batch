package com.automation.Day9_13th_Apr_2024_Revision_Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Doubt2_Assertions_Using_TestNG {

	
public WebDriver driver;
	
	@Test(enabled = true)
	public void loginTN() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login"); //what is the proof that this url is correct
		
	    Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(), 'Returning Customer')]")).isDisplayed());
	    
	    driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
	    driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
	    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	    
	    
	    String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
	    String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
	    
	    Assert.assertEquals(actualWarningMessage,expectedWarningMessage);
	   
		
		
	}
}
