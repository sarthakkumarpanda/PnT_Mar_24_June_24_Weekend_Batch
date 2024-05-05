package com.automation.Day16_5th_May_2024_TestNG_include_exclude;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void validLogin() {
		System.out.println("Login passed");
	}
	
	@Test
	public void invalidLogin() {
		System.out.println("Login failed");
	}
	
	@Test
	public void noLogin() {
		System.out.println("Login failed");
	}

}
