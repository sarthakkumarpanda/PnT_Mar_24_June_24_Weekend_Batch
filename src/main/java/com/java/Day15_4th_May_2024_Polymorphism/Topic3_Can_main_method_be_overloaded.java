package com.java.Day15_4th_May_2024_Polymorphism;

public class Topic3_Can_main_method_be_overloaded {

	public static void main(String[] args) {
		main(20, 30);
		main(args = new String[3], args = new String[4] );

	}
	

	public static void main(String[] args1, String[] args2) {
		System.out.println("This is main method being overloaded with 2 String Arrays");
	}
	
	public static void main(int i, int j) {
		int k = i+j;
		System.out.println(k);
	}

}
