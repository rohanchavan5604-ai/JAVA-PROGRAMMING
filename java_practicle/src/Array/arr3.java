package Array;

public class arr3 {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, { 2, 5, 6, 7 }, { 3, 6, 8, 9 }, { 4, 7, 9, 10 } };
		int x = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (!(arr[i][j] == arr[j][i])) {

					x++;
					break;
				}

			}

		}

		if (x >= 1) {

			System.out.println("Not Symetric");

		} else {
			System.out.println("Symetric");
		}

	}

}
