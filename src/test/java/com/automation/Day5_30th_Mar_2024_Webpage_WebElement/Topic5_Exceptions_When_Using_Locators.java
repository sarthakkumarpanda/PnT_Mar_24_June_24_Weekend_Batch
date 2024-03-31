package com.automation.Day5_30th_Mar_2024_Webpage_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic5_Exceptions_When_Using_Locators {

	
	/*
	 * 
	 make sure it is unique - id and name and class
	 
	 id is unique but if it is not unique then you can ask your developer to make it unique
	 id could be dynamic
	 id = "topcontrol_202345";
	 id = "topcontrol_203434";
	 
	 if name is dynamic - do not use. Be careful
	 
	 Class - look for compounded values
	         make sure it is unique
	 
	 */
	
	public static void main(String[] args) {
		//By only supports - id, name, className
		
		
	}
	
	public static void tutorialsNinjaLogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda91@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		//driver.findElement(By.className("btn btn-primary")).click(); //Compound Classes not permitted
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();
	}
}
