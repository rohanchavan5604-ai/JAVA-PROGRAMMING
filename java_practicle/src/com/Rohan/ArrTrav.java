package com.Rohan;

public class ArrTrav {

	public static void main(String[] args) {
		
		int arr[] = {4,5,6,3,1,2};
		
		int num = 5;
		int c=0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == num ) {
				
				c++;
				
			}
			
		}
		if(c==0) {
			System.out.println("Not Present");
		}else {
			System.out.println("Present");
		}
		
	}
	
}
