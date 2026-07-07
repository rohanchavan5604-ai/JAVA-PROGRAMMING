package Array_PM;

public class NonZeroPrintFirstUsingIndex {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0 };

		int index = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {

				arr[index++] = arr[i];

			}
		}
		for (int i = index; i < arr.length; i++) {

			if (arr[i] != 0) {

				arr[i] = 0;

			}

		}
		for (int j = 0; j < arr.length; j++) {

			System.out.println(arr[j]);

		}

	}

}
