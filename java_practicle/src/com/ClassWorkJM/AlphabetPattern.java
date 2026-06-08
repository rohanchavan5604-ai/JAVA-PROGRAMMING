package com.ClassWorkJM;

import java.util.Scanner;

public class AlphabetPattern {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name : ");
		String name = sc.next();
		
		for(int i=0; i<name.length(); i++) {
			for(int j=0; j<=i;j++) {
				System.out.print(name.charAt(j));
			}
			System.out.println();
		}
		
		
		
		for(int i=1; i<= name.length(); i++) {
			System.out.println(name.substring(0, i));
		}
		
		
		
		
		
// for(int i=1; i<=5; i++) {
//	 for(int l=1; l<=i;l++) {
//		 System.out.print(l);
//	 }
//	 for(int r =i-1; r>=1;r--) {
//		System.out.print(r); 
//	 }
//	 System.out.println();
// }
	
		
		
//		 for(char i='A'; i<='E'; i++) {
//			 for(char p ='D'; p>=i;p--) {
//				 System.out.print(" ");
//			 }
//			 for(char l='A'; l<=i;l++) {
//				 System.out.print(l);
//			 }
//			 for(char r =(char) (i-1); r>='A';r--) {
//				System.out.print(r); 
//			 }
//			 System.out.println();
//		 }
//		
		
		
		
//		for (int i = 0; i < 6; i++) { 
//
//			char ch = (char) ('A' + i);
//
//			for (int j = 0; j <= i; j++) {
//				System.out.print(ch + " ");
//				ch += 5;
//			}
//
//			System.out.println();
//		}
		
		
		
		
//		char ch;
//		for(int i=1; i<=6;i++) {
//			ch = (char)('A'+ i-1);
//			for(int j=0; j<i;j++) {
//				System.out.println(ch--);
//			}
//			System.out.println();
//		}
		
		
		
		
		 
//        for (int i = 0; i < 6; i++) {
//
//            char ch = (char) ('A' + i);
//
//            for (int j = 0; j <= i; j++) {
//                System.out.print(ch + " ");
//                ch += 5;
//            }
//
//            System.out.println();
//        }
		
		
 	
		
		
//		pelindrome pattern
		
//		for(char i='A'; i<='E';i++) {
//			for(char j='A'; j<=i; j++) {
//				System.out.print(j);
//			}
//			
//			for(char j = (char)(i-1);j>='A'; j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
//		for(char i='A'; i<='E';i++) {
//			for(char j='E'; j>=i;j--) {
//				
//				System.out.print(j);
//		 
//			}
//			System.out.println();
//		}
		
		
		
//		pyramid of Char
	
//		for(char i='A'; i<='E';i++) {
//			for(char j='E'; j>=i;j--) {
//				
//				System.out.print(" ");
//			}
//			for(char k='A'; k<=i;k++) {
//				System.out.print(k+" ");
//			}
//			System.out.println();
//		}
		
		
		
 
		
		
//		for( char i='F'; i>='A';i--) {
//			
//			for(char j=i; j>='A'; j--) {
//				
//				System.out.print(j+" ");
//				
//			}
//			
//			System.out.println();
//		}
//		for( char i='B'; i<='F';i++) {
//			
//			for(char j=i; j>='A'; j--) {
//				
//				System.out.print(j+" ");
//				
//			}
//			
//			System.out.println();
//		}
		
		
		
		
		
		
//		using  Up to 9 value	
		
		
//		for(int i = 1; i <= 9; i++) {
//
//		    for(char j = 'A'; j <= 'E'; j++) {
//
//		        if(i <= 5 && j <= ('A' + i - 1)) {
//		            System.out.print(j);
//		        }
//		        else if(i > 5 && j <= ('A' + (9 - i))) {
//		            System.out.print(j);
//		        }
//
//		    }
//
//		    System.out.println();
//		}
		
		
		
		
		
//		Pattern To Print Character Triangle
		
	
//		for(char i ='A'; i<='E';i++) {
//			
//			for(char j='A'; j<=i; j++) {
//				
//				System.out.print(j);
//				
//			}
//			System.out.println();
//			
//		}
//		for(char i ='D'; i>='A';i--) {
//			
//			for(char j='A'; j<=i; j++) {
//				
//				System.out.print(j);
//				
//			}
//			System.out.println();
//			
//		}
		
		
		
		
		
//		Pattern To Print Half trangle pyramid
		
		
//		for(char i ='A'; i<='E';i++) {
//			
//			for(char j='A'; j<=i; j++) {
//				
//				System.out.print(i);
//				
//			}
//			System.out.println();
//			
//		}
//		for(char i ='D'; i>='A';i--) {
//			
//			for(char j='A'; j<=i; j++) {
//				
//				System.out.print(i);
//				
//			}
//			System.out.println();
//			
//		}
	
		
		
		
		
//		Pattern  REVERSE PATTERN A-E TO A
		
		
//		for(char i ='E'; i>='A';i--) {
//			
//			for(char j='A'; j<=i; j++) {
//				
//				System.out.print(j);
//				
//			}
//			System.out.println();
//			
//		}	
		
		
		
		
//	 NESTED CHAR LOOP 

		
//		for(char i ='A'; i<='E';i++) {
//			
//			for(char j='A'; j<='E'; j++) {
//				
//				System.out.print(j);
//				
//			}
//			System.out.println();
//			
//		}
		
		
		
			
//		CHAR LOOP 
		
		
//		for(char i ='A'; i<='E';i++) {
//			
//			for(int j=1; j<=5; j++) {
//				
//				System.out.print(i);
//				
//			}
//			System.out.println();
//			
//		}
		
		
		
//		ALPHABET PATTERN
		
		
		
//		char ch = 'A';                   // first method 
////		int ch = 65;					// using asc values
//		for(int i=1; i<=5; i++) {
//			for( int j=1; j<=5; j++) {
//				System.out.print(ch);    
////				System.out.print((char)ch);   // using type casting 
//				
////				ch++;                   	  // FULL A-Y PRINT
//			}
//			ch++;                             // AAAAA BBBBB CCCCC DDDDD EEEEE
//			System.out.println();
//		}
		
		
		
		
	}

}
