package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Topic3_TriCombo {
	
	//BeforeMethod
	//Test
	//AfterMethod
	
	@BeforeMethod
	public void beforeMethodLearning() {
		System.out.println("This will be printed once before each test Case");
	}

	@Test
	public void testCase1() {
		System.out.println("This is Test Case1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("This is Test Case2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("This is Test Case3");
	}
	
	@Test
	public void testCase4() {
		System.out.println("This is Test Case4");
	}
	
	@Test
	public void testCase5() {
		System.out.println("This is Test Case5");
	}

	@AfterMethod
	public void afterMethodLearning() {
		System.out.println("This will be printed once after each test Case");
	}

}
