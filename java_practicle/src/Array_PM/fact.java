package Array_PM;

public class fact {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				int fact = 1;

				for (int j = 1; j <= a[i]; j++) {

					fact = fact * j;

				}
				System.out.println("Fact of "+a[i]+" "+fact);

			}

		}

	}

}
