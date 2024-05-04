package com.automation.Day15_4th_May_2024_Application_of_Abstraction;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic1_Example {
	
	@Test
	public void explaning() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().window().maximize();
		//what is manage(), what is window() and what is maximize() ???
		
		//these are abstract methods or unimplemented methods
	}

}
