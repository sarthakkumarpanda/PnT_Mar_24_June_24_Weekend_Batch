package com.java.Day16_5th_May_2024_super_keyword;

public class Child extends Parent{
	//1. super keyword is used to refer to immediate parent class instance variable
	//2. can be used to invoke parent class method
	//3. super() can be used to invoke parent class constructor
	
	int i=20;

	public static void main(String[] args) {
		Child child = new Child(); //this is the first logical statement which is creating the object of Child class
		child.show(100);
		Child child1 = new Child();
		
		
	}
	
	public Child() {
		super(); //this will be called first
	}
	
	void show(int i) {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.a);
		super.takeMeHome();
	}
	
	
	
	

}
