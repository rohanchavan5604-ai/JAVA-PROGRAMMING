package com.ClassWorkJM;

public class June_8 {

	public static void main(String[] args) {
		
 	
//		DIAMOND  HOLLO PATTERN
		
		
 for(int i =1; i<=9; i++) {
	 
	 if(i>=1 && i<=5) 
	 {
		 for(int s= 4; s>=i; s--) {
			 System.out.print(" ");
		 }
		 for(int star=1; star<=i; star++) {
			 System.out.print("* ");
		 }
	 }
	 if(i>=6 && i<=9) 
	 {
		for(int s=1; s<=i-5; s++){
			System.out.print(" ");
		} 
		for(int star=10; star>i;star--) {
			System.out.print("* ");
		}
	 
	 }
	 System.out.println();
	 
 }
		
		
		
	}
	
}
