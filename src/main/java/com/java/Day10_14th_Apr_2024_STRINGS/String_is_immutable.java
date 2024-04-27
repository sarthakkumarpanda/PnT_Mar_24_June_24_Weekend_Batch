package com.java.Day10_14th_Apr_2024_STRINGS;

public class String_is_immutable {

	public static void main(String[] args) {
		//final is a keyword in java
		//once you declare something final then that stays. It cannot change
		
		int i=10;
		i=11;
		System.out.println(i);
		
		final int j = 10;
	
		
		String S1 = new String("Orange");
		S1.concat("Mango");
		System.out.println(S1);
		//String is immutable
		
		
		String password = new String("Demon");
		password.concat("Angel"); //String will not allow this
		
		//Facebook password - Anima@12345
		
		String facebookPassword = "Anima@12345";
		

	}
	
	

}
