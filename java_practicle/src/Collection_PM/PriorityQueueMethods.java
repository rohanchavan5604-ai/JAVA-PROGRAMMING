package Collection_PM;

import java.util.PriorityQueue;

public class PriorityQueueMethods {

	public static void main(String[] args) {
		
		PriorityQueue p1 = new PriorityQueue();
		
		p1.add(4);
		p1.add(2);
		p1.add(7);
		p1.add(3);
		p1.add(9);
		
		System.out.println(p1);
		System.out.println(p1.size());
		
		
		//p1.clear();
		System.out.println(p1.isEmpty());
		
		p1.remove(4);
		System.out.println(p1.contains(4));
		
		PriorityQueue p2 = new PriorityQueue();
		p2.addAll(p1);
		System.out.println(p2);
	}
	
}
