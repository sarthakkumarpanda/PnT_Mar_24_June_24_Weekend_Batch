package com.java.Day16_5th_May_2024_this_keyword;

public class Use4 {
	//4. can be used to pass an argument in a method call
	
	public static void main(String[] args) {
	
		Use4 use4 = new Use4();
		use4.method2();
	}
	
	
	public void methodToBeUsed(Use4 useme) {
		System.out.println("I am inside the method to be used for use number 4");
	}
	
	public void method2() {
		methodToBeUsed(this);
	}

}
