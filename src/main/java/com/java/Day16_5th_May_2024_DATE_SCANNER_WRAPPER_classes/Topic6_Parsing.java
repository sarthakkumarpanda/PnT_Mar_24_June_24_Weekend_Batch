package com.java.Day16_5th_May_2024_DATE_SCANNER_WRAPPER_classes;

public class Topic6_Parsing {

	// Parsing - means converting a String representation of a value into its
	// correspoding data type

	public static void main(String[] args) {
		stringToInteger();
		stringToDouble();
		stringToBoolean();
	}

	public static void stringToInteger() {
		String price1 = "400";
		String price2 = "250";
		System.out.println("The price of both the commodities is : " + (price1 + price2));
		
		//String has been declared. We want to convert this string into int so that we can add
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		
		System.out.println("The actual price of the two commodities are : " + (p1 + p2));
		
		
		String price3 = "$10";
		String price4 = "$20";
		
		String price33 = price3.replace("$", "");
		String price44 = price4.replace("$", "");
		
		
		int p33 = Integer.parseInt(price33);
		int p44= Integer.parseInt(price44);
		System.out.println("The actual price of the two commodities are : " + (p33 + p44));
		
	}

	public static void stringToDouble() {

		String price1 = "9.99";
		String price2 = "1.11";
		System.out.println("The price of both the commodities is : " + (price1 + price2));
		
		double p1 = Double.parseDouble(price1);
		double p2  = Double.parseDouble(price2);
		System.out.println("The actual price of the two commodities are : " + (p1 + p2));
	}

	public static void stringToBoolean() {
		String result1 = "true";
		String result2 = "false";
		
		boolean b1 = Boolean.parseBoolean(result1);
		boolean b2 = Boolean.parseBoolean(result2);
		
		System.out.println(b1 == b2); //false
		System.out.println(b1 != b2); //true
		
		
	}
	
	

}
