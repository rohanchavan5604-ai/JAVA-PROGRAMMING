package Exeption_Handling_JM;

import java.util.Scanner;

public class Nested_Try {

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Two Numbers: ");

			int n1 = Integer.parseInt(sc.nextLine());
			int n2 = Integer.parseInt(sc.nextLine());

			int ans = 0;

			try {
				ans = n1 / n2;
				System.out.println("Division: " + ans);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

		} catch (NumberFormatException e) {
			System.out.println(e);
		}
         catch(NullPointerException e) {
        	 System.out.println(e);
         }
	}

}
