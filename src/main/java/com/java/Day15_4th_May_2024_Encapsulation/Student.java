package com.java.Day15_4th_May_2024_Encapsulation;

public class Student {
	
	//1. Declare the variable as private [this is known as data hiding]
	//2. Design the setter and getter methods and make them as public
	
	private String name; //data hiding
	private int age; //data hiding
	
	
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getData1() {
		return name;
	}
	
	
	public int getData2() {
		return age;
	}

}
