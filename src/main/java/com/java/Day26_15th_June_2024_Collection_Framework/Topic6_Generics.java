package com.java.Day26_15th_June_2024_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Topic6_Generics {

	public static void main(String[] args) {
	

	}
	
	
	public static void definingGenerics() {
		//Generics provide a way to parameterize types in java
		
		List<String> list = new ArrayList<String>();	
		list.add("Hello");
		list.add("World");
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		
		
		List<Boolean> list2 = new ArrayList<Boolean>();
		list2.add(true);
		list2.add(false);
	}

}
