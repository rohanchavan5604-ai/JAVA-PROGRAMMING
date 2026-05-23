package com.ClassWorkJM;

import java.util.Scanner;

public class LogicalOperator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

 		
/* 5] Write a Java program where a student qualifies for a scholarship if:
	Sports score is above 80 OR  Academic score is above 85	
 */		
		
	 System.out.println("Enter Your Sport Marks: ");	
	 float Sport = sc.nextFloat();
	 
	 System.out.println("Enter Your Acedemic Marks: ");
	 float Acd = sc.nextFloat();
	 
	 if(Sport>=80 || Acd >=85) {
		 System.out.println("You Are Qualify For Scholarship ");
	 }else {
		 System.out.println("You are not Qualify For Scholarship");
	 }
		
		
		
		
		
/* 2] Write a program to give discount eligibility.
			A customer gets a discount if :
			Purchase amount is greater than or equal to 5000 
			The customer is a premium member */
		
//		System.out.println("Enter Your Purcheses Amount: ");
//		float amt = sc.nextFloat();
//		
//		System.out.println("Enter Your membership Status true/false: ");
//		boolean premium = sc.nextBoolean();
//		
//		float discount = amt*10/100;
//		float FinalAmt = amt - discount;
//		
//		if(amt>=5000 || premium == true) {
//			System.out.println("Congrats You Got 10% Discount "+"Final Amount To Pay: "+FinalAmt);
//		}else {
//			System.out.println("You need To Spend More For Discount");
//		}
		
		
		
//1] || Write a Java program to check whether a student passed in at least one subject
		
//		System.out.println("Enter Your Math Mark: ");
//		int math = sc.nextInt();
//		
//		System.out.println("Enter Your Science Mark: ");
//		int science = sc.nextInt();
//		
//		if(math>=35 || science >=35) {
//			System.out.println("Pass");
//		}else {
//			System.out.println("Fail");
//		}
		
		
		
		
		
//3] && 	Create a program that checks whether a number is between 10 and 50 inclusive
		
//		System.out.println("Enter An Number: ");
//		int num = sc.nextInt();
//		
//		if(num>=10 && num <=50) {
//			System.out.println("Number is Between 10 - 50 ");
//		}else {
//			System.out.println("Number not Between 10 - 50");
//		}
		
		
		
		
// 2] && Write a Java program to check whether a person is eligible to vote
		
//		System.out.println("Enter Your Age: ");
//		int age = sc.nextInt();
//		 
//		System.out.println("Enter Your citizen");
//		String city = sc.next();
//		
//		if(age>18 && city.equals("india")) {
//			System.out.println("You Are Eligible For Voting");
//		}else {
//			System.out.println("You Are Not Eligible For Voting");
//		}	
		
			
		
		
		
// 1] && Create a Java program that asks the user to enter a password and confirm password.
		
		
//		System.out.println("Enter An PassWord: ");
//		String Pass = sc.nextLine();
//		
//		System.out.println("Enter Confirm PassWord: ");
//		String CPass = sc.nextLine();
//		
//		if(Pass.equals(CPass)&& !Pass.isEmpty()) {
//			System.out.println("Pass Is Correct");
//		}else {
//			System.out.println("Pass Is Not Correct");
//		}
		
		
		
		
		
		
		
	}

}
