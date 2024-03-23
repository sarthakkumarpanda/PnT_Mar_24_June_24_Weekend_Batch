package com.java.Day3_23rd_Mar_2024_Basics_of_Java;

public class Topic12_Increment_Decrement_Operators_AnotherExample {

	public static void main(String[] args) {
		example1();
		
		System.out.println("---------------------------------------------");
		example2();

	}

	public static void example2() {
		int i = 1;
		//latest value of i is 1
		int j = i-- + --i;
		// j = 1    + (-1) = 0
		//i  = 0,     -1
		//the latest value of i is -1
		//the latest value of j is 0
		int k = i++ + --i - j++ + ++j;
		//  k = -1  + (-1) - 0  + 2 = 0
		// i = 0,    -1             = -1
		//j =                 1,  2 = 2
		
		
		int l = i++ + j++ + k++ - --i - --j - --k;
		//  l = -1 + 2    + 0   - (-1) - 2  - 0 = 0 
		//  i = 0,                -1            = -1
		// j =         3,                2,     = 2
		//k  =               1,                0 = 0
		
		//i = -1
		//j = 2
		//k = 0
		//l = 0
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void example1() {
		int i = 10;
		// latest value of i is = 10
		int j = --i;
		// j = (-1)+10 = 9
		// i = 9
		System.out.println(i); // 9
		System.out.println(j); // 9
		System.out.println("*****************************************************");
		int k = i++ - --j;
		// k = 9 - (8) = 1
		// i = 10
		// j 8
		System.out.println(i); // 10
		System.out.println(j); // 8
		System.out.println(k); // 1
		int l = --i - --i + ++j - --k;
		// l = 9 - 8 + 9 - 0 = 10
		// i = 9, 8 8
		// j = 9 9
		// k = 0
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}

}
