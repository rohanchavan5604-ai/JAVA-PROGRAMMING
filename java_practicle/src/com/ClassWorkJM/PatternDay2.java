package com.ClassWorkJM;

public class PatternDay2 {

	public static void main(String[] args) {
 	
		
//		DIAMOND PATTERN
		
		for (int i = 1; i <= 5; i++) {

			for (int sp = 5; sp > i; sp--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 4; i >= 1; i--) {

			for (int sp = 5; sp > i; sp--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
 
		
		
		
//		Making cake using Diff Symbols 
		
		
//        for(int i = 1; i <= 2; i++) {
//            System.out.println("    |");
//        }
//
//        for(int i = 1; i <= 3; i++) {
//            System.out.print(" ");
//            for(int j = 1; j <= 3; j++) {
//
//                if(i == 1 || i == 3 || j == 1 || j == 3) {
//                    System.out.print("*  ");
//                } else {
//                    System.out.print("   ");
//                }
//
//            }
//            System.out.println();
//        }
//
//        for(int i = 1; i <= 5; i++) {
//            for(int j = 1; j <= 5; j++) {
//
//                if(i == 1 || i == 5 || j == 1 || j == 5) {
//                    System.out.print("^ ");
//                } else {
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println();
//        }
    
		
		
		
//	 half triangle	
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				if (i == 5 || j == 1 || i == j) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
 
		
		
		
//	HOLLO  SQUAR PATTERN :-
		
//        for(int i =1; i<=5; i++){
//            for(int j=1; j<=4;j++){
//                if(i==1 || j==1|| i==5|| j==4){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }	
		
		

		
        
        
	}
}
