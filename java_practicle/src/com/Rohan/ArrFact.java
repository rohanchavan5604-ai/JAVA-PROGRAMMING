package com.Rohan;

public class ArrFact {

	public static void main(String[] args) {
		
		int arr[] = {6,2,5,7,3};
		
		for(int i=0; i<arr.length; i++) {
			
		int 	fact = 1;
		
		for(int j=1; j<=arr[i]; j++) {
			
			fact = fact * j;
			
		}
		
		System.out.println("Factorial of "+arr[i] +" is: "+fact);
		
		}
		
		
		
	}
	
}
