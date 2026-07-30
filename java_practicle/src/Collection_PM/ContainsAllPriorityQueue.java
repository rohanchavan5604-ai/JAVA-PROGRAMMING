package Collection_PM;

import java.util.PriorityQueue;

public class ContainsAllPriorityQueue {

	public static void main(String[] args) {

		PriorityQueue<Integer> p1 = new PriorityQueue<>();

		p1.add(4);
		p1.add(2);
		p1.add(7);
		p1.add(3);
		p1.add(9);
		p1.add(100);
		System.out.println(p1);
		
		

		PriorityQueue<Integer> p2 = new PriorityQueue<>();

		p2.add(4);
		p2.add(2);
		p2.add(7);
		p2.add(3);
		p2.add(9);
		p2.add(200);
		System.out.println(p2);
		p1.removeAll(p2);
		System.out.println(p1);
//        System.out.println(p1.containsAll(p2));
	}
}