package com.automation.Day20_25th_May_2024_Dynamic_Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestive_Dropdown {
	
	public WebDriver driver;
	
	@Test
	public void makeMyTrip() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("New");
		Thread.sleep(2000);
		
		int i=0;
		while(i<4) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.DOWN);
			i++;
		}
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("toCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys("La");
		Thread.sleep(2000);
		
		int j=0;
		while(j<2) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.DOWN);
			j++;
		}
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.ENTER);
	}

}
