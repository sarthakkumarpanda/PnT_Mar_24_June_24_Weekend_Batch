package com.java.Day18_12th_May_2024_Exception_Handling;

public class Topic_9_throw_keyword {

	// throw keyword is basically used for Customer/ user-defined Exceptions
	// if there is a pre-defined Exception - avoid using throw keyword

	public static void main(String[] args) {
		divideByZero();
	}

	public static void divideByZero() {
		int a=10, b = 0;
		int c = a/b;
		System.out.println(c);
		throw new ArithmeticException(); //this has to be the last statement in a method
		//System.out.println("Hello World");  //unreachable code
	}

	
	/*
	 public static void filePresentOrNot() throw FileNotFoundException {
	 FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\OneDrive\\Desktop\\Logic.txt");
	 
	 }
	 */
	 


	
}
