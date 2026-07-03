package Array_PM;

public class arr7 {

	public static void main(String[] args) {

		int a[] = { 1, -3, 9, -2, 5, -7, 8 };

		int b[] = new int[a.length];
		int index = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] >= 0) {

				b[index] = a[i];
				index++;
			}
		}

		for (int i = 0; i < a.length; i++) {

			if (a[i] < 0) {

				b[index] = a[i];
				index++;
			}
		}

		System.out.println("B array:");
		for (int i = 0; i < b.length; i++) {

			System.out.println(b[i] + " Index: " + i);
		}
	}
}