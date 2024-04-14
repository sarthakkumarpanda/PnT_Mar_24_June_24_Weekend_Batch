package com.java.Da10_14th_Apr_2024_STRINGS;

public class Topic2_Memory_Locations_In_Java {
	
	/*
	 
	 There are 5 memory locations in java
	 1. Heap Memory
	 2. Stack Memory
	 3. PC Register
	 4. Method area
	 5. Native Method area
	  
	 */
	
	//Strings have been given a special place within Heap Memory. That special place is known as SCP/SLP
	//String Literal Pool  /  String Constant Pool
	
	
	public static void main(String[] args) {
		String S1 = "1234";
		String S2 = "$%^&*";
		
		//Java is Object Oriented Programming Language
		//Objects are very important
		//is by the help of new keyword
		
		String S3 = new String(); //String is a pre-defined class. 1 object will be created in the Heap Memory
		
		String S5 = new String("Python"); //2 objects will be created. 1 in the Heap Memory and 1 in the SCP/SLP memory
		
		String S4 = "Java";     //this is also a String object
	}
	
	
	public static void understandingStringsBetter() {
		
		String S1 = new String(); //1 object will be created in Heap Memory which will be referred by S1
		String S2 = new String("Java"); //2 objects will be created, 1 in Heap and 1 in SLP
		String S3 = new String("Java"); //1 object will be created
		String S4 = "Java";
		String S5 = "Java";
		String S6 = "Python"; //this is a new literal String object
		
	}

}
