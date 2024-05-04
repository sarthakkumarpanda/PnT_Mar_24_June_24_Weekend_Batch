package com.automation.Day15_4th_May_2024_Application_of_Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	public WebDriver driver;
	
	@Test
	public void validCredentials() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		HomePage homepage = new HomePage(driver); //HomePage has the data, so I created the Object of HomePage class
		homepage.clickOnMyAccountDropdown();
		homepage.clickOnLoginDropdown();
		
	

		
	}

}
