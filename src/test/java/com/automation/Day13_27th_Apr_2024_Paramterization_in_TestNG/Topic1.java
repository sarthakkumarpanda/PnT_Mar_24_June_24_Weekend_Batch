package com.automation.Day13_27th_Apr_2024_Paramterization_in_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic1 {
	
	//Parameterization
	//by using testng.xml file
	
	//parameters - some operation with these parameters
	
	//Login logic
	//seleniumpanda@gmail.com Selenium@123
	//seleniumpanda1@gmail.com Selenium@123
	
	public WebDriver driver;
	
	@Test
	@Parameters({"url", "email", "password"})
	public void loginParamterizationConcept(String url, String email, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

}
