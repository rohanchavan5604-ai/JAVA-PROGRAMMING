package com.ClassWorkPM;

public class Loop_30_May {

	public static void main(String[] args) {

//	FIBONACCI SERIES PRINT USING FOR LOOP
		
		int n1 = 0; 
		int n2 = 1;
		
		System.out.print(n1+ " "+ n2+" "); // 0 1 
		
		for(int i=1; i<=5;i++) {        // 1<=5 T, 2<=5 T, 3<=5 T, 4<=5 T, 5<=5 T, 6<=5 F LOOP TERMINATE
			int n3 = n1+n2;             // n3 = 0 + 1; = 1 + 1; = 1 + 2; = 2 + 3; = 3 + 5;
			System.out.print(n3+" ");   // 1, 2, 3, 5, 8   
			n1 = n2;  // 0 = 1;  = 1; = 2; = 3; = 5;
			n2 = n3;  // 1 = 1;  = 2; = 3; = 5; = 8;
		 
//				Final Output To Print: 0 1 1 2 3 5 8
		}

		
		
//		SERIES INCREMENT i=i+3
		
//		for(int i = 1; i<=10;i=i+2) {
//			System.out.print(" "+i);
//		}
//		System.out.println();
//		for(int i = 1; i<=10; i = i+3) {
//			System.out.print(" "+i);
//		}
		
 
		
//		FIND THE PRIME NUMBER UP TO 1 - 100
		
//		int sum = 0;
//		for(int j = 2; j<=50; j++) {
//		int c = 0;
//		
//		for (int i = 2; i < j; i++) {
//
//			if (j % i == 0) {
//				c = c + 1;
//			}
//		}
//	
//		if (c == 0) {
//
//			System.out.println("Prime : "+j);
//			sum = sum + j;							// 	ADDITION OF PRIME NUM UP TO 1 TO 50
//		 }  
//	}
//		System.out.println("Sum is Prime No: "+ sum);
		
		
		
		
		
//		int num = 3;
//		int c = 0;
//		
//		for (int i = 2; i < num; i++) {
//
//			if (num % i == 0) {
//				c = c + 1;
//			}
//		}
//		if (c == 0) {
//
//			System.out.println("Prime");
//		} else {
//
//			System.out.println("Not Prime");
//		}
		
		
		
		
//		PRIME NUMBER USING FOR LOOP Way 1
		
//		int num = 3;
//		int c = 0;
//		for(int i = 1; i <= num; i++) {
//			
//			if(num % i == 0) {
//				c++;
//			}
//		}
//		if (c == 2) {
//			System.out.println("Prime");
//		}else {
//			System.out.println("Not Prime");
//		}
		
	}
}
