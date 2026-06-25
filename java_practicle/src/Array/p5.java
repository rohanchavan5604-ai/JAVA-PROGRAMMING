package Array;

public class p5 {

	public static void main(String[] args) {

		int arr[] = { -11, 34, -12, 32, -5, 6 };

		int MaxP = Integer.MIN_VALUE;
		int MaxN = Integer.MIN_VALUE;
		
		int MinP = Integer.MAX_VALUE;
		int MinN = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {
				if (arr[i] > MaxP)
					MaxP = arr[i];

				if (arr[i] < MinP)
					MinP = arr[i];
			}

			if (arr[i] < 0) {
				if (arr[i] > MaxN)
					MaxN = arr[i];

				if (arr[i] < MinN)
					MinN = arr[i];
			}
		}

		System.out.println("Max Positive Num: " + MaxP);
		System.out.println("Max Negative Num: " + MaxN);
		System.out.println("=======================================");
		System.out.println("Min Positive Num: " + MinP);
		System.out.println("Min Negative Num: " + MinN);
	}
}