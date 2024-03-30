package com.automation.Day5_30th_Mar_2024_Webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic2_Introduction_to_TutorialsNinja {
	
	public static void main(String[] args) {
		loginTutorialsNinja();
	}
	
	public static void loginTutorialsNinja() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
	}

}
