package Collection_PM;

import java.util.PriorityQueue;

public class MergeTwoPRQueueInThird {

	public static void main(String[] args) {

		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();
		PriorityQueue<Integer> p2 = new PriorityQueue<Integer>();
		PriorityQueue<Integer> p3 = new PriorityQueue<Integer>();

		p1.add(1);
		p1.add(2);
		p1.add(3);

		System.out.println("First PRQueue: " + p1);

		p2.add(4);
		p2.add(5);
		p2.add(6);

		System.out.println("Second PRQueue: " + p2);

		for (Integer a : p1) {

			p3.add(a);

		}
		for (Integer b : p2) {

			p3.add(b);

		}

		System.out.println("Merge First & Second PRQueue: " + p3);
	}

}
