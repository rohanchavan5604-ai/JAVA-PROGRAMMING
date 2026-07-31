package Collection_PM;

import java.util.PriorityQueue;

public class SortingUsingPriorityClass {

	public static void main(String[] args) {

		int a[] = { 2, 3, 5, 6, 4, 1 };

		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();
		PriorityQueue<Integer> p2 = new PriorityQueue<Integer>();
		for (int i = 0; i < a.length; i++) {

			p1.add(a[i]);

		}

		while (!p1.isEmpty()) {
			p2.add(p1.poll());
		}
		System.out.println(p2);

	}

}
