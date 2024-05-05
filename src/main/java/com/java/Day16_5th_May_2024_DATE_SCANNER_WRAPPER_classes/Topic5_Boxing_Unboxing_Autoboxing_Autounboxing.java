package com.java.Day16_5th_May_2024_DATE_SCANNER_WRAPPER_classes;

public class Topic5_Boxing_Unboxing_Autoboxing_Autounboxing {
	
	/*
	 Integer
	 Long
	 Short
	 Boolean
	 Double
	 Character
	 Float
	 Byte
   */
	
	//The parent of all pre-defined Classes in java is Object Class
	//Boolean
	//Character
	
	
	public static void main(String[] args) {
		boxingExample();
		autoboxingExample();
		unboxingExample();
		autounboxingExample();
	}
	
	public static void boxingExample() {
		//What is boxing ?
		//Conversion of primitive data type to Wrapper Class Object
		//How will we convert a primitive data type to a wrapper class object ?
		int a = 100; //a is a primitive int data type
		Integer b = Integer.valueOf(a);  //here the a int data type has converted to a Wrapper Class Object b with the help of Integer.valueOf()
		System.out.println("The wrapper class object is : " + b);
	}
	
	
	public static void autoboxingExample() {
		int a = 100;
		Integer b = a;
		System.out.println("The wrapper class object is : " + b);
	}
	
	public static void unboxingExample() {
		//What is unboxing ?
	   //Conversion of  Wrapper Class Object to primitive data type
		Integer result = 100;
		int newresult = result.intValue();
	}
	
	public static void autounboxingExample() {
		//What is unboxing ?
	   //Conversion of  Wrapper Class Object to primitive data type
		Integer result = 100;
		int newresult = result;
		
	}
	
	

}
