package Array_PM;

public class ArrayEquality {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 3 };

		if (a.length == b.length) {

			int c = 0;
			for (int i = 0; i < a.length; i++) {

				if (a[i] == b[i]) {
					c++;
				}
			}
			if (c == b.length) {
				System.out.println("Array same");

			} else {
				System.out.println("Array Not same");
			}

		} else {

			System.out.println("Length Not Same");

		}

	}
}
