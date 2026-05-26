package com.ClassWorkPM;

public class XOR {

	public static void main(String[] args) {
		
		
//		int num = 500;
//		
//		int year =num / 365;
//		System.out.println("Year: "+year);
//  
//		int month = (num % 365) / 30;
//		System.out.println("Months: "+ month);  
//		
//		int week = ((num % 365) % 30)/7;
//		System.out.println("Week "+week); 
//		
//		int day =  ((num % 365) % 30) % 7;
//		System.out.println("Days: "+day);			
		
 
		
		
	int num = 500;
	
	int year =num / 365;
	System.out.println("Year: "+year);
		
	int rem = num % 365;
	System.out.println("Remaining Days: "+rem); 
	
	int month = rem / 30;
	System.out.println("Months: "+ month); 
		
	int rem1 = rem % 30;
	System.out.println("Remaining Day: "+rem1); 
	
	int week = rem1 / 7;
	System.out.println("Week "+week); 
	
	int day = rem1 % 7;
	System.out.println("Days: "+day);
		
		
		
		
//		VALUES SEPRATE USING / AND % OPERATOR
		
//		int num = 12345;
//		System.out.println(num%10);
//		
//	    num = num / 10; 
//		System.out.println(num%10);
//		
//		num = num / 10;
//		System.out.println(num % 10);
//		
//		num = num / 10;
//		System.out.println(num % 10);
//		
//		num = num / 10;
//		System.out.println(num % 10);
		
		
		
		
		
//		EX 2 XOR 
		
		
//		int a = 3; // 0011
//		int b = 6; // 0110
//		
//				   // 0101
//		
//		System.out.println(a+ " "+ b); // 3  6 
//		
//		a = a^b; // 3^6  = 0011 0110     0101  5
//		b = a^b; // 5^6 =  0101 0110     0011  3
//		a = a^b; // 15^8 = 0101 0011     0110  6
//		
//		System.out.println(a+ " "+ b); // 6   3
		
		
		
		
//		XOR operation With Hash map EX 1
		
//		int a = 8; // 1000
//		int b = 7; // 0111
//		
//				   // 1111
//		
//		System.out.println(a+ " "+ b);
//		
//		a = a^b; // 8^7  = 1000 0111     1111  15
//		b = a^b; // 15^7 = 1111 0111     1000  8
//		a = a^b; // 15^8 = 1111 1000     0111  7
//		
//		System.out.println(a+ " "+ b);
		
		
	}
}
