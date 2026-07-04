package Array_PM;

public class Arr9 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 4, 3, 1 };

		int c = 0;
		for (int i = 0; i < arr.length; i++) {

			int co = 0;
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {
					co++;

				}
			}
			if (co == 0) {
				System.out.println(arr[i]);
				c++;
			}
		}

  System.out.println("Assigning arr[i] In b[i]");

		int b[] = new int[c];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {

			int co = 0;
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {
					co++;

				}
			}
			if (co == 0) {
				b[index] = arr[i];
				index++;
			}
		}

		for (int i = 0; i < b.length; i++) {

			System.out.println(b[i] + " " + i);
		}

	}
}
