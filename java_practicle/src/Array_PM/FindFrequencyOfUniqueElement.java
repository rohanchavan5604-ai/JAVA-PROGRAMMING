package Array_PM;

public class FindFrequencyOfUniqueElement {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 4, 3, 1 };

		int c = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {

					c++;

				}

			}
			if (c == 0) {

				int c1 = 0;
				for (int k = 0; k < arr.length; k++) {

					if (arr[i] == arr[k]) {

						c1++;
					}

				}
				System.out.println(arr[i] + " Frequency: " + c1);
			}

		}

	}

}
