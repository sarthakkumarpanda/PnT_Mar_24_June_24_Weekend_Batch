package com.automation.Day13_27th_Apr_2024_Paramterization_in_TestNG;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic2_ClassAssignment_TN_Register {
	public WebDriver driver;
	
	
	@Test
	public String understandingDateTimeStamp() {
	Date date = new Date();
	System.out.println(date);
	String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
	System.out.println(timeStamp); 
	return "seleniumpanda" + timeStamp  + "@gmail.com";
	        
}


@Test
@Parameters({"url", "firstname", "lastname", "telephone", "password", "confirmpassword"})
public void registerTN(String url, String firstname, String lastname, String telephone, String password, String confirmpassword) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(firstname);
	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(lastname);
	driver.findElement(By.cssSelector("input#input-email")).sendKeys(understandingDateTimeStamp());
	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(telephone);
	driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(confirmpassword);
	driver.findElement(By.cssSelector("input[name = agree]")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
}


}
