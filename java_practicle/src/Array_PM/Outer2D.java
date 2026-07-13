package Array_PM;

public class Outer2D {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 ,6}, { 4, 5, 6,3 }, { 7, 8, 9,7 },{7,4,3,2} };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (i == 0 || i == arr.length - 1 || j == 0 || j == arr.length - 1) {
					
					System.out.print(arr[i][j]);
					
				} else {
					
					System.out.print("*");
				}

			}
			System.out.println();

		}

	}

}
