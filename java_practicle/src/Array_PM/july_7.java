package Array_PM;

public class july_7 {

	public static void main(String[] args) {

		int arr[] = { 1, 7, 2, 7, 1, 4, 7, 1, 5 };

		int index = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 7) {

				arr[index++] = arr[i];

			}
		}
		for (int i = index; i < arr.length; i++) {

			if (arr[i] != 7) {

				arr[i] = 7;
			}

		}
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}

	}

}
