package Collection_PM;

import java.util.HashSet;

public class SearchGivenEle {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 33, 22, 1 };
		int ele = 33;
		
		HashSet<Integer> h = new HashSet<>();

		for (Integer a1 : a) {

			h.add(a1);

		}
		int c = 0;
		for (Integer s : h) {

			if (s == ele) {

				System.out.println("Found");
				c++;
			}

		}
		if (c == 0) {
			System.out.println("Not Found");
		}

	}

}
