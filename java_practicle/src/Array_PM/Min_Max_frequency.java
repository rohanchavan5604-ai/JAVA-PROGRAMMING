package Array_PM;

public class Min_Max_frequency {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 2, 2, 2, 3, 3, 3, 4 };

		/*
		 *  1 -> 2
		 *  2 -> 3 
		 *  3 -> 4 
		 *  4 -> 1
		 */

		// Max frequency = 3 4
		// Min Frequency = 4 1

		int maxF = Integer.MIN_VALUE;
		int minF = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int c = 0;
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {

					c++;

				}

			}
			if (c == 0) {
				for (int k = 0; k < arr.length; k++) {

					if (arr[i] == arr[k]) {

						c++;
					}

				}

			}

			if (c > maxF) {
				maxF = c;
			}
			if (c < minF) {

				minF = c;

			}

		}

		System.out.println("Max: " + maxF);
		System.out.println("Min: " + minF);
	}

}
