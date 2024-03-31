package com.java.Day6_31st_Mar_2024_Control_Statements_in_Java_Continued;

public class Topic7_Forloop_inside_ForLoop {

	public static void understandingNestedForLoop() {
		// for loop inside for loop
		// outer for loop
		// inner for loop
		// Logic - for every 1 iteration of outer for loop, inner for loop executes for
		// all iterations
	}

	public static void simpleExample() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("This is the outer for loop and I am printing the values : " + i);

			for (int j = 1; j <= 5; j++) {
				System.out.println("The value of inner for loop is : " + j);
			}

		}
	}

	public static void starPatternProgram1() {
		// rows - outer for loop
		// cols - inner for loop
		// Question - cols are in rows ? TRUE

		// total no of rows = 10 (i will be iterated to 10)
		// total no of cols = 10 (j will also be iterated to 10)

		for (int i = 1; i <= 10; i++) {// true

			for (int j = 1; j <= 10; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void starPatternProgram2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void starPatternProgram3() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void starPatternProgram4() {
		//pattern2 + pattern3 but with some small adjustment
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}
	public static void main(String[] args) {
		simpleExample();
		starPatternProgram1();
		starPatternProgram2();
		starPatternProgram3();
		starPatternProgram4();
	}

}
