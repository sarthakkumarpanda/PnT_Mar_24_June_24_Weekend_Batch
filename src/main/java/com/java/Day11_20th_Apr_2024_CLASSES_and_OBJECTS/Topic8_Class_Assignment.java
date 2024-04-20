package com.java.Day11_20th_Apr_2024_CLASSES_and_OBJECTS;

public class Topic8_Class_Assignment {

	// 1. Create a Class
	// 2. Make sure you have the main method in it
	// 3. Create 2 static variables and 2 non static variables of this Class
	// 4. Create 2 static methods
	// 5. Create 2 non-static methods
	// 6. Create 3 objects of this Class
	// 7. Call all the static entities directly inside the main method
	// 8. Call all the non-static entities using the object references
	// 9. Call static entities within each other
	// 10. Call non-static entities within each other
	// 11. Call static entities within non-static entities
	// 12. Use the object references to call static entitities and note down the
	// warning
	// 13. Create an Adjacent class and try to create an object of that class and
	// try calling

	String firstName;
	String lastName; // this is declaration. Try not to initialize at a Variable level.
	int age;
	static String mainSubject;
	static double height;

	public static void main(String[] args) {

		String lastName = "Cena"; // you are updating the declaration
		System.out.println(lastName);

		String mainSubject = "Mathematics";
		System.out.println(mainSubject);
		double height = 5.11;
		System.out.println(height);
		logic1();
		logic2();

		Topic8_Class_Assignment ref1 = new Topic8_Class_Assignment();
		Topic8_Class_Assignment ref2 = new Topic8_Class_Assignment();
		Topic8_Class_Assignment ref3 = new Topic8_Class_Assignment();
		ref1.firstName = "Tom";
		ref1.lastName = "Alter";
		ref1.age = 20;
		ref1.test1();
		ref1.test2();
		System.out.println(ref1.firstName + " " + ref1.lastName + " " + ref1.age);

		ref2.firstName = "Dom";
		ref2.lastName = "Barter";
		ref2.age = 21;
		ref2.test1();
		ref2.test2();
		System.out.println(ref2.firstName + ref2.lastName + ref2.age);

		ref3.firstName = "Green";
		ref3.lastName = "Mack";
		ref3.age = 22;
		ref3.test1();
		ref3.test2();
		System.out.println(ref3.firstName + ref3.lastName + ref3.age);

		ref1.logic1();

	}

	public static void logic1() {
		System.out.println("This is logic1 static method");
		logic2();
	}

	public static void logic2() {
		System.out.println("This is logic2 static method");
		logic1();
	}

	public void test1() {
		System.out.println("This is test1 non static method");
		logic1();
		logic2();
	}

	public void test2() {
		System.out.println("This is test2 non static method");
		logic2();
		logic1();
	}

}


