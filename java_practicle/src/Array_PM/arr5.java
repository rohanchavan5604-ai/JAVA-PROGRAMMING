package Array_PM;

public class arr5 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };

		int r = 3;
		int index = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int p = 0; p < a.length - (r - 1); p++) {

			int add = 0;
			for (int s = p; s < p + r; s++) {

				System.out.print(a[s] + " ");
				add = add + a[s];
			}
			System.out.println("  Sum: " + add);

			if (add < min) {
				min = add;
				index = p;
			}

			if (add > max) {
				max = add;
			}

		}
		System.out.println("Min: " + min +"Avg: "+ min/r +"Index: "+index);
		System.out.println("Max: "+max);

	}

}
