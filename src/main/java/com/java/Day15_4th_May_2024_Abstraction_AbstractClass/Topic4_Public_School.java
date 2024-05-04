package com.java.Day15_4th_May_2024_Abstraction_AbstractClass;

public class Topic4_Public_School extends Topic3_Student{
	
	public void publicSchoolCourseCurriculum() {
		System.out.println("This is public's school course curriculum");
	}
	
	
	public void prayerHallAssembly() {
		System.out.println("This is public school's parayer hall assembly");
	}


	@Override
	public void schoolCanteen() {
		System.out.println("student's school canteen");
		
	}


	@Override
	public void schoolPlayground() {
	System.out.println("student's school playground");
		
	}


	@Override
	public void schoolBandPlay() {
		System.out.println("student's school band play");
		
	}
	
	

}
