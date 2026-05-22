package com.ClassWorkJM;

import java.util.Scanner;

public class C3HomeWork {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		
/*	PROBLEM 2:
 * 	Write a Java program to accept marks from 
 * the user and display the grade.
 */
	
	
	System.out.println("Enter Your Marks: ");	
	int marks = sc.nextInt();
	
	if(marks >= 85) {
		System.out.println("Eligible For advanced Programming batch");
	}else if(marks >= 70 && marks < 85) {
		System.out.println("Eligible for Intermediate batch");
	}else if(marks >= 50 && marks <=70 ) {
		System.out.println("Eligible For Beginner Batch");
	}else if(marks>=35 && marks < 50) {
		System.out.println("Eligible for Foundation Batch");
	}else {
		System.out.println("Not Eligible for Admission");
	}
	
		
	
		
		
/* 	PROBLEM 10:
 * 
 *  A weather application display advisories based 
 *  on temperature .
 *  
 *  Write a java program that accept temprature & display:
 */
		
//		System.out.println("Enter Your Location Temperature");
//		int temp = sc.nextInt();
//		
//		if(temp < 0) {
//			System.out.println("Freezing Alert");
//		}else if(temp>0 && temp <=15) {
//			System.out.println("Cold Weather");
//		}else if(temp>=16 && temp<=25) {
//			System.out.println("Pleasant Weather");
//		}else if(temp>=26 && temp<=35) {
//			System.out.println("Warm Weather");
//		}else {
//			System.out.println("Heat wave Alert");
//		}
		
		
		
		
		
/* PROBLEM 7:
 * 
 * A cinema decides ticket  prices based on the age 
 * of the viewer.
 * 
 * Write a java Program That accept age and display ticket price.	
 */
		
		
		
//		System.out.println("Enter Your Age: ");
//		int age = sc.nextInt();
//		
//		if(age<=0) {
//			System.out.println("Enter an Valid Age");
//		}else if(age<5) {
//			System.out.println("Congrats, You Got Free Ticket");
//		}else if(age >=5 && age<=12) {
//			System.out.println("Ticket Price is: 100");
//		}else if(age >= 13 && age <=59) {
//			System.out.println("Ticket Price is: 200");
//		}else {
//			System.out.println("Ticket Price is 120");
//		}
		
		
 		
		
		
/* PROBLEM 6	 :
 * 	 A smart traffic system display instruction based on single color
 * 
 * Write a java program that accepts a single color from
 * the user and displays
 */
	
//	String signal;
//	System.out.println("Enter a traffic Signal color: ");
//	signal = sc.nextLine();
//	 
//	if(signal.equals("Red")) {
//		System.out.println("Stop");
//	}else if(signal.equals("Yellow")) {
//		System.out.println(" Get Ready");
//	}else if(signal.equals("Green")) {
//		System.out.println("Go..");
//	}else {
//		System.out.println("Invalid Signal");
//	}
		
		
	
	
/*		PROBLEM 3 :
 * Write a Java program to input a person age
 * and classify them as Child (0–12),Teen (13–19)
   Adult (20–59) ,Senior Citizen (60 and above)
 */
		
//		int age;
//		System.out.println("Enter Your Age: ");
//		age = sc.nextInt();
//		
//		if(age>0 && age<=12) {
//			System.out.println("You are Child Now");
//		}else if(age<=0 ){
//			System.out.println("Enter a Valid Age");
//		}else if(age>=13 && age<=19) {
//			System.out.println("You are in Teenager");
//		}else if(age>=20 && age<=59) {
//			System.out.println("You are Adult");
//		}else {
//			System.out.println("You are Senior Citizen");
//		}
		
		

	}

}
