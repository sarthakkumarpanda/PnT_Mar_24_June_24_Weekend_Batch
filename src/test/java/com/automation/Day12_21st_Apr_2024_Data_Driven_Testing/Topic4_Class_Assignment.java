package com.automation.Day12_21st_Apr_2024_Data_Driven_Testing;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic4_Class_Assignment {
	
	public Properties prop;
	public FileInputStream ip;
	public FileInputStream ip1;
	public WebDriver driver;
	
	public Topic4_Class_Assignment() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation\\Day12_21st_Apr_2024_Data_Driven_Testing\\config_Login.properties");
		ip1 = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation\\Day12_21st_Apr_2024_Data_Driven_Testing\\config_Register.properties");
		prop.load(ip);
		prop.load(ip1);
	}
	
	
	@Test(priority=1)
	public void registerTN() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(prop.getProperty("telephone"));
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(prop.getProperty("confirmPassword"));
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	
	@Test(priority = 2)
	public void loginTn() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//1. Create 2 properties file - config_Login.properties   and   config_Register.properties
	//2. inside the respective properties files enter these data
	
	//  url = https://tutorialsninja.com/demo
	//	validEmail = seleniumpanda@gmail.com
	//	validPassword = Selenium@123
	
	
	/*
	
	 url = https://tutorialsninja.com/demo
     firstName = Selenium
     lastName = Panda
     email = seleniumpanda79@gmail.com
     telephone = 9876543210
     password = Selenium@123
     confirmPassword = Selenium@123
	 */
	
	

	 //3. Create only one class and write logic of both the properties file in one constructor
	
	//4. Create 2 @Test and write the methods of login and Register
}
