package com.automation.Day5_30th_Mar_2024_Webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic9_ValidationTechniques {

	public static void main(String[] args) {
		
		//validationAtWebPageLevel();
		validationAtWebElementLevel();
	}
	
	public static void validationAtWebPageLevel() {
		/*
		 getTitle();
		 getCurrentUrl();
		 getPageSource();
		 
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rediff.com");
		
		System.out.println("The title of rediff home page is : " + driver.getTitle());
		System.out.println("The current url of rediff home page is : " + driver.getCurrentUrl());
		
		
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String actualTitle = driver.getTitle();
		
		String expectedCurrenturl = "https://www.rediff.com/";
		String actualCurrenturl = driver.getCurrentUrl();
		
		
		if(actualTitle.equals(expectedTitle) && actualCurrenturl.equals(expectedCurrenturl)) {
			driver.findElement(By.className("signin")).click();
		}else {
			System.out.println("Title mismatch");
		}
		
	}
	
	
	public static void validationAtWebElementLevel() {
		/*
		 isDisplayed();
		 isEnabled();
		 isSelected();
		 */
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rediff.com");
		
		WebElement signinLink = driver.findElement(By.linkText("Sign in"));
		if(signinLink.isDisplayed() && signinLink.isEnabled()) {
			signinLink.click();
		}else {
			System.out.println("The sign in link is not enabled or displayed");
		}
		
		WebElement usernameTextBox = driver.findElement(By.id("login1"));
		if(usernameTextBox.isDisplayed() && usernameTextBox.isEnabled()) {
			usernameTextBox.sendKeys("seleniumpanda@rediffmail.com");
		}
	}

}
