package com.java.Day6_31st_Mar_2024_Control_Statements_in_Java_Continued;

public class Topic2_What_is_nested_if {

	public static void main(String[] args) {

		// if it is divisible by 4
		// if it is divided by 4 then check whether it is divisible by 100
		// if it is divisible by 100 check whether it is divisible by 400

		int year = 2000;

		if (year % 4 == 0) {

			if (year % 100 == 0) {

				if (year % 400 == 0) {
					System.out.println("the final condition is satisfied and it is a leap year : " + year);

				} else {
					System.out.println(year + " : it is not a leap year after all considerations");
				}
				System.out.println("It is still to be tested and is under consideration");
			} else {
				System.out.println("It is not divisible by 100 so no it is a leap year");
			}

			System.out.println("It is still under consideration");
		} else {
			System.out.println("It is not a leap year");
		}

	}

}
