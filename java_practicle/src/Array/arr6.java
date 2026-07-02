package Array;

public class arr6 {

	public static void main(String[] args) {

		int arr[] = { 10, 7, 5, 34, 16 };
		int SinSum = 0;
		int DouSum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0 && arr[i] < 10) {

				SinSum = arr[i] + SinSum;

			} else if (arr[i] >= 10 && arr[i]<100) {

				DouSum = arr[i] + DouSum;

			}

		}

		System.out.println("Single digit Sum: "+SinSum);
		System.out.println("Double Digit Sum: "+DouSum);
	}

}
