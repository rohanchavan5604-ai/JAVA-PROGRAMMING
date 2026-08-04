package Collection_PM;

import java.util.HashSet;

public class MaxFind {

	public static void main(String[] args) {

		HashSet<Integer> h = new HashSet<>();
		h.add(1);
		h.add(65);
		h.add(22);
		h.add(12);

		System.out.println(h);

		int min = Integer.MAX_VALUE;

		for (Integer s : h) {

			if (s < min) {

				min = s;

			}

		}
		System.out.println("Min is: " + min);

		int temp = Integer.MIN_VALUE;

		for (Integer s : h) {

			if (s > temp) {

				temp = s;

			}

		}
		System.out.println("Max is: " + temp);

	}

}
