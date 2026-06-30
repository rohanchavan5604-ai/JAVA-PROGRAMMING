package Array_PM;

public class arr4 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {

			int c = 0;

			for (int j = 1; j <= a[i]; j++) {

				if (a[i] % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.println(a[i]);

			}

		}

	}

}
