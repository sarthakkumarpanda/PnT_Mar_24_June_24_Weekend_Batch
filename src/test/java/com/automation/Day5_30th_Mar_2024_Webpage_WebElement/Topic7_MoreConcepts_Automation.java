package com.automation.Day5_30th_Mar_2024_Webpage_WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic7_MoreConcepts_Automation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); //this one will open a Chrome Browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rediff.com");
		//what if you want to open a new tab and in that new tab you want another website
		//what if you want to open a new window and in that window you want another website
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://amazon.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://costco.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://flipkart.com");
		driver.quit(); //will close all the browsers - this is more recommended
		//driver.close(); //will close the current active instance of the chrome browser
	}
	
	

}
