package com.java.Day16_5th_May_2024_DATE_SCANNER_WRAPPER_classes;

import java.util.Scanner;

public class Topic2_Scanner_Class {
	
	//Scanner class is a pre-defined class in java used to take user input while execution happens
	//it comes under the java.util package
	//Scanner class has a lot of in built methods - next(), nextInt(), nextLong()
	//Scanner clas also supports method chaining

	public static void main(String[] args) {
		
		//STEP 1: Create the Object of the Scanner class and pass System.in parameter in it's constructor
		
		Scanner scan = new Scanner(System.in);	
		
		//You want to enter your first name, last name, age, gender, mobilenumber
		
		System.out.println("Enter First name");
		String firstname = scan.next();
		
		System.out.println("Enter Last name");
		String lastname = scan.next();
		
		System.out.println("Enter age");
		int age = scan.nextInt();
		
		System.out.println("Enter gender");
		//Male - string or female - String
		// 'M' or 'F'
		char gender = scan.next().charAt(0);
		
		System.out.println("Enter the mobile number");
		long mobnumber = scan.nextLong();
		
		System.out.println("The first name of the person is : " + firstname);
		System.out.println("The last name of the person is : " + lastname);
		System.out.println("The age of the person is : " + age);
		System.out.println("The gender of the person is : " + gender);
		System.out.println("The mobile number of the person is : " + mobnumber);
		

	}

}
