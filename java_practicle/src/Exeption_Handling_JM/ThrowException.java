package Exeption_Handling_JM;

import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {

		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your Percentage: ");
			double per = sc.nextDouble();
			
			if(!(per>=0 && per<=100)) {
				
				throw new Exception("Invalid percentage = "+per);
				
			}
			else {
				System.out.println("Your percentage = "+per);
			}
			
			
		}catch(Exception e) {
			
			System.out.println(e);
			
		}
		
	}

}
