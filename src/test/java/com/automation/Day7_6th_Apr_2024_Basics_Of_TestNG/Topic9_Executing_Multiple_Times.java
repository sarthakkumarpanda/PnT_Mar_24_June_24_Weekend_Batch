package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;

import org.testng.annotations.Test;

public class Topic9_Executing_Multiple_Times {
	//There are 5 test cases
	//You want TestCase4 to execute 10 times
	
	@Test(priority=1)
	public void tc1() {
		System.out.println("Hello World");
	}
	
	@Test(priority=2)
	public void tc2() {
		System.out.println("Red Roses");
	}
	
	@Test(priority=3)
	public void tc3() {
		System.out.println("Green Grass");
	}
	
	@Test(priority=4)
	public void tc4() {
		System.out.println("Green Lantern");
	}

	
	@Test(priority=5)
	public void tc5() {
		System.out.println("Yellow Roses");
	}

}
