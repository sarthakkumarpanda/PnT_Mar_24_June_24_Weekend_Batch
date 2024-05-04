package com.java.Day15_4th_May_2024_Abstraction_AbstractClass;

//0 to 100% abstraction
//abstract class has to use the keyword 'abstract'
//abstract class can have both abstract(undefined/unimplented) methods and concrete/regular methods
//a concrete(regular) Class can extend an abstract class but it has to implement all the unimplemented methods of the abstract class
//cannot create the object of Abstract Class
	
//a normal class cannot have abstract methods

public abstract class Topic3_Student {
	
	String name;
	int age;
	
	
	public abstract void schoolCanteen(); //this is an abstract method or undefined method or unimplemented method[which does not have a body]
	public abstract void schoolPlayground();
	public abstract void schoolBandPlay();
	//public static abstract void schoolAuditorium(); //can I make an abstract method static - NO
	
	public void studentLibrary() {
		System.out.println("This is a normal method");
	}
	
	public static void studentLibrary(String senior) {
		System.out.println("This is a normal method");
	}

}
