package Array;

public class ArrayDuplicateFind {

	public static void main(String[] args) {

		int arr[] = {12, 34, 12, 5, 12};

		for (int i = 0; i < arr.length; i++) {

			int x = 0;

 			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					x++;
				}
			}

 			boolean first = true;

			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					first = false;
					break;
				}
			}

			if (first) {
				System.out.println(arr[i] + " - " + x + " times");
			}
		}
	}
}