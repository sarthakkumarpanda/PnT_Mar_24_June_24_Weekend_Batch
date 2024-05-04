package com.java.Day15_4th_May_2024_Abstraction_AbstractClass;

public class Topic5_HomeSchool_Execution {
	//Topic3_Student - this is an abstract class
	//Topic4_Public_School - this is a normal class which extends the abstract class
	//Topic5_HomeSchool_Execution - this is a class where in we do execution
	

	public static void main(String[] args) {
		
		//Can I create the object of ab abstract class - NO
		
		//Topic3_Student student = new Topic3_Student();
		
		
		Topic4_Public_School publicschool = new Topic4_Public_School();
		publicschool.publicSchoolCourseCurriculum();
		publicschool.prayerHallAssembly();
		publicschool.schoolPlayground();
		publicschool.schoolCanteen();
		publicschool.schoolBandPlay();
		
		
		//What if we use the Parent Class reference to refer to the child class object
		
		Topic3_Student student = new Topic4_Public_School();
		student.age = 10;
		student.name = "Johnny";
		student.schoolBandPlay();
		student.schoolCanteen();
		student.schoolPlayground();
		
		

	}

}
