package com.automation.Day2_17th_Mar_2024_Introduction_to_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstAutomationCode {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://costco.com");
		driver.quit();
		
		WebDriver driver1 = new FirefoxDriver(); //Ctrl+Shift+O
		driver1.manage().window().maximize();
		driver1.get("https://walmart.com");
		driver1.quit();
		
		WebDriver driver2 = new EdgeDriver(); //Ctrl+Shift+O
		driver2.manage().window().maximize();
		driver2.get("https://amazon.com");
		driver2.quit();

	}

}
