package com.ClassWorkPM;

import java.util.Scanner;

public class WhileArmPelindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
 
		
//		 ARMSTRONG NUMBER LMS QUESTION 
		

		int num = 908070;
		int num1 = num;
		int c = 0;
		while(num>0) {
			c++;
			num = num /10; 
		}
		System.out.println(c);  //6
		
		int rem = 0;
		int sum = 0;
		int temp = num1;
		while(num1>0) {   // 908070>0 T 90807>0 T 9080>0 T 908>0 T 90>0 T 9>0 T 0>0 F Loop terminate
			
			rem = num1 % 10;
			//	908070 % 10 = 0
			//	90807 % 10 = 7
			//	9080 % 10 = 0
			//	908 % 10 = 8
			//	90 % 10 = 0
			//	9 % 10 = 9
			sum += Math.pow(rem, c); //0^6= 0  7^6 = 117649  0^6=0  8^6= 262144  0^6 = 0  9^6 = 531441
			num1 = num1 / 10; 
			// 908070 / 10 = 90807
			// 90807 / 10 = 9080
			// 9080 / 10 = 908
			// 908 /10 = 90
			// 90 / 10 = 9
			// 9/10 = 0
			
			
		}
		System.out.println("Sum : "+ sum); //117649 + 262144 + 531441 = 911234
		if(temp == sum) { // 908070 == 911234 F so else block to be execute 
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
		
		
		
//		ARMSTRONG NUMBER USING SCANNER
		
		
//		System.out.println("Enter an number: ");
//		int num = sc.nextInt();
//		int num1=num;
//		int t = num;
//		int c = 0;
//		while(num>0) {
//			c++;
//			num = num/10;
//		}
//		System.out.println(c);  
//		
//		int rem = 0;
//		int sum=0;
//		while(num1>0) {
//			rem = num1 %10;
//			sum += Math.pow(rem, c);
//			num1 = num1/10;
//		}
//		System.out.println(sum);
//		if(t==sum) {
//			System.out.println("Armstrong");
//		}else {
//			System.out.println("Not");
//		}




//			ARMSTRONG NUMBER


		//		int num = 153;
		//		int rem = 0;
		//		int t = num;
		//		int temp=0;
		//		while(num>0) {
		//			rem = num %10;
		//			temp = temp+rem*rem*rem;
		//			num = num/10;
		//		}
		//		System.out.println(temp);
		//		if(temp==t) {
		//			System.out.println("Armstrong");
		//		}else {
		//			System.out.println("Not");
		//		}



		
//		PELINDROME NUMBER
		

		//		int num = 252;
		//		int temp = num;
		//		int rem = 0; //2 5
		//		int rev = 0; //2 25
		//		while(num>0) { //252>0 T 25>0 T 2>0T 0>0F
		//			
		//			rem = num%10;  //252%10  2  25%10 5   2%10 2
		//			rev = rev * 10 + rem; // 0*10+2   2*10+5 25  25*10+2 252
		//            num = num /10;	 // 252/10  25   25/10 2  2/10 2
		//    	
		//		}
		//		System.out.println(rev); //2
		//        if(temp==rev) {
		//        	System.out.println("Pelindrome");
		//        }else {
		//        	System.out.println("Not");
		//        }



	}
}
