package Array;

public class p6 {

	public static void main(String[] args) {

		int arr[] = {  1, 2, 3, 4, 5,6};
		
		for(int i=0; i<arr.length;i++) {
			
			if(i%2==0) {
				System.out.println("Pos"+arr[i]+" "); 
			}	else{
				System.out.println("Neg"+arr[i]+" ");
			}
		}

		
//		for (int i = arr.length - 1; i >= 0; i--) { 
//
//			System.out.print(arr[i] + " ");
//
//		}
		
		
	}

}
