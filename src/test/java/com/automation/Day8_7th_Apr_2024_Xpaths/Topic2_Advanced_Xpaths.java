package com.automation.Day8_7th_Apr_2024_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic2_Advanced_Xpaths {
	
	//Syntax of Xpaths
	
	//Syntax no 1 - //html[@attribute = 'valueofthatattribute']
	//Syntax no 2 - //html[@attribute1 = 'valueofthatattribute' and @attribute2 = 'valueofthatattribute']
	//Syntax no 3 - //html[@attribute1 = 'valueofthatattribute' or @attribute2 = 'valueofthatattribute']
	//Syntax no 4 - //html[text() = 'textofthelink']
	//Syntax no 5 - //html[contains(text(), 'textofthelink')]
	//Syntax no 6 - //html[contains(@attribute, 'valueoftheattribute')]
	                //input[contains(@id, 'login1')]
	//Syntax no 7 - //html[starts-with(@id, 'startingvaluewhichisfixated')]
	//Syntax no 8 - //html[ends-with(@id, 'endingvaluewhichisfixated')]
	
	
	//Advanced Xpaths [Customized Xpaths]
	
	public WebDriver driver;

	@Test
	public void loginTutorialsNinja() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		
	}

}
