package com.automation.Day5_30th_Mar_2024_Webpage_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic8_What_are_WebElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		WebElement searchProductBar = driver.findElement(By.name("search"));
		searchProductBar.sendKeys("HP");
		
		WebElement searchIcon = driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg"));
		searchIcon.click();
		

	}

}
