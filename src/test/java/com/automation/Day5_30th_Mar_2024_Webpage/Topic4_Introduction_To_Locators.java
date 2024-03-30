package com.automation.Day5_30th_Mar_2024_Webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic4_Introduction_To_Locators {
	/*
	 In Selenium3 there are 11 locators
	 In Selenium4 there are 16 locators
	 Most widely used 8 locators are
	 id
	 class
	 name
	 xpath
	 cssSelector
	 linkText
	 partiallinkText
	 tagname
	
	*/
	
	public static void main(String[] args) {
		tutorialsNinjaRegister();
		tutorialsNinjaLogin();
		//rediffSignIn();
	}
	
	
	public static void tutorialsNinjaRegister() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("Panda");
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda91@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
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
	
	public static void rediffSignIn() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.name("proceed")).click();
		
	}

}
