package com.automation.Day12_21st_Apr_2024_Data_Driven_Testing;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic3_RegisterTN_Properties_File {
	
	public Properties prop;
	public FileInputStream ip;
	public WebDriver driver;
	
	public Topic3_RegisterTN_Properties_File() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation\\Day12_21st_Apr_2024_Data_Driven_Testing\\config_Register.properties");
		prop.load(ip);
		
	}
	
	@Test
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

}
