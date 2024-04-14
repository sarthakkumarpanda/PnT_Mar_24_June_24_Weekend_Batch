package com.java.Da10_14th_Apr_2024_METHODS;

public class Topic4_ReturnTypeInMethods {

	// Methods are independent units of execution
	//it is like a factory. You give some inputs. The factory will give you an output in return

	public static void main(String[] args) {
		test();
		checkPresentOrAbsent();
	}

	public static int test() {
		int i = 10;
		int j = 20;
		int k = i + j;
		System.out.println(k);
		// what is this logic returning ?
		// what is the result ?
		return k; // what type of return value it is - int

	}
	
	public static boolean checkPresentOrAbsent() {
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1==b2);
		return b1==b2;
		
	}

}
