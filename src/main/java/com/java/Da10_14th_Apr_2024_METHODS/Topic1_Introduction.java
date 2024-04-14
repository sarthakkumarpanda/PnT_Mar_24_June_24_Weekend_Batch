package com.java.Da10_14th_Apr_2024_METHODS;

public class Topic1_Introduction {
	
	
	//Methods are independent units of execution
	//How many types of methods are there ?
	// There are 2 types
	//1. Concrete method
	//2. Unimplemented method - a method which does not have a body

	public static void main(String[] args) {
		logicStarts();
		Topic1_Introduction.logicStarts();
		logicMidway();
		logicEndPart();
	}
	
	
	public static void logicStarts() {
		System.out.println("This is the beginning");
	}
	
	public static void logicMidway() {
		System.out.println("This is the middle");
	}
	
	public static void logicEndPart() {
		System.out.println("This is the end");
	}

}
