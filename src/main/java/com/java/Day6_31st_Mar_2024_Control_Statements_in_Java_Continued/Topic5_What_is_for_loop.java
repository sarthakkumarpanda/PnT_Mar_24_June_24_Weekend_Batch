package com.java.Day6_31st_Mar_2024_Control_Statements_in_Java_Continued;

public class Topic5_What_is_for_loop {

	public static void syntaxOfForloop() {

		/*
		 * 
		 * for(initialize ; condition ; inc/dec) {
		 * 
		 * }
		 * 
		 */
	}

	public static void print1to10() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i); // 1 2
		}
	}

	public static void print100to1() {
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
	}

	public static void printFirst100EvenNumbers() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(2 * i);
		}
	}

	public static void printFirst100EvenNumbersAndAddTheSum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println(2 * i + " ");
			sum = sum + 2 * i;
			System.out.println("Sum at every step is : " + sum);
		}

		System.out.println(sum);
	}

	public static void main(String[] args) {
		// print1to10();
		// print100to1();
		// printFirst100EvenNumbers();
		printFirst100EvenNumbersAndAddTheSum();
	}

}
