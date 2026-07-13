package Array;

public class MultiDimArray {

	public static void main(String[] args) {

//		LITRAL WAY 
		
		int a[][][] = {

				{ { 1, 2 }, { 3, 4 } },
				{ { 5, 6 }, { 7, 8 } }

		};

		for (int k = 0; k < a.length; k++) {

			for (int i = 0; i < a.length; i++) {

				for (int j = 0; j < a.length; j++) {

					System.out.print(a[k][i][j] + " ");

				}
				System.out.println();

			}
			System.out.println();

		}

	}

}
