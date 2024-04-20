package com.java.Day11_20th_Apr_2024_CLASSES_and_OBJECTS;

public class Topic7_Calling_static_and_NonStatic_Entities {
	
	static int age;
	String name;
	double height;
	String section;
	
	public void rulesOfCalling() {
		//static entity can call themeselves directly or with the help of Classname
		//static entity can call each other
		//non static entities can call each other
		//non static entities can also call static entities
		//non static reference variable - can call non-static entities as well as static entities[but this is not recommended]
	}

	public static void main(String[] args) {
	int age = 30;
	System.out.println(age);
	logic1();
	logic2(200, 300);
	
	Topic7_Calling_static_and_NonStatic_Entities ref = new Topic7_Calling_static_and_NonStatic_Entities();
	ref.name = "Tom";
	ref.height = 4.5;
	ref.section = "A";
	ref.test1();
	ref.test2("ABC", "XYZ");
	 ref.logic1();

	}
	
	
	public static void logic1() {
		System.out.println("this is a static method");
		
	}
	
	
	public static void logic2(int a, int b) {
		logic1();
		System.out.println("The sum is : " + (a+b));
	}
	
	
	public void test1() {
		System.out.println("This is a non-static method");
		test2("Hello", "World");
		logic1();
	}
	
	public String test2(String S1, String S2) {
		
		test1();
		String S3 = S1 + S2;
		System.out.println(S3);
		return S3;
		
	}
	

}
