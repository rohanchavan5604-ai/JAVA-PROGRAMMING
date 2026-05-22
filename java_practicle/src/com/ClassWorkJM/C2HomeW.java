package com.ClassWorkJM;

import java.util.Scanner;

public class C2HomeW {

	public static void main(String[] args) {

		/*
		 * 1]Write a Program to input marks of 5 subject using Scanner. calculate the
		 * total marks and average marks.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		int java;
		System.out.println("Enter Your Java Marks: ");
		java = sc.nextInt();
		
		int python;
		System.out.println("Enter your Python Marks: ");
		python = sc.nextInt();
		
		int R;
		System.out.println("Enter Your R's Marks: ");
		R = sc.nextInt();
		
		int php;
		System.out.println("Enter your PHP Marks: ");
		php = sc.nextInt();
		
		int cpp;
		System.out.println("Enter your CPP Marks: ");
		cpp = sc.nextInt();
		
		int total = (java + python + R + php + cpp);
		System.out.println("Total marks obtained: " + total);
		
		float avg = total/5.0F;          
		System.out.println("Average of Your Marks is: "+ avg);
		
		

		/*
		 * 2] Write a program that reads the radius of circle and the length and breadth
		 * of a rectangle.
		 */
		
		

     //	Scanner sc = new Scanner(System.in);
     //	
     //	int radius;
     //	System.out.println("Enter radius of circle: ");
     //	radius = sc.nextInt();
     //	
     //	int length;
     //	System.out.println("Enter length of rectangle: ");
     //	length = sc.nextInt();
     //	
     //	int breadth;
     //	System.out.println("Enter breadth of rectangle: ");
     //	breadth = sc.nextInt();
     //	
     //	double AreaOfCircle = 3.14 * radius * radius ;
     //	double AreaOfRectan = length * breadth;
     //	
     //	System.out.println("Area Of circle is: "+ AreaOfCircle);
     //	System.out.println("Area Of rectangle is: "+ AreaOfRectan);
     
		
		
		/*
		 * 3] write a program that accept an ammounnt in indian Ruppees and convert it
		 * into US Dollars
		 */
		
//		Scanner sc = new Scanner(System.in);
//		
//		float indRs;
//		System.out.println("Enter Ammount in Indian Rs: ");
//		indRs = sc.nextFloat();
//		
//		float conversionRate = 96.82F;
//		
//		double dollar = indRs / conversionRate;
//		
//		System.out.println("After Converting In US Dollar: "+ dollar);
//		

		
		
		/*4]
		 * Write a program to calculate simple interest using principle amount, rate,
		 * and time enter by the user.
		 */

		
//		Scanner sc = new Scanner(System.in);
//		
//		float PrincipalAmount;
//		System.out.println("Enter Principle Amount: ");
//		PrincipalAmount = sc.nextFloat();
//		
//		int rate;
//		System.out.println("Enter rate: ");
//		rate = sc.nextInt();
//		
//		int time;
//		System.out.println("Enter Time: ");
//		time = sc.nextInt();
//		
//		float interest = PrincipalAmount * rate * time / 100;
//		System.out.println("Simple Interest is: "+interest);

	}

}
