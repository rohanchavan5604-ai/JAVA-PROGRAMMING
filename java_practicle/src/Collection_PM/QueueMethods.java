package Collection_PM;

import java.util.PriorityQueue;

public class QueueMethods {

	public static void main(String[] args) {

		PriorityQueue<Integer> p1 = new PriorityQueue<>();

		p1.add(4);
		p1.offer(2); // queue method same work like add
		p1.add(7);
		p1.add(3);
		p1.add(9);
		p1.add(100);
		System.out.println(p1);
	
		//peek -> Front
		//Return top of the queue / front of queue
		System.out.println(p1.peek());
		//returns top of queue and remove from next line
		System.out.println(p1.poll());
		System.out.println(p1);
		p1.poll();
		System.out.println(p1);
}
}
