package Array_PM;

public class FrequencyFindArray {

	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 9, 6, 6, 2, 1, 2, 3, 9, 3, 3 };

		for (int j = 0; j <= 9; j++) {
			int c = 0;
			for (int i = 0; i < a.length; i++) {

				if (a[i] == j) {

					c++;

				}

			}
			if (c != 0) {
				System.out.println("Count of " + j + " is = " + c);
			}
		}

	}

}
