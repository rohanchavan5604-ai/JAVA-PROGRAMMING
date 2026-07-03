package Array_PM;

public class RemoveDup_Arr {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 3, 2, 1 };

		for (int i = 0; i < a.length; i++) { // 0<6 1<6 2<6 3<6 4<6 5<6 6<6F

			int c = 0;

			for (int j = i + 1; j < a.length; j++) { // i=0  1<6 2<6 3<6 4<6 5<6 6<6F
													// i=1  2<6 3<6 4<6 5<6 6<6F
													// i=2  3<6 4<6 5<6 6<6F
													// i=3  4<6 5<6 6<6F
													// i=4  5<6 6<6F
													// i=5  6<6F

				if (a[i] == a[j]) { // i=0  1==2F 1==3F 1==3F 1==2F 1==1T
									// i=1  2==3F 2==3F 2==2T 2==1F
									// i=2  3==3T 3==2F 3==1F
									// i=3  3==2F 3==1F
									// i=4  2==1F

					c++; // i=0 : c=1
							// i=1  c=1
							// i=2  c=1
				}
			}

			if (c == 0) { // 1==0F 1==0F 1==0F 0==0T 0==0T 0==0T
				System.out.println(a[i]); // 3
										  // 2
										 // 1
			}
		}
	}
}