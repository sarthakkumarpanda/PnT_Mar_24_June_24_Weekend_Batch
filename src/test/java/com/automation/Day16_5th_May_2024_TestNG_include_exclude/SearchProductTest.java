package com.automation.Day16_5th_May_2024_TestNG_include_exclude;

import org.testng.annotations.Test;

public class SearchProductTest {
	

	@Test
	public void validSearch() {
		System.out.println("Search passed");
	}
	
	@Test
	public void invalidSearch() {
		System.out.println("Search failed");
	}
	
	@Test
	public void noSearch() {
		System.out.println("Search failed");
	}


}
