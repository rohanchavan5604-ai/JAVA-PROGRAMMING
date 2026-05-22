package com.ClassWorkJM;

import java.util.Scanner;

public class Logical_OR {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String Gmail = "rohan@gmail.com";
		String Pass = "1234";
		
		System.out.println("Enter Your Gmail");
		String gmail = sc.nextLine();
		
		System.out.println("Enter An Password");
		String pass = sc.nextLine();
		
		if(gmail.equals(Gmail ) && Pass.equals(pass)  ) {  //if(gmail.equals("rohan@gmail.com") && Pass.equals("1234")  ) {
			System.out.println("Login Success");
		}else {
			System.out.println("Invalid Gmail or Pass");
		}
		
		
		
		
		

//		System.out.println("Enter An Operator: ");
//		String ch = sc.nextLine();
//
//		if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/") || ch.equals("%")) {
//			System.out.println("Arithmetic Operator");
//		} else if (ch.equals("<") || ch.equals(">") || ch.equals("<=") || ch.equals(">=") || ch.equals("!=")
//				|| ch.equals("==")) {
//			System.out.println("Comparison Operator");
//		} else if (ch.equals("&&") || ch.equals("||") || ch.equals("!")) {
//			System.out.println("Logical Operator");
//		}else {
//			System.out.println("invalid Operator");
//		}
		
		
		
		
	     
//		System.out.println("Enter num1");
//		int num1 = sc.nextInt();
//		
//		System.out.println("Enter Num2");
//		int num2 = sc.nextInt();
//		
//		System.out.println("Enter your Operator  + - * / ");
//		char ch = sc.next().charAt(0);
//		
//		if(ch == '+') {
//			System.out.println("Addition is: " + (num1 + num2));
//		}else if(ch == '-') {
//			System.out.println("Subtraction is: "+ (num1 - num2));
//		}else if(ch == '*') {
//			System.out.println("Multiplication is: "+(num1 * num2));
//		}else if(ch == '/') {
//			System.out.println("After Divide Result is: "+(num1 / num2));
//		}else {
//			System.out.println("Enter an valid Operator");
//		}
		 
		
		
		

//		System.out.println("Enter a Index & Name");
//
//		int i = sc.nextInt();
//		char ch = sc.next().charAt(i);
//
//		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//			System.out.println("Its an Vowel");
//		} else {
//			System.out.println("It is Not a Vowel");
//		}
		
		

	}
}
