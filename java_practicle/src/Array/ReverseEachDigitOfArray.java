package Array;

public class ReverseEachDigitOfArray {

	public static void main(String[] args) {

		int arr[] = { 153, 370, 378, 407, 123, 100 };

		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];
			int rev = 0;

			while (num > 0) {
				int rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}

	System.out.println("Ori Num: " + arr[i] + " Rev Num: " + rev);

		}
	}
}
