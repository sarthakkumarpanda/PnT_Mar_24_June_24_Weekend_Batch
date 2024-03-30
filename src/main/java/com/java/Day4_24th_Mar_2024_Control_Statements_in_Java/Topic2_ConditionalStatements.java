package com.java.Day4_24th_Mar_2024_Control_Statements_in_Java;

public class Topic2_ConditionalStatements {

	public static void main(String[] args) {
		// ifStatement();
		// firstIfStatementAssignment();
		// secondAssignmentIfStatement();
		determineLeapYear();
	}

	public static void ifStatement() {
		// you type the if(condition)
		// if the condition is true then control will go inside the body of the if block
		// if the condition is false then control will not go inside the body of the if
		// block
		// then else block will come to help

		if (2 < 3) {
			System.out.println("Hello World");
			// this has some code in this body
		} else {
			System.out.println("I think the if condition is not true so let me handle this");
		}

	}

	public static void firstIfStatementAssignment() {
		int i = 10;
		int j = 20;
		int k = 30;
		// Find out the largest number using if and else
		if (i > j && i > k) { // here proved i is not the greatest
			System.out.println("i is the greatest number : " + i);
		} else if (j > i && j > k) {// here it is proved j is not the greatest
			System.out.println("j is the greatest number : " + j);
		} else {
			System.out.println("k is the greatest : " + k);
		}

	}

	public static void secondAssignmentIfStatement() {
		long i = 404345345;
		long j = 406756755;
		long k = 404355453;
		long l = 404545454;

		// find the smallest number
		if (i < j && i < k && i < l) {
			System.out.println("i is the smallest : " + i);
		} else if (j < i && j < k && j < l) {
			System.out.println("j is the smallest : " + j);
		} else if (k < i && k < j && k < l) {
			System.out.println("k is the smallest : " + k);
		} else {
			System.out.println("l is the smallest : " + l);
		}
	}

	public static void determineLeapYear() { // Leap year is not largest year ????
												// Go to Google and determine the logic of leap year
		//Divided by 400
		//Divided by 4 but not divided by 100
		
		int year1 = 1900;
		int year2 = 1996;
		int year3 = 2002;
		int year4 = 2000;

		if ((year1 % 400 == 0) || (year1 % 4 == 0 && year1 % 100 != 0)) {
			System.out.println("Year1 is a leap year : " + year1);
		} else {
			System.out.println("It is not a leap year");
		}

		if ((year2 % 400 == 0) || (year2 % 4 == 0 && year2 % 100 != 0)) {
			System.out.println("Year2 is a leap year : " + year2);
		} else {
			System.out.println("It is not a leap year");
		}
		
		if ((year3 % 400 == 0) || (year3 % 4 == 0 && year3 % 100 != 0)) {
			System.out.println("Year3 is a leap year : " + year3);
		} else {
			System.out.println("It is not a leap year");
		}
		if ((year4 % 400 == 0) || (year4 % 4 == 0 && year4 % 100 != 0)) {
			System.out.println("Year4 is a leap year : " + year4);
		} else {
			System.out.println("It is not a leap year");
		}
	}
}
