package com.java.Day6_31st_Mar_2024_Control_Statements_in_Java_Continued;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic4_What_is_while_loop {

	public static void whatIsWhileLoop() {
		/// when the end point is not clear
		// when something tends to infinity we use while loop
		// cnn.com or bbc.com

		// syntax of while loop
		int i = 1; // declaration is done
		while (i <= 6) {
			System.out.println("Keep printing the value of i : " + i);
			i++;

			// Logic
			// 1 is less than 6 (true)
			// once the print statement is done
			// then i becomes 2

			// 2 is less than 6 (true)
			// once the print statement is done
			//// then i becomes 3
		}

	}

	public static void printNumbersFrom1to10() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

	}

	public static void printFirst50WholeNumbers() {
		int i = 0;
		while (i <= 49) {
			System.out.print(i + ", ");
			i++;
		}
	}

	public static void print100NumbersInAReverseMannerStartingFrom100() {
		// 100................................1
		int i = 100;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
	}

	public static void print20MultiplesOf5() {
		// 5,10,..........100
		int i = 1; // initialized
		while (i <= 20) {
			System.out.println(i * 5);
			i++;
		}
	}

	public static void print20MultiplesOf5AndCalculateTheSumOfTheMultiples() {
		// 5,10,15.......100
		// 5 + 10 + 15 + 20 +.....+100 = what is the value ?
		int i = 1;
		int sum = 0; //let's assume that the sum is Zero
		while (i <= 20) {
			System.out.println(i * 5);
			sum = sum + (i*5); // sum = 0+5 = 5
			i++; //2
			System.out.println("The step of each addition is : " + sum);
		}
		System.out.println("The sum of all the first 20 multiple of 5 is : " + sum);

	}

	public static void print1083MultiplesOf97() {
		int i = 1;
		while (i <= 1083) {
			System.out.println(i * 97);
			i++;
		}
	}

	public static void main(String[] args) {
		// cnnDotComTotalLinksToday();
		// whatIsWhileLoop();
		// printNumbersFrom1to10();
		// printFirst50WholeNumbers();
		// print100NumbersInAReverseMannerStartingFrom100();
		// print20MultiplesOf5();
		//print1083MultiplesOf97();
		print20MultiplesOf5AndCalculateTheSumOfTheMultiples();
	}

	public static void cnnDotComTotalLinksToday() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cnn.com");

		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links present today is : " + totalLinks.size());
	}

}
