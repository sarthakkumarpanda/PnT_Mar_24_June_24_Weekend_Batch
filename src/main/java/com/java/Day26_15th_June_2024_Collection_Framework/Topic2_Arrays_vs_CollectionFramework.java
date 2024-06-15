package com.java.Day26_15th_June_2024_Collection_Framework;

import java.util.ArrayList;

public class Topic2_Arrays_vs_CollectionFramework {

	public static void main(String[] args) {
		//Difference 1 - Arrays can store both primitive and non-primitive data but Collection framework can only store non-primitive
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		Topic2_Arrays_vs_CollectionFramework obj1 = new Topic2_Arrays_vs_CollectionFramework();
		Topic2_Arrays_vs_CollectionFramework obj2 = new Topic2_Arrays_vs_CollectionFramework();
		Topic2_Arrays_vs_CollectionFramework obj3 = new Topic2_Arrays_vs_CollectionFramework();
		Topic2_Arrays_vs_CollectionFramework obj4 = new Topic2_Arrays_vs_CollectionFramework();
		Topic2_Arrays_vs_CollectionFramework obj5 = new Topic2_Arrays_vs_CollectionFramework();
		Topic2_Arrays_vs_CollectionFramework obj6 = new Topic2_Arrays_vs_CollectionFramework();
		
		
		Topic2_Arrays_vs_CollectionFramework[] ref = {obj1, obj2, obj3, obj4, obj5, obj6};
		
		
		ArrayList al = new ArrayList();
		al.add("Java");
		al.add(10); //this 10 is not an int data type. Rather it is an Object. This 10 is a Wrapper Class Object
		
		
		//Difference 2 - Arrays can store mostly homogeneous form of data excepting in some cases like int as it can be type casted automatically
		//              but collection framework can store heterogeneous type of data
		
		int[] b = {1, 2, 3, 4, 'c', 5};
		boolean[] c = {true, false, 1<3, 3<4 , 5<6};
		double[] d = {12.11, 13.45, 145.982, 100};
		
		al.add(true);
		al.add(100.92);
		al.add('$');
		
		
		//Difference 3 - 
		
		//Difference 4 - 
	}

}
