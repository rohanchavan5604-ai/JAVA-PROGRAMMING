package Array;

import java.util.Scanner;

public class p10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];

		System.out.println("Enter 5 elements:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {

			int c = 0;

			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					c++;
				}
			}

			if (c == 2) {
				System.out.println(arr[i] + " Prime");
			} else {
				System.out.println(arr[i] + " Not Prime");
			}
		}
	}
}