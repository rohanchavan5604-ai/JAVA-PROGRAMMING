package com.Rohan;

public class Xor_Practice {

	public static void main(String[] args) {
		
/*	Challenge 😎👇

		int num = 1000;

		Convert this into:

		Years
		Months
		Weeks
		Days
*/		
		
		int num = 1000;
		
		int year = num / 365;
		System.out.println(year);
		
				
		int month = (num % 365) / 30;
		System.out.println(month);
		
		
		int week = ((num % 365) % 30) / 7;
		System.out.println(week);
		
		int days = ((num % 365) % 30) % 7;
		System.out.println(days);
		
	 
		
	}
}
