package Array;

import java.util.Scanner;

public class AdditionOfMatrixInMultiDim {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No of Rows");
		int Nrow = sc.nextInt();

		System.out.println("Enter No of Col");
		int Ncol = sc.nextInt();

		int a[][][] = new int[3][Nrow][Ncol];

 
		System.out.println("Enter First Array Elements");

		for (int i = 0; i < Nrow; i++) {

			for (int j = 0; j < Ncol; j++) {

				a[0][i][j] = sc.nextInt();

			}
		}
 
		System.out.println("Enter Second Array Elements");

		for (int i = 0; i < Nrow; i++) {

			for (int j = 0; j < Ncol; j++) {

				a[1][i][j] = sc.nextInt();

			}
		}
 
		for (int i = 0; i < Nrow; i++) {

			for (int j = 0; j < Ncol; j++) {

				a[2][i][j] = a[0][i][j] + a[1][i][j];

			}
		}

 
		System.out.println("\nFirst Array");

		for (int i = 0; i < Nrow; i++) {

			for (int j = 0; j < Ncol; j++) {

				System.out.print(a[0][i][j] + " ");

			}
			System.out.println();
		}

 
		System.out.println("\nSecond Array");

		for (int i = 0; i < Nrow; i++) {

			for (int j = 0; j < Ncol; j++) {

				System.out.print(a[1][i][j] + " ");

			}
			System.out.println();
		}

 
		System.out.println("\nAddition Array");

		for (int i = 0; i < Nrow; i++) {

			for (int j = 0; j < Ncol; j++) {

				System.out.print(a[2][i][j] + " ");

			}
			System.out.println();
		}
 
	}
}