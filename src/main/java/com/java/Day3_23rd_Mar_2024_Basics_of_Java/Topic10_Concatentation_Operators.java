package com.java.Day3_23rd_Mar_2024_Basics_of_Java;

public class Topic10_Concatentation_Operators {

	public static void main(String[] args) {
		//Joining
		//is represented by the + symbol
		
		
		int i = 1;
		int j = 2;
		System.out.println(i + j);
		
		char c = '1';
		char c1 = '2';
		System.out.println(c + c1);
		
		System.out.println("----------------------------------------------------------------------");
		
		String S1 = "Hello";
		String S2 = "World";
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		System.out.println(S1 + S2);
		System.out.println(a+b+S1+S2);
		System.out.println(S1+S2+a+b); //HelloWorld1020
		System.out.println(S1+S2+(a+b));
		System.out.println(a+(b+S1+S2));
	}

}
