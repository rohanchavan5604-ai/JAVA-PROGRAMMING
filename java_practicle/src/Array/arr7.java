package Array;

import java.util.Scanner;

public class arr7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] Week = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		int arr[][] = { { 10, 22 }, { 13, 24 }, { 14, 34 }, { 16, 25 }, { 25, 26 }, { 19, 30 }, { 27, 32 } };

		System.out.println("Enter your week Day: ");
		String WeekDay = sc.nextLine();

		int c = 0;

		for (int i = 0; i < 7; i++) {

			if (Week[i].equals(WeekDay)) {

				c++;

				for (int j = 0; j < 2; j++) {

					if (j == 0) {

						System.out.println("Min temp: " + arr[i][j]);

					} else {
						System.out.println("Max temp: " + arr[i][j]);
					}

				}

			}

		}
		if (c == 0) {
			System.out.println("Invalid Day");
		}
	}

}
