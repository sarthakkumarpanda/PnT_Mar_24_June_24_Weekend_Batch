package com.java.Day10_14th_Apr_2024_STRINGS;

public class Topic4_PasswordProtection {
	
	

	public static void main(String[] args) {
		
		
		String S1 = new String("Secret@123");
		System.out.println("The password is : " + S1);
		
		
		S1 = S1.concat("Donkey@1234");
		System.out.println("the updated password is : " + S1);
		
		
		
		
		//if given a chance will you save your password in a String or in a char array ?
		
		String SP = "Password";
		System.out.println("The password stored in a String format is : " + SP);
		
		char[] c = {'P', 'a', 's', 's', 'w', 'o', 'r', 'd'};
		System.out.println("The password stored in a character array format is : " + c);
		
		
	}

}
