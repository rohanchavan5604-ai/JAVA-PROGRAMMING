package Array;

public class arr5 {

	public static void main(String[] args) {

		int arr[][] = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
 
		System.out.println("Original Matrix:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
 
		System.out.println("Main Diagonal:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (i == j)
					System.out.print(arr[i][j] + " ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
 
		System.out.println("Secondary Diagonal:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (i + j == arr.length - 1)
					System.out.print(arr[i][j] + " ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
}