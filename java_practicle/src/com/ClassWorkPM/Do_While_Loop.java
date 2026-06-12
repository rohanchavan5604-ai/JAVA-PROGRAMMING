package com.ClassWorkPM;

import java.util.Scanner;

public class Do_While_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int num;
		
		do {
			System.out.println("Index: \n" + "1. Even odd Calculation \n" + "2. Positive negative Zero \n"
					+ "3. Factorial  \n" + "4. Exit \n"+"=============================================== \n"+"Enter Your Choice: ");
			num = sc.nextInt();

			switch (num) {

			case 1:

				int r = 8;
				if (r % 2 == 0) {
					System.out.println("Even");
				} else {
					System.out.println("Odd");
				}
				break;

			case 2:
				int s = 4;
				if (s > 0) {
					System.out.println("Positive");
				} else if (s < 0) {
					System.out.println("Negative");
				} else {
					System.out.println("Zero");
				}
				break;

			case 3:
				System.out.println("=========================================");
				System.out.println("Enter No For Factorial: ");
				int a=sc.nextInt();
				int fact = 1;
				for(int i=1; i<=a; i++) {
					fact = fact *i;
				}
				System.out.println("Factorial of "+a+" is: "+fact);
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("===============================================");
		} while (num != 4);
		
		
		
		
		
	 	
//		int num;
//		
//		do {
//		System.out.println("Enter Your Choice: \n"
//				+ "1. One \n"
//				+ "2. two \n"
//				+ "3. Three \n"
//				+ "4. Exit");
//		num = sc.nextInt();
//		
//		switch(num) {
//		case 1:
//			System.out.println("Oneee");
//			break;
//		case 2:
//			System.out.println("Twoo");
//			break;
//		case 3:
//			System.out.println("Threee");
//			break;
//		case 4:
//			System.out.println("Exit");
//		    break;
//		default:
//			System.out.println("Invalid choice");
//		}
//		System.out.println("===============================================");
//		}while(num!=4);
		
		
		
	}
}
