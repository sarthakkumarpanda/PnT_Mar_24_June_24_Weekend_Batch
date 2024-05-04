package com.java.Day15_4th_May_2024_Abstraction_interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic1_What_is_abstraction {
	
	//Abstraction
	//Hiding internal implementation and just highlighting setup services
	
	//In java there are 2 ways to achieve abstraction
	//1. Abstract Class
	//2. Interface
	
	//inteface is 100% abstraction
	//interface is blueprint of a Class. blueprint provides a high-level overview 
	//a Class defines much more in depth
	//interface has definitions but it does not expose those definitions
	
	//variables 
	//variables inside an interface are public, static and final in nature
	//java8 - default concrete methods were allowed, static concrete methods were allowed
	//java9 - private concrete methods were allowed
	
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	//WebDriver is the interface
	//driver is the reference of WebDriver
	//ChromeDriver() is the implementing class 
	//new ChromeDriver() is the object of the implementing Class
	
	}

}
