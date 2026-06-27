package Array;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int arr[] = { 153, 370, 378, 407, 123, 100 };

		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];
			int t = num;
			int sum = 0;

			while (t > 0) {
				int rem = t % 10;
				sum = sum + (rem * rem * rem);
				t = t / 10;
			}

			if (sum == num) {
				System.out.println(arr[i]+" Aramstrong Num");
			} else {
				System.out.println(arr[i]+" Not Armstrong Num");
			}
		}
	}
}