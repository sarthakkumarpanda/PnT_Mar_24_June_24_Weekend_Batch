package com.java.Da10_14th_Apr_2024_METHODS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic3_ParameterizedMethods {

	
	public static void main(String[] args) {
		addTwoNumbers(100, 200);
		booleanComparison(true, true);
		loginTN("seleniumpanda@gmail.com", "Selenium@123");
	}
	
	public static void addTwoNumbers(int i, int j) {
		System.out.println(i+j);
	}
	
	public static void booleanComparison(boolean b1, boolean b2) {
		System.out.println(b1 == b2);
	}
	
	public static void loginTN(String email, String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
}
