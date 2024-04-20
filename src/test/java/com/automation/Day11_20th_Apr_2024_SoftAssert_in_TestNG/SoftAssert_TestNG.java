package com.automation.Day11_20th_Apr_2024_SoftAssert_in_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_TestNG {
	//Assert - hard assert
	//SoftAssert - a predefined class in TestNG > SoftAssert 


	
	@Test
	public void logicOfAssert_vs_SoftAssert() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		Assert.assertTrue(1 == 2); //Assert will not allow any lines of code to be executed in that method once the condition becomes false
		System.out.println("The Sky is blue");
		System.out.println("The rose is pink");
		
	}
	
	@Test
	public void checkingSoftAssertions() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		
		//Create the Object of SoftAssert class
		SoftAssert softassert = new SoftAssert();
        softassert.assertTrue(1 == 2); //this condition is false

		System.out.println("The Sky is blue");
		System.out.println("The rose is pink");
		
		softassert.assertAll();
	}

}
