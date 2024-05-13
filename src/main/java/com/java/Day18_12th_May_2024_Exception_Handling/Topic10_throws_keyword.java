package com.java.Day18_12th_May_2024_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Topic10_throws_keyword {

	public static void main(String[] args) throws FileNotFoundException {
		filePresentOrNot();
		filePresentOrNot1();
	}
	
	public static void filePresentOrNot() throws FileNotFoundException {
		 FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\OneDrive\\Desktop\\Logic123.txt");
	}
	
	public static void filePresentOrNot1()  {
		 try {
			FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\OneDrive\\Desktop\\Logic123.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	

}
