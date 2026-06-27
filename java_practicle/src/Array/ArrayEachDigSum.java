package Array;

public class ArrayEachDigSum {

	public static void main(String[] args) {
		 
		int arr[] = { 153, 370, 378, 407, 123, 100 };

		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];
			int sum = 0;

			while (num > 0) {
				int rem = num % 10;
				sum = sum + rem;
				num = num / 10;
			}

			System.out.println("Original Number: "+arr[i] + "   Sum of Digit: " + sum);

		}

	}

}
