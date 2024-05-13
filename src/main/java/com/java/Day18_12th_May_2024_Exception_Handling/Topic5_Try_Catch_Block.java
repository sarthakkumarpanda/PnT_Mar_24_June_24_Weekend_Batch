package com.java.Day18_12th_May_2024_Exception_Handling;

public class Topic5_Try_Catch_Block {

	public static void main(String[] args) {
		example3_TryingToUseTryCatchBlockWithoutARiskyCode();
		example2();
		example1();
		
		//multiple try catch block - HomeWork

	}
	
	
	public static void example1() {
		try {
			int a=10, b = 0;
			int c = a/b; //risky code
			System.out.println(c);
		} catch (ArithmeticException e) {
			try {
				int a=10, b = 0;
				int c = a/b;
				System.out.println(c);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
			System.out.println("This exception is being handled");
			System.out.println(10 + 20);
		}
	}
	
	
	public static void example2() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		try {
			System.out.println(5/0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
	}
	
	public static void example3_TryingToUseTryCatchBlockWithoutARiskyCode() {
		try {
			int a=10, b = 2;
			int c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
