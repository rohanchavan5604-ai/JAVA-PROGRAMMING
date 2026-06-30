package Array;

public class Arr2 {

	public static void main(String[] args) {

		int phy[][] = { { 45, 67 }, { 45, 78 } };
		int che[][] = { { 75, 67 }, { 45, 68 } };
		int bio[][] = { { 42, 57 }, { 85, 48 } };

		int total[][] = new int[2][2];
		int topper = 0;

		for (int i = 0; i < total.length; i++) {
			for (int j = 0; j < total[i].length; j++) {

				total[i][j] = phy[i][j] + che[i][j] + bio[i][j];

				if (total[i][j] > topper) {
					topper = total[i][j];
				}
			}
		}

		System.out.println("Class Marks:");

		for (int i = 0; i < total.length; i++) {
			for (int j = 0; j < total[i].length; j++) {
				System.out.print(total[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Class Topper: " + topper);

		System.out.println("====================================");

		System.out.println("Marks Ascending Order Wise:");

		for (int i = 0; i < total.length; i++) {
			for (int j = 0; j < total[i].length; j++) {
				for (int k = 0; k < total.length; k++) {
					for (int l = 0; l < total[k].length; l++) {

						if (total[i][j] < total[k][l]) {
							int temp = total[i][j];
							total[i][j] = total[k][l];
							total[k][l] = temp;
						}
					}
				}
			}
		}

		for (int i = 0; i < total.length; i++) {
			for (int j = 0; j < total[i].length; j++) {
				System.out.print(total[i][j] + " ");
			}
			System.out.println();
		}
	}
}