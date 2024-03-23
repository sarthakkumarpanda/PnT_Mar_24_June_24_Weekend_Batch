package com.java.Day3_23rd_Mar_2024_Basics_of_Java;

public class Topic11_Increment_Decrement_Operators {

	//++ means +1
	//-- means -1
	//post increment   i++
	//pre increment  ++i
	//post decrement i--
	//pre decrement --i
	
	public static void main(String[] args) {
		int i = 1;
		System.out.println(i); //1
	
		int j = i++;
		System.out.println(j); //1
		System.out.println(i); //2
		
		int k = ++i;
		System.out.println(k); //3
		System.out.println(i);//3
		
		//what is the latest value of i = 3
		
		
		int l = i++     + ++i       + i++ + ++i;
		
		// l = 3        + (+1)+4    + 5   + (+1)+6 = 3 + 5 + 5 + 7 = 20
		 
		// i = 4 ,      5             6      7
		System.out.println(l);
		System.out.println(i); //7
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
