package com.ClassWorkPM;

public class Loop29may {

	public static void main(String[] args) {

		int num = 6;

		if (num < 0) {
			System.out.println("Negative");
		} else if (num > 0) {
			System.out.println("Positive");
			if (num % 2 == 0) {
				System.out.println("Even");

				int fact = 1;
				for (int i = 1; i <= num; i++) {
					fact = fact * i;
				}
				System.out.println(fact);
			} else {
				System.out.println("odd");
			}
		} else {
			System.out.println("Zero");
		}






		//	FACTORIAL OF NUMBER 	


		//		int num = 7;
		//		
		//		int fact = 1;
		//		
		//		for(int i=1; i<=num; i++) { //1 1<=num T 2 2<=num T 3 3<=num T 4 4<=num T 5 5<=num T 6<=num T 7<=7T 8<=7F Loop Terminate
		//			fact = fact * i;
		//			
		//			  /*   1 * 1 = 1
		//			   *   1 * 2 = 2
		//			   *   2 * 3 = 6
		//			   *   6 * 4 = 24
		//			   *   24 * 5 = 120
		//			   *   120 * 6 = 720
		//			   *   720 * 7 = 5040
		//			   * 
		//			   */
		//		}
		//		System.out.println(fact); //5040

	}
}
