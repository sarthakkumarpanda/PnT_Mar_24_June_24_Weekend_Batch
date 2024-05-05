package com.java.Day16_5th_May_2024_this_keyword;

public class Use3 {
	//3. this() can be used to invoke current Class constructor

	public static void main(String[] args) {
		
	
		
		Use3 use3 = new Use3(10);
		
	}
	
	
	public Use3() { //this is also a current class constructor
		System.out.println("This is the constructor");
	}
	
	public Use3(int i) {
		this(); //this is pointing towards the constructor at row number 15
		System.out.println("This is overloaded constructor");
	}

}
