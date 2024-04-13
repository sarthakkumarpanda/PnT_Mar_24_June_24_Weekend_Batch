package com.automation.Day9_13th_Apr_2024_Revision_Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Doubt1_Xpaths {
	
	//SIMPLE CASES
	//if there is a unique id - no problem
	//if there is a unique (somewhat trustworthy) class value
	//if there is a unique name
	
	//MEDIUM CASES
	//dynamic id
	//too much compounded value class
	//input[@class = 'ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']
	//dynamic name
	
	//COMPLEX CASES
	//there is no id, may be there is no class, may be there is no name
	//very good xpath knowledge
	
	public WebDriver driver;
	
	
	@Test
	public void openweatherMapLogoImage() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org");
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//img[@src = '/themes/openweathermap/assets/img/logo_white_cropped.png']")).click();
		//driver.findElement(By.xpath("//*[@id=\"first-level-nav\"]/li[1]/a/img")).click();
		//driver.findElement(By.xpath("//li[@class = 'logo']/descendant::img[1]")).click();
		//driver.findElement(By.xpath("//div[@id = 'banner_android']/following-sibling::nav[@id = 'nav-website']/descendant::img[1]")).click();
		//driver.findElement(By.xpath("//i[@class = 'fa fa-angle-up backtotop']/parent::*/preceding-sibling::nav[@id = 'nav-website']/descendant::img[1]")).click();
		driver.findElement(By.xpath("//i[@class = 'fa fa-angle-up backtotop']/preceding::li[@class = 'logo']/descendant::img")).click();

	}

}
