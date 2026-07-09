package Array_PM;

import java.util.Arrays;

public class ArraysDiffCharString {

	public static void main(String[] args) {
		
		int arr [] = {1,6,9,4,5};
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		
		 
		char ch [] = {'A','E', '$', 'y', 'R', 'p' };
		
		Arrays.sort(ch);
		
		System.out.print(ch);
		
		
		String str [] = {"Rohan","Chavan","rc","Bastawade"};
		
		Arrays.sort(str);
		
		for(int i=0; i<str.length; i++) {
			
			System.out.print("\n"+str[i]);
			
		}
		
	}
	
}
