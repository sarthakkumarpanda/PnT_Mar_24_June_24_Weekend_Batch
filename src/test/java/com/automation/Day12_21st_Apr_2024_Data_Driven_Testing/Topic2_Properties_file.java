package com.automation.Day12_21st_Apr_2024_Data_Driven_Testing;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Topic2_Properties_file {
	
	//it is very important in terms of automation
	// nameofthefile.properties 
	
	//you save certain data in the properties file in the form of key = value
	//you have to find the path of the properties file[wherever it is saved]
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	public SoftAssert softassert;
	
	public Topic2_Properties_file() throws Exception {
		//Step 1: Create a Constructor
		//Step 2: Create the Object of Properties Class
		prop = new Properties();
		
		//Step 3: Create the object of FileInputStream Class and pass the path of the properties file inside the constructor of this FileInputStream
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation\\Day12_21st_Apr_2024_Data_Driven_Testing\\config_Login.properties");
		
		//Step 4: Load the properties file
		prop.load(ip);
		
	}
	
	@Test
	public void loginTn() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		softassert.assertAll();
		
	}
	
	@Test
	public void userDirectoryCheck() {
		System.out.println(System.getProperty("user.dir"));
	}
	

}
