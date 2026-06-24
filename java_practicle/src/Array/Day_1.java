package Array;

import java.util.Scanner;

public class Day_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size: ");
		int size = sc.nextInt();
		int arr1[] = new int[size];
		int i;
		System.out.println("Enter " + arr1.length + " array elementes: ");

		for (i = 0; i < arr1.length; i++) {

			arr1[i] = sc.nextInt();
		}
		System.out.println("Array elementes are: ");
		for (i = 0; i < arr1.length; i++) {

			System.out.print(arr1[i] + " ");
		}

	}
}