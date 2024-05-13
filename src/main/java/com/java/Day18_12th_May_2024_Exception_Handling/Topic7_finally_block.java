package com.java.Day18_12th_May_2024_Exception_Handling;

public class Topic7_finally_block {
	
	//1. finally block will execute no matter Exception occurs or not
	//2. You cannot use finally block alone
	//3. You can execute finally block with only try block. You can choose not to use catch block but in case there is an Exception - it will not be handled 

	//Note: try block - has the risky code
	//      catch block - has the handling code
	//      finally block - is the imposing code
	
	public static void main(String[] args) {
		example1();

	}
	
	
	public static void example1() {
		try {
			int a=10, b=0; //risky code
			int c = a/b;
		} catch (Exception e) {
			e.printStackTrace();    //handles the risky code present in try block
		}finally {
			System.out.println("I am still gonna print sum of two numbers = " + (1 + 2)); //doesn't care
		}
	}

}
