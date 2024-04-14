package com.automation.Day10_714h_Apr_2024_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Syntax_cssSelectors {

	// xpaths - are more popular than css in Automation
	// css is little faster than xpath
	// css cannot accommodate compounded class values in simple syntax format

	// one disadvantage in using css

	// Xpath syntax //html[@attribute = 'value']
	// css syntax html[attribute = value]

	// xpath //input[@id = 'input-email']
	// css input[id = input-email]

	// special case with cssSelectors and it is very useful and very fast
	// if there is a unique id or if there is a compounded value class
	// html#idvalue
	// html.compoundvalue1.compoundvalue2.compoundvalue3

	public WebDriver driver;

	@Test
	public void loginTNUsingCss() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input[id = input-email]")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input[id = input-password]")).sendKeys("Selenium@123");
		// driver.findElement(By.cssSelector("input[class = btn btn-primary]")).click();
		// //this is not going to work
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}
	
	
	@Test
	public void registerTNUsingCss() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda51@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
	}
	
	@Test
	public void traversingUsingCSS() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");
		driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.cssSelector("li.logo a img")).click();
		driver.findElement(By.cssSelector("li.logo>a>img")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector("div#banner_android+script+nav#nav-website>ul>li>a>img")).click();
		
	}

}
