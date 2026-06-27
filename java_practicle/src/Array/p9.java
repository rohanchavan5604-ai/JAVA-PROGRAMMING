package Array;

import java.util.Scanner;

public class p9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[3];
		int fact[] = new int[arr.length];

		System.out.println("Enter 3 numbers:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {

			int factorial = 1;

			for (int j = 1; j <= arr[i]; j++) {
				factorial = factorial * j;
			}

			fact[i] = factorial;
		}

		System.out.println("Factorial Array:");

		for (int i = 0; i < fact.length; i++) {
			System.out.print(fact[i] + " ");
		}

	}
}