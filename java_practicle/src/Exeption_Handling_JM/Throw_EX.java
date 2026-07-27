package Exeption_Handling_JM;

import java.util.Scanner;

public class Throw_EX {

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your age: ");
			int age = sc.nextInt();

			if (!(age >= 18)) {

				throw new Exception("Age should be 18+ = " + age);

			} else {
				System.out.println("You are eligible for vote = " + age);
			}

		} catch (Exception e) {

			System.out.println(e);

		}

	}

}
