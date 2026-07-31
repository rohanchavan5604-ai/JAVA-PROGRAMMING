package Collection_PM;

import java.util.PriorityQueue;

public class Search_Given_Element_PR {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int ele = 3;
		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();

		for (int i = 1; i <= a.length; i++) {

			p1.add(i);

		}

		System.out.println(p1);

		int c = 0;

		for (int i = 1; i <= p1.size(); i++) {

			if (p1.poll() == ele) {

				c++;
//				System.out.println("Found");  // for Complexity
//				break;

			}

		}
		if (c == 0) {
			System.out.println("Not Found");
		} else {
			System.out.println("Found");
		}
	}
}