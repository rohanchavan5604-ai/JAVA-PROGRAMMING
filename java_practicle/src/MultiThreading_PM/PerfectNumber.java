package MultiThreading_PM;

public class PerfectNumber {

	public static void main(String[] args) {

		int a[] = { 1, 6, 12, 28, 544 };

		for (int j = 0; j < a.length; j++) {

			int sum = 0;
			for (int i = 1; i < a[j]; i++) {

				if (a[j] % i == 0) {

					sum = sum + i;

				}

			}

			if (sum == a[j]) {
				System.out.println("Perfect Numbers = " + a[j]);
			}
		}

	}

}
