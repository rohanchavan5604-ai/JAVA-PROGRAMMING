package Array;

public class july_1 {

	public static void main(String[] args) {

		int arr[][] = { {1,2,3}, {4,5,6}, {7,8,9} };

		for (int i = 0; i < arr.length; i++) {

			int RowSum = 0;

			for (int j = 0; j < arr[i].length; j++) {
				RowSum = RowSum + arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("Sum of row: " + RowSum);
		}
		
		System.out.println("======================================================");
		
		for(int k=0; k<arr[0].length;k++) {
			
			int ColSum = 0;
			 
			for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i][k]+" ");
				ColSum = ColSum + arr[i][k];
			}
			
			System.out.println("Sum of Col: "+ColSum);
			
		}
		
		
		
	}
}