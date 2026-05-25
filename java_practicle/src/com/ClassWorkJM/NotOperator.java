package com.ClassWorkJM;

import java.util.Scanner;

public class NotOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//	TERNARY OPERATOR 	

//	EX MULTI CONDITION 
		
		// 
		
		char v = sc.next().charAt(0);
		System.out.println(v);
		
		String result =  (v=='a' || v=='e' || v=='i' || v== 'o' || v=='u')
       ? "Its a Vowel" : "Not A Vowel";
		System.out.println(result);
		
		
//		int marks = 85;
//		String st = (marks>80) ? "Distinction" : (marks>60)? "First Class" : 
//			(marks>40)? "Pass": "Fail";
//		System.out.println(st);
		
		
		
		
//	EX 3 

//		int score = 85;
//		System.out.println(score > 70 ? "You Got 10 Marks Extra " : "Better Luck Next Time");

		
		
//	EX 2

//		int marks = 77;
//		System.out.println(marks>=40 ? "Pass " : "Fail");

		
		
//	EX 1	

//		int a = 10 , b =  20;
//		
//		String num = (a>b) ? "a is Greater " : "b is Greater";
//		System.out.println(num);

//		int out = (a>b) ? a : b;
//		System.out.println("Max num is: "+ out);

		
		
		
//	! OPERATOR	EXAMPLE 2

//		int num = 20;
//		
//		if(!(num%2==0 && num %5 ==0)) {
//			
//			System.out.println("Num Is Even");
//		}else {
//			System.out.println("Num Is Odd");
//		}
//		

		
		
// 	 ! OPERATOR EXAMPLE 1 		

//		int age = 19;
//		
//		if(!(age>18)) {
//			System.out.println("Eligible For Voting ");
//			
//		}else {
//			System.out.println("Not Eligible For Voting");
//		}
		

	}
}
