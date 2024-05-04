package com.java.Day15_4th_May_2024_Inheritance;

public class Topic2_Parent extends Topic5_GrandParent{
	
	private String name = "John";
	
	
	public Topic2_Parent() {
		int i = 100;
		int j = 200;
		int k = 300;
		System.out.println(i + j + k);
	}
	
	public void bungalow() {
		System.out.println("Parent's bungalow");
	}
	
	public void shares() {
		System.out.println("Parent's shares");
	}
	
	public void farmHouse() {
		System.out.println("Parent's farmhouse");
	}

}
