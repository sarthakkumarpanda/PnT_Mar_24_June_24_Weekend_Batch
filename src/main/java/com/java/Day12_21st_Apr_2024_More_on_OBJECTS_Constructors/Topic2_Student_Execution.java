package com.java.Day12_21st_Apr_2024_More_on_OBJECTS_Constructors;

public class Topic2_Student_Execution {
	


	public static void main(String[] args) {
	
		Topic3_Student_Logic student = new Topic3_Student_Logic();
		student.name = "Tom";
		student.age = 10;
		student.promotion = true;
		student.classEnrollment = "5thGrade";
		student.primarySubject = "Science";
		student.studentDataBaseConnectivity(); //you can call this method directly or in a static way
		Topic3_Student_Logic.studentDataBaseConnectivity(); //use the ClassName along with the static way
		student.studentAdminData();
		
		
		//What is the purpose of this dot (.) operator ??  //calling operator, it calls Objects
		
	}

}
