package com.java.Day18_12th_May_2024_Exception_Handling;

public final class Topic8_final_vs_finally_finalize {

	public static void main(String[] args) {
		int i = 10;
		i = 20;
		System.out.println(i); //20
		
		final int j = 1;
	}
	
	//final is a keyword in java
	//final can be used with a variable, method, class
	//final variable cannot be changed
	//final method cannot be over-ridden
	//final class cannot be extended
	
	
	//finally is a block
	//it can work with try block
	//it can work with try-catch block
	//it cannot work independently
	//it cannot work only with catch block
	//finally block mostly handles clean up code
	
	public static void example1() {
		try{
		int a=10, b=0;
		int c = a/b;
		}catch (Exception e) {
			e.printStackTrace(); 	
		}finally {
			System.out.println("The above code is bad");
		}
	}
	
	//finalize() is a method used for overriding an Object
	
	public void finalize() {
		
	}

}
