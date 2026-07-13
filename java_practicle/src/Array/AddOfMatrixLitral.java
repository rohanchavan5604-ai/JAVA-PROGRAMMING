package Array;

public class AddOfMatrixLitral {

	public static void main(String[] args) {

		int a[][][] = {

				{ { 1, 22 }, { 2, 33 } }, 
				{ { 44, 5 }, { 66, 7 } }, 
				{ { 0, 0 }, { 0, 0 } } 

		};

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				if (a[0][i][j] > a[1][i][j]) {

					a[2][i][j] = a[0][i][j];

//					a[2][i][j] =a[0][i][j] + a[1][i][j];
					
				} else {
					a[2][i][j] = a[1][i][j];
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
