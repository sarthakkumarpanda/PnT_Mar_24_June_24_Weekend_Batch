package com.java.Day18_12th_May_2024_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Topic3_Checked_vs_Unchecked_Exceptions {
	
	//What are CompileTime(checked) Exceptions and what are RunTime(unchecked) Exceptions?

	//Exceptions always occur at RunTime. Exceptions never occur at CompileTime
	
	//CompileTime(Checked) - these are the exceptions which can be handled or warned by the compiler at compile time
	//RunTime(unchecked) - Exceptions which cannot be handled by the compiler at Compile time
	
	public static void main(String[] args) {
		anotherExampleOfRunTimeException();

	}
	
	
	public static void filePresentOrNot() throws FileNotFoundException {
		FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\OneDrive\\Desktop\\Logic.txt");
		//what if the path you are specifying is not correct ?
		//what is the file has been deleted while you are executing this code ?
		//what if the name of the file has been changed while you are executing this code ?
	}
	
	public static void classNotFoundExceptionExample() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void exampleOfRunTimeException() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5/0); //here eclipse or any IDE is not throwing a warning or an error
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
	}
	
	public static void anotherExampleOfRunTimeException(){
		
		int a = 10, b = 0;
		int c = a/b;
		System.out.println(c);
		
	}

}
