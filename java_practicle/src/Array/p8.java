package Array;

public class p8 {

	public static void main(String[] args) {
		int arr[]= {23,56,78,87,65,43};
		
		int arr1[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
			
			
		}
		System.out.println("Copied Array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

	}

}