package MultiThreading_PM;

public class PerfectNumber {

	public static void main(String[] args) {

		int a[] = { 1, 6, 12, 28, 544 };

		for (int i = 0; i < a.length; i++) {

			int sum = 0;

			for (int j = 1; j < a[i]; j++) {

				if (a[i] % j == 0) {

					sum = sum + j;

				}

			}

			if (sum == a[i]) {

				System.out.println("Perfect Number = " + a[i]);

			}

		}

	}

}