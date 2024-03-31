package com.java.Day6_31st_Mar_2024_Control_Statements_in_Java_Continued;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Topic3_What_is_Switch {
	
	public static void whatIsSwitch() {
		//switch statement is a multiway branch statement
		//switch statement defines multiple paths of execution of a program
		//switch statemtns provides better alternative than a large series of if-else statements
	}
	

	public static void main(String[] args) {
		//decideWhichBrowser();
		whichDigitDenotesWhichMonth();
	}
	
	public static void determineVowelAmong26Alphabets() {
		//homework using switch statement
		//a, e, i, o , u
	}
	
	public static void whichDigitDenotesWhichMonth() {
		int month = 13; //July
		String monthName = "";
		
		switch(month) {
		
		case 1: monthName="1 - January";
		break;
		
		case 2: monthName="2 - February";
		break;
		
		case 3: monthName="3 - March";
		break;
		
		case 4: monthName="4 - April";
		break;
		
		case 5: monthName="5 - May";
		break;
		
		case 6: monthName="6 - June";
		break;
		
		case 7: monthName=" 7 - July";
		break;
		
		case 8: monthName=" 8 - Aug";
		break;
		
		case 9: monthName=" 9 - Sep";
		break;
		
		case 10: monthName=" 10 - Oct";
		break;
		
		case 11: monthName=" 11 - Nov";
		break;
		
		case 12: monthName=" 12 - Dec";
		break;
		
		default: System.out.println("Invalid month number value");
		}
		//Print the month
		System.out.println(monthName);
	}
	
	
	public static void decideWhichBrowser() {
		//the variable to be tested
		//this variable could be an int, String, char, etc.
		
		
		switch("Decide which browser to be configured for my Automation")  //intent
		{
		
		case "Chrome":
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com");
			break;
	
		case "Firefox":
			WebDriver driver1 = new FirefoxDriver();
			driver1.manage().window().maximize();
			driver1.get("https://amazon.com");
			break;
		
		case "Edge":
			WebDriver driver2 = new EdgeDriver();
			driver2.manage().window().maximize();
			driver2.get("https://costco.com");
			break;
			
		case "InternetExplorer":
			WebDriver driver3 = new InternetExplorerDriver();
			driver3.manage().window().maximize();
			driver3.get("https://flipkart.com");
			break;
		
	    default:
	    	WebDriver driver4 = new SafariDriver();
			driver4.manage().window().maximize();
			driver4.get("https://yahoo.com");
			break;
		
		}
	}

}
