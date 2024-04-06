package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Topic2_Annotations_TestNG {
	// What do you mean by Annotations
	// With an @ symbol

	// https://testng.org/annotations.html

	// Suite - your whole test bed
	// Test - what you want to test (Functionality)
	// Class - You decide the specific logic which may have more logics inside it
	// Method - This is your individual logic
	// TestCase -
	
	//Execution Order
	//BeforeSuite > BeforeTest > BeforeClass > BeforeMethod > Test > AfterMethod > AfterClass > AfterTest > AfterSuite

	@BeforeSuite
	public void beforeSuiteLearning() {
		System.out.println("This will be printed first");
	}

	@BeforeTest
	public void beforeTestLearning() {
		System.out.println("This will be printed second");
	}

	@BeforeClass
	public void beforeClassLearning() {
		System.out.println("This will be printed third");
	}

	@BeforeMethod
	public void beforeMethodLearning() {
		System.out.println("This will be printed once before each test Case");
	}

	@Test
	public void testCase() {
		System.out.println("This is Test Case1");
	}

	@AfterMethod
	public void afterMethodLearning() {
		System.out.println("This will be printed once after each test Case");
	}

	@AfterClass
	public void afterClassLearning() {
		System.out.println("This will be printed after the AfterMethod annotation");
	}

	@AfterTest
	public void afterTestLearning() {
		System.out.println("This will be printed after the AfterClass annotation");
	}

	@AfterSuite
	public void afterSuiteLearning() {
		System.out.println("This will be printed after the AfterTest annotation");
	}

}
