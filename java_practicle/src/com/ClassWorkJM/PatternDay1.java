package com.ClassWorkJM;

import java.util.Scanner;

public class PatternDay1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
 
	 for(int i =1; i<=5; i++) {
		 for(int j=5; j>=i;j--) {
			 System.out.print(" * ");
		 }
		 System.out.println();
	 }
	 for(int i=2; i<=5;i++) {
		 for(int j=1; j<=i; j++) {
			 System.out.print(" * ");
		 }
		 System.out.println();
	 }
		
		
		
		
//		for(int i =1; i<=5;i++){
//		    for(int j =1; j<=i;j++){
//		       
//		        System.out.print(" * ");
//		    }
//		 
//		    System.out.println();
//		}
//
//		  for(int i =1; i<=5;i++){
//		    for(int j =4; j>=i;j--){
//		       
//		        System.out.print(" * ");
//		    }
//		 
//		    System.out.println();
//		}
		
		
		
		
//		for(int i =1; i<=9;i++){
//		    for(int j =1; j<=i;j++){
//		       
//		        System.out.print("* ");
//		    }
//		 
//		    System.out.println();
//		}
//
//		  for(int i =1; i<=8;i++){
//			  if(i>=1 && i<=5) {
//				  for(int k = 1; k<=i;k++) {
//					     
//				        System.out.print("* ");
//					  
//				  }
//				  
//			  }
//		  if(i>=6 && i<=9) {
//			  for(int k = 1; k<=10-i;k++) {
//				  System.out.print("* ");
//			  }
//		  }
//		  System.out.println();
//		    }
		 
		  
		
		
 
//		for (int i =1; i<=4;i++) {  
//			for(int p = 1; p<=i;p++) {
//				System.out.print("  ");
//			}
//			for(int j = 4; j>=i;j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
		
		
//		  for(int i =1; i<=5;i++){
//			    for(int j =5; j>=i;j--){
//			       
//			        System.out.print("* ");
//			    }
//			 
//			    System.out.println();
//			}
//			    for(int i =2; i<=5;i++){
//			    for(int j =1; j<=i;j++){
//			       
//			        System.out.print("* ");
//			    }
//			 
//			    System.out.println();
//			}
			    
			    
		
	
//		for(int i =1; i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				
//			 
//					System.out.print(" * ");
//			}
//			System.out.println();
//		}
		
		
		
 
//		for(int i =1; i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				
//			 
//					System.out.print(" * ");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
//		W letter
		
//		int n = 7;
//		for(int i =1; i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				
//				if((j==1 || j==7)||
//				(i==4 && j==4)||
//				(i==5 && (j==3 || j==5))||
//				(i==6 && (j==2 || j==6)))
//				{
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		
		
		
//		PRINTING R LETTER USING STAR * 
		
//		int n = 7;
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//
//				if (j == 1 || i == 1 || i == 4 || (j == 7 && i > 1 && i < 4) || (i == j && i >= 4)) {
//
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
     
//		OUTPUT:-
		
//		* * * * * * * 
//		*           * 
//		*           * 
//		* * * * * * * 
//		*       *     
//		*         *   
//		*           *
		
	
		
//	 PRINTING C LETTER USING STAR *
		
	
//		for(int i = 1; i<=7; i++) {
//			for(int j =1; j<=5;j++) {
//				if(j ==  1  || i == 1 || i == 7) {
//					System.out.print(" * ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
	

//		OUTPUT:-
		
//		 *  *  *  * 
//		 *       
//		 *       
//		 *       
//		 *       
//		 *       
//		 *  *  *  * 
		

				
		
		
		
//		PATTERN 4 F LETTER PRINT
		
//		for (int i = 1; i <= n; i++) {
//		    for (int j = 1; j <= n; j++) {
//
//		        if (j == 1|| i == 1 || i==4) {
//		            System.out.print(" * ");
//		        }else {
//		        	System.out.print(" ");
//		        }
//		    }
//		    System.out.println();
//		}
		
		
		
		
		
	
//		PATTERN 3 
	 
		
//		for (int i = 1; i <= n; i++) {
//		    for (int j = 1; j <= n; j++) {
//
//		        if (j == 1 || i == n) {
//		            System.out.print(" L ");
//		        } else {
//		            System.out.print("  ");
//		        }
//		    }
//		    System.out.println();
//		}
		
		
		
		
		
		
//		PATTERN 2
		 
//		{
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				if(j == 2 || i ==2) {
//					System.out.print(" R ");
//				}else {
//				System.out.print(" * ");
//				}
//			}
//			System.out.println();
//
//		}
//
//	}
		
		
		
		
//		PATTERN 1 
		
		
//		{
//			for (int i = 1; i <= n; i++) {
//				for (int j = 1; j <= n; j++) {
//					System.out.print(" * ");
//				}
//				System.out.println();
//
//			}
//
//		}

	}
}
