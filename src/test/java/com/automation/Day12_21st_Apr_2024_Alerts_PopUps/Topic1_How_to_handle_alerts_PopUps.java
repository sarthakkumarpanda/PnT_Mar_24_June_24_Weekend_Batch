package com.automation.Day12_21st_Apr_2024_Alerts_PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Topic1_How_to_handle_alerts_PopUps {
	
	
	public WebDriver driver;
	
	@Test
	public void loginRediffAlert() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		
		
		//now you want to enter username and password
		
		Alert alert = driver.switchTo().alert();
		
		//Alert is an interface, it is not a Class
		
		//you want to print the content inside the alert popup
		System.out.println(alert.getText());
		
		alert.accept(); //you are handling the alert
		//alert.dismiss(); //this can only be used if there is a (x) close button
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
		
		
	}
	

}
