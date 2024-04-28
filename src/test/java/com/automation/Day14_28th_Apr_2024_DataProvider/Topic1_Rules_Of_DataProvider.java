package com.automation.Day14_28th_Apr_2024_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Topic1_Rules_Of_DataProvider {
	
/*
 Rules of @DataProvider
 
 Rule1 - Will return a 2-D Object Array
 Rule2 - Pass the data in rows and cols format in that 2-D Array
 Rule3 - Connect the @Test case with the @DataProvide in 2 simple ways
          i. by providing a TestNG annotation known as dataProvider = nameOfTheMethod inside the @DataProvider
          ii. by passing a TestNG annotation known as name = nameoftheMethod inside the @DataProvider
 Rule 4 - Need to parameterize the method in @Test with all the cols declared in the 2-D Array
 */
	
	@Test(dataProvider = "getData" )
	public void checking(String username, String password, String browser, int rollnumber) {
	System.out.println(username +"-----" + password + "--------" + browser + "---------" + rollnumber);	
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][4];
		
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[0][2] = "chrome";
		data[0][3] = 123;
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[1][2] = "chrome";
		data[1][3] = 124;
		
		data[2][0] = "username3";
		data[2][1] = "password3";
		data[2][2] = "chrome";
		data[2][3] = 125;
		
		return data;
		
	}

}
