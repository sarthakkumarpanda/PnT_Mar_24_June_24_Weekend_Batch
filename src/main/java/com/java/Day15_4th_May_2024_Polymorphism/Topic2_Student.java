package com.java.Day15_4th_May_2024_Polymorphism;

public class Topic2_Student {
	
	//Method Overloading - How to achieve?
	//1. Method name should be same
	//2. Class name should be same
	//3. Parameters/arguments should be different

	public static void main(String[] args) {
		Topic2_Student student = new Topic2_Student();
		student.name();
		student.name("Hello");
		student.name("green", "blue");
		student.name(new StringBuffer("apple"));
		student.name(new StringBuilder("orange"));
		student.name(new StringBuffer("pink"), new StringBuilder("red"));

	}
	
	public void name() {
		System.out.println("this is a no argument method");
	}
	
	public void name(String S1) {
		System.out.println("this is a single argument method");
	}
	
	public void name(String S1, String S2) {
		System.out.println("this is a method which has 2 arguments/parameters");
		
	}
	
	public void name(StringBuffer S1) {
		System.out.println("This is also a single argument method with StringBuffer Class acting as the parameter");
	}
	
	public void name(StringBuilder S1) {
		System.out.println("This is also a single argument method with StringBuilder Class acting as the parameter");
	}
	
	public void name(StringBuffer S1, StringBuilder S2) {
		System.out.println("This is a method with 2 parameters - StringBuffer and StringBuilder Classes acting as the parameters");
	}
}
