package Array_PM;

public class Arr1 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int ele = 3;
		int c = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == ele) {

				c++;

			}

		}

		if (c == 0) {
			System.out.println(ele+" is not present in array ");
		} else {
			for (int i = 0; i < a.length; i++) {

				if (a[i] != ele) {

					System.out.println(a[i]);

				}

			}
		}
	}

}
