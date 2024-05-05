package com.java.Day16_5th_May_2024_this_keyword;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//3. this() can be used to invoke current Class constructor
public class Application_of_use3 {
	public WebDriver driver;

	public static void main(String[] args) {
	
		Application_of_use3 use3 = new Application_of_use3("seleniumpanda@gmail.com", "Selenium@123");
		Application_of_use3 use33 = new Application_of_use3("Selenium", "Panda", dateTimeStamp(), "9876543", "Selenium@123", "Selenium@123");
	}
	
	public static String dateTimeStamp() {
		Date date = new Date();
		String dateTimeStamp = date.toString().replace(" ", "_").replace(":", "_");
		return "seleniumpanda" + dateTimeStamp + "@gmail.com";
	}
	
	public Application_of_use3() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();	
	}
	
	public Application_of_use3(String email, String password) {
		this();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	public Application_of_use3(String firstname, String lastname, String email, String telephone, String password, String confirmpassword) {
		this();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(confirmpassword);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}

}
