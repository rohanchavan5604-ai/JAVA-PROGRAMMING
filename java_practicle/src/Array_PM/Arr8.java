package Array_PM;

public class Arr8 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 1 };

		for (int i = 0; i < arr.length; i++) {

//			0  0 < 4 T
//			1  1 < 4 T
//			2  2 < 4 T
//			3  3 < 4 T
//			4  4 < 4 F

			int c = 0;

			for (int j = 0; j < i; j++) {

//				0  0<0 F
//				0  0<1 T    1  1<1 F
//				0  0<2 T    1  1<2 T    2 2<2 F
//				0  0<3 T    1   1<3 T   2 2<3 T  3<3F

				if (arr[i] == arr[j]) {

//					2 == 2 T
//					1 == 1 T

					c++;
					break;

				}

			}

			if (c == 0) { // 0==0 T 0==0T
				System.out.println(arr[i]); // 1 2
			}
		}

	}

}
