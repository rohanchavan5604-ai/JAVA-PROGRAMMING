package com.ClassWorkJM;

import java.util.Scanner;

public class class_2 {
	public static void main(String[] args) {
		String name;
		
		Scanner sc = new Scanner(System.in);
		
//		STRING INPUT
		
		System.out.println("Enter Your Name: ");
		name = sc.nextLine();
		System.out.println("Your Name: "+ name);
		
//		INTEGAR INPUT
		int age;
		System.out.println("Enter Your age: ");
		age = sc.nextInt();
		System.out.println("Your Age: "+age);
		
//		LONG USER INPUT
		
		long MobNo;
		System.out.println("Enter Your Mobile No: ");
		MobNo =sc.nextLong();
		System.out.println("Mobile Number: "+MobNo);
		
//		Float USER INPUT
		
		float perc;
		System.out.println("Enter your percentage: ");
		perc = sc.nextFloat();
		System.out.println("Your Percebtage: "+ perc);
		
//		DOUBLE USER INPUT 
		
		double fees;
		System.out.println("Enter Fees: ");
		fees = sc.nextDouble();
		System.out.println("Fees = "+fees);
		
		
//		BOOLEAN USER INPUT
		
		boolean IsRegister;
		System.out.println("Are you Registered: ");
		IsRegister = sc.nextBoolean();
		System.out.println("Is Register: "+IsRegister);
		
		
//	CHAR USER INPUT
		
		char gender;
		System.out.println("Enter Your gender: ");
		gender = sc.next().charAt(0);
		System.out.println("Your Gender: "+gender);
		
//		SHORT USER INPUT
		
		short RollNo;
		System.out.println("Enter Your Roll no");
		RollNo = sc.nextShort();
		System.out.println("Your Roll No: "+RollNo);
		
		
//		BYTE USER INPUT
		
		short LuckyNo;
		System.out.println("Enter your Lucky No: ");
		LuckyNo = sc.nextByte();
		System.out.println("Your Lucky No is :"+LuckyNo);
		
		
	}

}
