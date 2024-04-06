package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Topic8_Skipping_Being_Skipped {
	//Let's say a TestCase2 is dependent on another TestCase1
	//That TestCase1 is failing for some logical error - so technically TestCase2 will be skipped
	
	
	//But what if I still want TestCase2 to run even though it is dependent on TestCase1 which is failing
	//I do not want TestCase2 to skip. What should I do ?
	
	
	@Test(priority=1)
	public void tc1() {
		System.out.println("Hello World");
		Assert.fail();	
	}
	
	@Test(priority=2, dependsOnMethods = "tc1", alwaysRun=true)
	public void tc2() {
		System.out.println("Blue Ocean");	
	}
	
	@Test(priority=3, dependsOnMethods = {"tc1", "tc2"}, alwaysRun=true, enabled = false)
	public void tc3() {
		System.out.println("Green Grass");	
	}

}
