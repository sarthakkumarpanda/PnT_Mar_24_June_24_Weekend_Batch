package com.java.Day11_20th_Apr_2024_CLASSES_and_OBJECTS;

public class Topic3_What_is_static {

	//static is mostly used when it is not supposed to change
	//static is closely related to Class
	//static entities can be called directly or with the name of the Class
	
	static int age; //static variable
	static String name; //nonstatic variable
	
	public static void main(String[] args) {
		test1(200, 300);
		Topic3_What_is_static.test1(500, 500);
		
		
		int age = 60;
		System.out.println(age);
		Topic3_What_is_static.age = 300;
		System.out.println(Topic3_What_is_static.age);
		
		
		String name = "Tom";
		System.out.println(name);
		Topic3_What_is_static.name = "John";
		System.out.println(Topic3_What_is_static.name);
		

	}
	
	
	public static void test1(int a, int b) {
		System.out.println("The sum of two numbers : " + (a + b));
	}

}
