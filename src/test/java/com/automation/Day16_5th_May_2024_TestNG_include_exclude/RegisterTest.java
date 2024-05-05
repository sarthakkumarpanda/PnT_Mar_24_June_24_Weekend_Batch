package com.automation.Day16_5th_May_2024_TestNG_include_exclude;

import org.testng.annotations.Test;

public class RegisterTest {
	
	@Test
	public void validRegister() {
		System.out.println("Register passed");
	}
	
	@Test
	public void invalidRegister() {
		System.out.println("Register failed");
	}
	
	@Test
	public void noRegister() {
		System.out.println("Register failed");
	}


}
