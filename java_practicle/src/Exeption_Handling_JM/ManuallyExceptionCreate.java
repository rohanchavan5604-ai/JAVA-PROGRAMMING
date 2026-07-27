package Exeption_Handling_JM;

import java.util.Scanner;

class RohanException extends Exception {

	RohanException(String s) {

		super(s);

	}

}

public class ManuallyExceptionCreate {

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your Percentage: ");
			double per = sc.nextDouble();

			if (!(per >= 0 && per <= 100)) {

				throw new RohanException("Invalid percentage = " + per);

			} else {
				System.out.println("Your percentage = " + per);
			}

		} catch (RohanException e) {

			System.out.println(e);

		}

	}

}
