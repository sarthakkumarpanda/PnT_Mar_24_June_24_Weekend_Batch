package com.java.Day26_15th_June_2024_Collection_Framework;

import java.util.ArrayList;
import java.util.Stack;

public class Topic5_Refreshing_Understanding {
	
	//Iterable
	//Collection
	//List, Set, Queue

	public static void main(String[] args) {
		arrayList();
		stackLegacyClass();

	}
	
	
	
	
	public static void ListInterface() {
		//ArrayList
		//LinkedList
		//Vector [Legacy Class]
		//Stack [Legacy Class]
	}
	
	public static void arrayList() {
		ArrayList arraylist = new ArrayList();
		arraylist.add(true);
		arraylist.add(false);
		
		System.out.println(arraylist);
		arraylist.remove(true);
		System.out.println(arraylist);
	}
	
	public static void stackLegacyClass() {
		Stack stack = new Stack();
		
		stack.push("Java");
		stack.push("Python");
		stack.push("C++");
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	
	
	public static void setInterface() {
		//HashSet
		//LinkedHashSet
		//TreeSet
	}

}
