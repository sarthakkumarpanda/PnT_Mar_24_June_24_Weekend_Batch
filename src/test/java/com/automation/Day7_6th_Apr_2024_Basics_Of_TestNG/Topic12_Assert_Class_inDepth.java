package com.automation.Day7_6th_Apr_2024_Basics_Of_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Topic12_Assert_Class_inDepth {
	
	@Test
	public void login() {
		System.out.println("A is the first alphabet");
		System.out.println(1 + 2);
		System.out.println(10 + 2);
		System.out.println(11+ 2);
		Assert.assertTrue(1<2);
		System.out.println("Hello World");
		Assert.fail();   //here code will stop. Code will not go further into the other lines inside this method
		System.out.println("Learning Java");
		
		
		
	}

}
