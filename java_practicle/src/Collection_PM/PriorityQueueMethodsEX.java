package Collection_PM;

import java.util.PriorityQueue;

public class PriorityQueueMethodsEX {

	public static void main(String[] args) {

		PriorityQueue p1 = new PriorityQueue();

		p1.add(4);
		p1.add(2);
		p1.add(7);
		p1.add(3);
		p1.add(9);

		System.out.println(p1);
		
		p1.clear();
//		return null if queue is empty
		System.out.println(p1.poll());
		
		System.out.println(p1);
//		return exception if queue is empty
		p1.remove();
		System.out.println(p1);
		
		
		
		
//		System.out.println(p1);
//
//		p1.clear();
////		return front of queue but if queue is empty then 
////		it will return null
//		System.out.println(p1.peek());
//
////		return front of queue but if the queue is empty then 
////		it will return Exception
//
//		System.out.println(p1.element());
	}
}
