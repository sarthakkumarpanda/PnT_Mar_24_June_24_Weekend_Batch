package com.java.Day15_4th_May_2024_Polymorphism;

public class Topic6_Student extends Topic5_School{
	
	//1. method name should be same
	//2. Class has to be different
	//3. Arguments have to be the same
	//4. inheritance has to be there

	public static void main(String[] args) {
		
		Topic6_Student student = new Topic6_Student();
		student.education(); 
		student.mandatoryFees(200);
		student.annualFunction("Halloween", "Diwali", "PROM night");
		
		Topic5_School school = new Topic5_School();
		school.education();
	}
	
	
	
	public void education() { //student or the child class is overriding parent class method
		System.out.println("Student's education");
	}
	
	
	
	

}
