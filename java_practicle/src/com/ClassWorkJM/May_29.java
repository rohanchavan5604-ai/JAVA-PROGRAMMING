package com.ClassWorkJM;

public class May_29 {

	public static void main(String[] args) {
 		
		int num1 = 166;
		int num2 = 195;
		int max = 0;

		switch (1) {
      	case 1:
			if (num1 > num2){
				max = num1;
				System.out.println(num1 + "is Greater than: " + num2);
			}else{
				max = num2;
				System.out.println(num2 + "is Greater than: " + num1);
			}
			break;
		}
		System.out.println("Max Number Is: " + max);

	
	}
}