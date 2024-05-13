package com.java.Day18_12th_May_2024_Exception_Handling;

public class Topic4_How_to_handle_Exceptions {

	public static void main(String[] args) {
		
		runtimeExceptionExample();
	}
	
	
	public static void runtimeExceptionExample() {
		int a=10, b = 0;
		int c = a/b;
		System.out.println(c);
	}
	
	
	public static void explanation() {
		/*
		 Step 1: The programmer will create a logical mistake. Inside a method.
		 Step 2: If the compiler is not able to interfere that means it is not a compile time exception.
		 Step 3: This method which holds the logical mistake will create an Object
		 Step 4: This object will have 3 things:  i. Name of the Exception
		                                         ii. Description of the Exception
		                                        iii. Stacktrace[which line and method names have that exception]
		 Step 5: Even though the method created the Object, it is under no position to handle the object.
		 Step 6: It will pass this Object to JVM
		 Step 7: JVM will check whether it can handle the exception. If not it will pass it to Default Exception Handler
		 Step 8: But before handling this object to DEH, jvm will abruptly terminate the program
		 Step 9: DEH will print the exception details in the output console
		 */
		
	}
	
	public static void howToHandleExceptionManually() {
		//Java gives you 5 different keywords to handle this manually
		//1. try
		//2. catch
		//3. finally
		//4. throw
		//5. throws
		
	}

}
