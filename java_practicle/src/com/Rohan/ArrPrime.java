package com.Rohan;

public class ArrPrime {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,65,4,9,1,17};
		
		for(int i=0; i<arr.length; i++) {
			
			int c=0;
			
			 for(int j=1; j<=arr[i]; j++) {
				 
				if(arr[i]%j==0) {
					
					c++;
					
				} 
				 
			 }
			if(c==2) {
				System.out.println(arr[i]);
			}
		}
		
	}
	
}
