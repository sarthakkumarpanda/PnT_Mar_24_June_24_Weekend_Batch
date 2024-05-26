package com.automation.Day21_26th_May_2024_Calendar_Doubts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpiceJet {
	
	public WebDriver driver;
	
	@Test
	public void dateCheck() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid = 'to-testID-origin']")).click();
		Thread.sleep(2000);
	}

}
