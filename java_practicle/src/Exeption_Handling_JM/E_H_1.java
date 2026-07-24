package Exeption_Handling_JM;

import java.util.Scanner;

public class E_H_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			int i = 10;
			int j = 0;

			System.out.println(i / j); // Divide by 0 Exception
		} 
		catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Hello Java");

	}

}
