package Collection_PM;

import java.util.ArrayDeque;

public class Deque {

	public static void main(String[] args) {

//		hetro
//		duplicates allowed
//		no null 
//		insertion order
//		LIFO + FIFO

		ArrayDeque p = new ArrayDeque();

		p.add("bas");
		p.add(2);
//		p.add(null); //Exception
		p.add(12.3);
		p.add(4);

		System.out.println(p);

		p.addFirst(100);
		p.addLast(200);
		p.offerFirst(300);
		p.offerLast(400);

		System.out.println(p);

		System.out.println(p.peekFirst() + " " + p.peekLast());
		System.out.println(p.pollFirst() + " " + p.pollLast());
		System.out.println(p);

		
		System.out.println(p.getFirst());
		System.out.println(p.getLast());
	}

}
