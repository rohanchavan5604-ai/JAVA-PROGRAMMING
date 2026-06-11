package com.Rohan;

public class WhileLoopPractice {

	public static void main(String[] args) {
		
		
//		Anather way of Prime 
		
		int num = 17;
		int c = 0;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				c++;
			}
		}
		if(c==0) {
			System.out.println("Prime ");
		}else {
			System.out.println("Not ");
		}
		
		
//	Prime Number 
		
//		int num = 17;
//		int c = 0;
//		for(int i=1; i<=num; i++) {
//			if(num%i==0) {
//				c++;
//			}
//		}
//		if(c==2) {
//			System.out.println("Prime ");
//		}else {
//			System.out.println("Not ");
//		}
		
		
		
		
		
//	PALINDROME 	
		
		
//		int num = 12345;
//		int temp = num;
//		int rev = 0;
//		while(num>0) {
//			int rem = num % 10;
//			rev = rev * 10 + rem;
//			num /= 10;
//		}
//	    if(temp == rev) {
//	    	System.out.println("Palindrome");
//	    }else {
//	    	System.out.println("Not palindrome");
//	    }
		
			
		
		
		
//		Palindrome check
		
//		int num = 12321;
//		int temp = num;
//		int rev = 0;
//		while(num>0) {
//			int rem = num % 10;
//			rev = rev * 10 + rem;
//			num /= 10;
//		}
//	    if(temp == rev) {
//	    	System.out.println("Palindrome");
//	    }else {
//	    	System.out.println("Not palindrome");
//	    }
		
		
		
		
//		reverse the number
		
//		int num = 40406;
//		int rev = 0;
//		while(num>0) {
//			int rem = num % 10;
//			rev = rev * 10 + rem;
//			num = num / 10;
//		}
//		System.out.print(rev);
		
		
	}
}
