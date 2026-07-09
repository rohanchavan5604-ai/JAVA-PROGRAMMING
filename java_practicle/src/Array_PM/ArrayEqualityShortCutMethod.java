package Array_PM;

import java.util.Arrays;

public class ArrayEqualityShortCutMethod {

	public static void main(String[] args) {
		
		int a[] = {1,2,3};
		int b[] = {1,2,3};
		
		if(Arrays.equals(a, b)) {
			
			System.out.println("Array is Same");
			
		}else {
			System.out.println(" Array Not Same");
		}
		
	}
	
}
