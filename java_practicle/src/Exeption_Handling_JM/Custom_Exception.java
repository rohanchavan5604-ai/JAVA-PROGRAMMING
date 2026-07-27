package Exeption_Handling_JM;

import java.util.Scanner;

public class Custom_Exception extends Exception {

	public Custom_Exception(String s) {
		super(s);
	}

	public static void checkLogin(int attempts) throws Custom_Exception {

		if (attempts > 3) {
			throw new Custom_Exception("Maximum login attempts exceeded.");
		} else {
			System.out.println("Login Successful");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Login Attempts: ");
		int attempts = sc.nextInt();

		try {

			checkLogin(attempts);

		} catch (Custom_Exception e) {

			System.out.println(e.getMessage());

		}

	}
}