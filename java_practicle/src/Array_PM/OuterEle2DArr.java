package Array_PM;

public class OuterEle2DArr {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 6 }, { 4, 8, 6, 3 }, { 7, 8, 9, 5 }};

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (!(i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1)) {
					System.out.print("*");
				} else {
					System.out.print(j);
				}
			}
			System.out.println();

		}
		
		System.out.println("=============================================");
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if(!(i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1)) {
	
					if(arr[i][j] %2 ==0) {
						System.out.print(arr[i][j]);
					}
				}
				
				else {
					System.out.print("#");
				}
			}
			System.out.println();

		}

	}

}
