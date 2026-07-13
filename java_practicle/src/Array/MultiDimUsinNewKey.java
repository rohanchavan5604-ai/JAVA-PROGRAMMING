package Array;

import java.util.Scanner;

public class MultiDimUsinNewKey {

	public static void main(String[] args) {
		
//		MULTIDIMESIONAL ARRAY USING NEW KEYWORD

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No of Arr");
		int Narr = sc.nextInt();

		System.out.println("Enter No of Rows");
		int Nrow = sc.nextInt();

		System.out.println("Enter No of Col");
		int Ncol = sc.nextInt();

		int a[][][] = new int[Narr][Nrow][Ncol];

		System.out.println("Enter " + Narr * (Nrow * Ncol) + " elements: ");

		for (int k = 0; k < a.length; k++) {

			for (int i = 0; i < a.length; i++) {

				for (int j = 0; j < a.length; j++) {

					a[k][i][j] = sc.nextInt();

				}
			}
		}

		for (int k = 0; k < a.length; k++) {

			for (int i = 0; i < a[k].length; i++) {

				for (int j = 0; j < a[k][i].length; j++) {

					System.out.print(a[k][i][j] + " ");

				}
				System.out.println();

			}
			System.out.println();

		}

	}

}
