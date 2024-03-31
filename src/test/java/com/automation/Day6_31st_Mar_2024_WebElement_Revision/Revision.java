package com.automation.Day6_31st_Mar_2024_WebElement_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision {

	public static void main(String[] args) {

	}

	public static void anyAutomationCode() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		//I have to click on My Account. My Account (as we checked in the DOM is a link)
		driver.findElement(By.linkText("My Account")).click();
		
		WebElement myAccountDropdownLink = driver.findElement(By.linkText("My Account"));
		
		WebElement iPhone6Image = driver.findElement(By.cssSelector("div.swiper-slide.text-center.swiper-slide-active a img"));
		iPhone6Image.click();
		
		//What happens when we click on the iPhone6image?
		//it takes us to a page which has Samsung Galaxy tab and the title of the page is Samsung Galaxy Tab 10.1
		
	}
	
	public static void singinLinkOfRediff() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//driver.findElement(By.linkText("Sign in")).click(); //maybe the link did not load. Server was slow
		//What is this sign in link is misbehaving ??
		
		//camelCase form of writing
		WebElement createAccountLink = driver.findElement(By.linkText("Create Account"));
		createAccountLink.click();
	}

	public static void whatIsAWebElement() {
		// Website
		// Webpage
		// WebElement - text, images, radiobuttons, buttons, checkboxes,.........etc..
	}

}
