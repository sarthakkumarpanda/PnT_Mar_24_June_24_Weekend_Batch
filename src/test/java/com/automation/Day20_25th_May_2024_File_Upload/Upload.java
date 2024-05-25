package com.automation.Day20_25th_May_2024_File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Upload {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&product_id=42");
			
			JavascriptExecutor js = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
			js.executeScript("window.scrollBy(0,600)");//Scroll Down to file upload button (+ve)
	
			Thread.sleep(2000);
			driver.findElement(By.id("button-upload222")).sendKeys("C:\\Users\\sarth\\OneDrive\\Desktop\\Exception_Hierarchy_in_java.png");
		}
	}


