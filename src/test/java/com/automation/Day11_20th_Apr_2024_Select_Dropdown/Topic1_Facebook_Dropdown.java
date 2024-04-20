package com.automation.Day11_20th_Apr_2024_Select_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Topic1_Facebook_Dropdown {
	
	public WebDriver driver;
	public Select select;
	
	@Test
	public void dropDownFacebook() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Selenium");	
		driver.findElement(By.name("lastname")).sendKeys("Panda");	
		driver.findElement(By.name("reg_email__")).sendKeys("seleniumpanda100@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Selenium@123");
		
		//When there is a select html tag that means - Select Class dropdown
		
		select = new Select(driver.findElement(By.id("month")));
		//this Select has 3 methods which are important for selection purpose
		//selectByVisibleText()
		//selectByValue()
		//selectByIndex()
		select.selectByVisibleText("Mar");
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("15");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1996");
	}

}
