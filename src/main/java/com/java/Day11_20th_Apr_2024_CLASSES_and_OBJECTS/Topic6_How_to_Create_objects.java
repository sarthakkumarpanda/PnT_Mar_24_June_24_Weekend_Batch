package com.java.Day11_20th_Apr_2024_CLASSES_and_OBJECTS;

public class Topic6_How_to_Create_objects {
	/*
	 
	 1. new keyword [99.99% we will be using]
	 2. newInstance() method
	 3. clone() method
	 4. Deserialization
	 5. factory methods
	 
	 */
	
	String name;
	static int age;
	
	
	public static void main(String[] args) {
		
		Topic6_How_to_Create_objects referencevariable = new Topic6_How_to_Create_objects();
		Topic6_How_to_Create_objects referencevariable1 = new Topic6_How_to_Create_objects();
		Topic6_How_to_Create_objects referencevariable2 = new Topic6_How_to_Create_objects();
		Topic6_How_to_Create_objects referencevariable3 = new Topic6_How_to_Create_objects();
		Topic6_How_to_Create_objects referencevariable4 = new Topic6_How_to_Create_objects();
		Topic6_How_to_Create_objects referencevariable5 = new Topic6_How_to_Create_objects();
		
		// new Topic6_How_to_Create_objects() is the object
		//referencevariable - this is just a reference variable which points to the object
		//Topic6_How_to_Create_objects - name of the Class
		
		referencevariable.test();
		referencevariable.name = "Hello";
		
		referencevariable.age = 30;
	}
	
	
	public void test() {
		System.out.println("I am learning Objects in java");
	}

}
