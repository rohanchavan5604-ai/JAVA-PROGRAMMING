package Exeption_Handling_JM;

import java.util.Scanner;

public class InputMismatchEX {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			int n = sc.nextInt();
			int v = sc.nextInt();

			System.out.println(n / v);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Input Mismatch Error");
	}
}