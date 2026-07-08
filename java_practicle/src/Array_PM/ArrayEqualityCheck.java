package Array_PM;

public class ArrayEqualityCheck {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		int a[] = { 1, 2, 3, 5 };

		if (arr.length == a.length) {

			int c = 0;

			for (int i = 0; i < arr.length; i++) {

				if (arr[i] != a[i]) {

					c++;
					System.out.println("Not Equals");
					break;

				}
			}
			if (c == 0) {

				System.out.println("Equal ");

			}

		} else {
			System.out.println("Length not same");
		}

	}

}
