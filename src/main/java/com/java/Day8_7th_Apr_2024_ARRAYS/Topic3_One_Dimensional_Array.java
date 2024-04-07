package com.java.Day8_7th_Apr_2024_ARRAYS;

public class Topic3_One_Dimensional_Array {
	//1. Declaration of an Array
	//2. Create an Array
	//3. Initialize an Array
	//4. Retrieve elements of the Array
	
	//1-D  []

	public static void main(String[] args) {
		
		//Declaration
		
		int a[];
		int[] b;
		int[]c;
		
		int[] b1, c1;      //b1 is 1-D array, c1 is also 1-D array
		int b2[], c2;      //b2 is 1-D array, c2 is just an int variable
		int b3[], c3[];     //b3 and c3 are both 1-D
		int[] b4[], c4[];  //b4 and c4 are 2-D
		int[] b5, c5[];    //b5 - 1D and c5 - 2D
		
		
		//Creation of Array
		//we technically use the keyword 'new'
		
		//Declaration + Creation
		
		int[] a1 = new int[5];
		System.out.println("The size of array a1 is : " + a1.length);
		
		//Initialization
		//a1[0] = 111;
		//a1[1] = 222;
		//a1[2] = 333;
		//a1[3] = 444;
		//a1[4] = 555;
		//a1[5] = 666; - this element cannot be entered. ArrayIndexOutOfBoundsException
		
		//Declare + Create + Initialize - all in one statement
		int[] a2 = {111, 222, 333, 444, 555}; //this one is the most simplest
		
		int[] a3 = new int[] {111, 222, 333, 444, 555, 666};
		
		System.out.println("The size of array a2 is : " + a2.length);
		System.out.println("The size of array a3 is : " + a3.length);
		
		//Retrieving elements from an array
		
		String[] S1 = {"hello", "world", "java", "eclipse", "python", "C++", "C#"};
		//To print all the elements of the array
		System.out.println(S1.length);
		
		for(int i=0 ; i<S1.length ; i++) {
			System.out.println(S1[i] );	
		}
		
		//Want to retrieve the 4th element from S1 array
		System.out.println("The 4th elements of S1 array is : " + S1[3]);
        //System.out.println(S1[7]); //ArrayIndexOutOfBoundsException
        
        System.out.println("**********************************************************************************");
		
        retrievalExample();
		
	}
	
	
	
	
	public static void retrievalExample() {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Length of this array a is : " + a.length);
		//determine the 5th element from this array
		//5th element is in 4th position
		
		System.out.println("The 5th element of this array is : " + a[4]);
	}
	
	
	
	
	
	
	

}
