package com.java.Day12_21st_Apr_2024_More_on_OBJECTS_Constructors;

public class Topic6_What_is_a_Constructor {
	
	//Constructors initializes an object
	//Constructors never create an Object
	//Constructors help in optimizing the code
	
	
	//Constructors are invoked by default when an object is created
	//Constructors do not have a return type not even void
	//Constuctor is a block rather than calling it a special type of method
	
	
	String firstName; //what is the default value of a String ? null
	String lastName;
	int age;       //what is the default value of an int ?? 0
	int grade;
	int mainSubjectMarks;
	boolean graduated; //what is the default value of a boolean?  false

	
	//syntax of a constructor - it will always have the name of the Class
	
	public Topic6_What_is_a_Constructor(String firstName, String lastName, int age, int grade, int mainSubjectMarks, boolean graduated) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.grade = grade;
		this.mainSubjectMarks = mainSubjectMarks;
		this.graduated  = graduated;
			
	}
	
	
	
	public static void main(String[] args) {
		Topic6_What_is_a_Constructor student1 = new Topic6_What_is_a_Constructor("Tom", "Alter", 10, 5, 75, true);	
		System.out.println(student1.firstName + "---" + student1.lastName + "---" + student1.age + "---" + student1.grade + "---" + student1.mainSubjectMarks + "---" + student1.graduated);
		Topic6_What_is_a_Constructor student2 = new Topic6_What_is_a_Constructor("Dom", "Dexter", 10, 5, 75, true);	
	
	}
}
