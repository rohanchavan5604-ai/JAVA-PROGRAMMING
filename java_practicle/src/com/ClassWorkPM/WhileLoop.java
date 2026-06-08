package com.ClassWorkPM;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		SUM of digits
		
		System.out.println("Enter An Number: ");
		int num = sc.nextInt();
		int sum = 0;
		while(num>0) {
			sum = sum + num % 10;
			num = num/10;
		}
		System.out.println("Sum of Sepration: "+sum);
		
		
		
//		System.out.println("Enter An Number: ");
//		int num1 = sc.nextInt();
//		while(num1>0) {	 
//			
//			System.out.println(num1%10);					   
//			num1 = num1 / 10;
//		}
		
		
		
//		System.out.println("==========================================");
//		
//
////		1 to 10
//
//		int i = 1;
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		}
//
//		System.out.println("==========================================");
//		
//		
////		 10 to 1
//
//		int j = 10;
//		while (j >= 1) {
//			System.out.println(j);
//			j--;
//		}
//
//		System.out.println("==========================================");
//		
//		
////		10 time hello 
//
//		int k = 1;
//		while (k <= 10) {
//			System.out.println("Hello");
//			k++;
//		}
//
//		System.out.println("==========================================");
//
//		
////	FACTORIAL
//
//		int num = 5;
//		int fact = 1;
//		int s = 1;
//
//		while (s <= num) {
//			fact = fact * s;
//			s++;
//		}
//		System.out.println("Factorial of 5 is: " + fact);
//
//		System.out.println("==========================================");
//
//		
////		 SUM OF 1 TO 15
//
//		int sum = 0;
//		int r = 1;
//		while (r <= 15) {
//			sum = sum + r;
//			r++;
//		}
//		System.out.println("Sum of 1 to 15 number is: " + sum);
//
//		System.out.println("==========================================");
		
		
		
//		NUMBER SEPRATION USING WHILE LOOP
		
//		int num1 = 34567; 
//		while(num1>0) {	//34567>0 T, 3456>0 T, 345>0 T, 34>0 T, 3>0 T, 0>0F Loop Terminate
//			
//			System.out.println(num1%10);
//							  //34567%10 = 7 , 3456%10 = 6, 345%10 = 5, 34%10 = 4, 3%10 = 3
//			num1 = num1 / 10;
//				// 3456
//			    // 345
//			    // 34
//				// 3
//				// 0
//		}

		
	}

}
