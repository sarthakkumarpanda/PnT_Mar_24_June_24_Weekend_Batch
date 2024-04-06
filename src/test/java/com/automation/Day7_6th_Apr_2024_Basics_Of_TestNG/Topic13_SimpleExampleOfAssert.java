package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Topic13_SimpleExampleOfAssert {
	//Webpage level
	//getTitle(), getCurrentUrl, getPageSource()
	
	
	//WebElement level
	//isDisplayed, isEnabled, isSelected
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");	
	}
	
	@Test
	public void goingToLoginPage() {
		//Assert and chose getTitle and getCurrentUrl
		//System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		String expectedTitle = "Account Login";
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains(expectedTitle));
		
		String expectedCurrentUrl = "https://tutorialsninja.com/demo/index.php?route=account/login";
		String actualCurrentUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualCurrentUrl, expectedCurrentUrl);
	}
	
	@Test
	public void loginWithValidCredentials() {
		//Assert to determine the presence of email textbox and password textbox and loginbutton
	    //isEnaled and isDisplayed
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		WebElement emailTextBox = driver.findElement(By.id("input-email"));
		WebElement passwordTextBox = driver.findElement(By.id("input-password"));
		WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		//Assert.assertTrue(emailTextBox.isEnabled() && emailTextBox.isDisplayed());
		//Assert.assertTrue(passwordTextBox.isEnabled() && passwordTextBox.isDisplayed());
		//Assert.assertTrue(loginButton.isEnabled() && loginButton.isDisplayed());
		
		Assert.assertTrue(emailTextBox.isEnabled() && emailTextBox.isDisplayed()
				&& passwordTextBox.isEnabled() && passwordTextBox.isDisplayed() 
				&& loginButton.isEnabled() && loginButton.isDisplayed());
	}

}
