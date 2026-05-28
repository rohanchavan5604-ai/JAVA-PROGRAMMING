package com.ClassWorkJM;

import java.util.Scanner;

public class May28{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double balance = 1000.00;
		
			System.out.println("Enter Your Choice:");
			System.out.println("1) Check Balance");
			System.out.println("2) Withdraw Balance");
			System.out.println("3) Deposit Balance");
			int choice = sc.nextInt(); 
 
		switch(choice) {
		
		case 1: System.out.println("Your Avilable balance is: "+balance); break;
		case 2:
			System.out.println("Enter Amount To Withdraw: ");
			int withdraw = sc.nextInt();
			System.out.println(" After withdraw balance avl:"+ (balance-withdraw)+balance);
		    break;
		    
		case 3: 
			System.out.println("Enter Amount To deposite: "); 
			int deposite = sc.nextInt();
			
			System.out.println("After Deposite Avl Balance: " + (balance+deposite)+ balance);
			break;
		default: System.out.println("Enter An Valid Choice");	
			
		}
		
		
		
		
//		System.out.println("Enter First Number: ");
//		int num1 = sc.nextInt();
//		System.out.println("Enter Second Number: ");
//		int num2 = sc.nextInt();
//
//		System.out.println("Enter Your Choice: ");
//		System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Modulus");
//		int choice = sc.nextInt();
//
//		switch (choice) {
//		case 1:
//			System.out.println("Addition of Two Num: " + (num1 + num2));
//			break;
//		case 2:
//			System.out.println("Subtraction of Two Num: " + (num1 - num2));
//			break;
//		case 3:
//			System.out.println("Multiplication of Two Num: " + (num1 * num2));
//			break;
//		case 4:
//			System.out.println("Division of Two Num: " + (num1 / num2));
//			break;
//		case 5:
//			System.out.println("Mod of Two Num: " + (num1 % num2));
//			break;	
//		default:
//			System.out.println("Enter An invalid Choice");
//		}
		
		
		
		
//		 EVEN ODD NUMBER USING SWITCH
		
		
//		int num = 16;
//		
//		switch(num%2) {
//		case 0: System.out.println("Its Even"); break;
//		case 1: System.out.println("Its Odd"); break;
//		}
		
		
		
		
//		TRAFFIC SIGNAL USING SWITCH
		

//		System.out.println("Enter An Trafic Signal Color: ");
//		String color = sc.nextLine();
//
//		switch (color) {
//
//		case "Red":
//			System.out.println("Stop");
//			break;
//		case "Green":
//			System.out.println("Go");
//			break;
//		case "Yellow":
//			System.out.println("Wait");
//			break;
//
//		default:
//			System.out.println("Enter An Valid Choice ");
//		}
		
		
 
//	  VOWELS USING SWITCH
		
		
		
//		System.out.println("Enter An Alphabet: ");
//		char ch = sc.next().charAt(0);
//
//		ch = Character.toLowerCase(ch);
//
//		switch (ch) {
//
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//			System.out.println("Its A Vowel");
//			break;
//		default:
//			System.out.println("Not a Vowel");
//		}
		
		
		
	}

}
