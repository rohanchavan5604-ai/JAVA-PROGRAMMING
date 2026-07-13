package Array_PM;

public class SelectionSortArr {

	public static void main(String[] args) {

		int a[] = { 1, 4, 7, 2, 5, 3 };

		for (int i = 0; i < a.length; i++) {

			int min = i;
			for (int j = i + 1; j < a.length; j++) {

				if (a[min] > a[j]) {

					min = j;

				}

			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;

			System.out.println(a[i]);
		}

	}

}
