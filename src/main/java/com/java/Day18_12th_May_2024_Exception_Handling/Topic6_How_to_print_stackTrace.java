package com.java.Day18_12th_May_2024_Exception_Handling;

public class Topic6_How_to_print_stackTrace {

	public static void main(String[] args) {
		
		try {
			int a=10, b = 0;
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace(); //this will print the ExceptionName, Description and stack trace
			System.out.println(e); //this will print the ExceptionName, Description only
			System.out.println(e.toString());//this will also print the same as above - ExceptionName, Description only
			System.out.println(e.getMessage()); //only Description
		}

	}

}
