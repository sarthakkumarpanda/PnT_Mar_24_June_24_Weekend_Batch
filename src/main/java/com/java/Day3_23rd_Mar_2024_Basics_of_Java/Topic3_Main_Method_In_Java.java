package com.java.Day3_23rd_Mar_2024_Basics_of_Java;

public class Topic3_Main_Method_In_Java {
	
	//Execution of a program in a simple Java code - happens within main() method
	//main() method is the execution engine in a java program
	//main() method may or may not have the logic but it is still the execution center
	//if any logic exists in other methods then they have to call themselves within the main method for the execution
	//nomenclature of main method cannot be changed
	
	
	public static void main(String[] args) {
		multiplyLogic();
	}
	
	
	
	public static void multiplyLogic() {
		System.out.println(10 * 10);
	}
	
	public static void subtractLogic() {
		System.out.println(100 - 90);
	}

}
