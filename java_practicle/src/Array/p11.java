package Array;

import java.util.Scanner;

public class p11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[3];

		System.out.println("Enter 3 numbers:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];
			int temp = num;
			int rev = 0;

			while (num > 0) {
				int rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}

			if (temp == rev) {
				System.out.println(temp + " is Palindrome");
			} else {
				System.out.println(temp + " is Not Palindrome");
			}
		}
	}
}