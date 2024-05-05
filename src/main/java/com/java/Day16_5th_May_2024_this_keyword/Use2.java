package com.java.Day16_5th_May_2024_this_keyword;

public class Use2 {
	//2. can be used to invoke current class method(implicitly)

	public static void main(String[] args) {
		Use2 use2 = new Use2();
		use2.show();
		

	}
	
	void display() {
		System.out.println("Hello World Learning Selenium");
	}
	
	
	void show() {
		this.display();
	}

}
