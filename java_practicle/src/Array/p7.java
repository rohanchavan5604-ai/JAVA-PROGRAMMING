package Array;

import java.util.Scanner;

public class p7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Arr Size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter Array Numbers:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Number after skipping first or last element:");

		for (int i = 1; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}