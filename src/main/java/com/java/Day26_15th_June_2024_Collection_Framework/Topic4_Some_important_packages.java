package com.java.Day26_15th_June_2024_Collection_Framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Topic4_Some_important_packages {

	public static void main(String[] args) {
		
		//java.util.Collection - we can store the data directly
		
		ArrayList arraylist = new ArrayList();
		arraylist.add("Java");
		arraylist.add(10);
		
		HashSet hashset = new HashSet();
		hashset.add("Monkey");
		hashset.add(true);
		
		
		//java.util.Map - we store the value in key value pair
		Map map = new HashMap();
		HashMap hashmap = new HashMap();
		hashmap.put(101, "Python");
		// hashmap.put(102); - this is not allowed

	}

}
