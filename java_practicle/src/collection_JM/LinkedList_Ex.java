package collection_JM;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Ex {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();

		// add()
		System.out.println("Before add() : " + list);
		list.add(25);
		System.out.println("After add()  : " + list);

		System.out.println("--------------------------------");

		// offer()
		System.out.println("Before offer() : " + list);
		list.offer(26);
		System.out.println("After offer()  : " + list);

		System.out.println("--------------------------------");

		// addFirst()
		System.out.println("Before addFirst() : " + list);
		list.addFirst(27);
		System.out.println("After addFirst()  : " + list);

		System.out.println("--------------------------------");

		// push()
		System.out.println("Before push() : " + list);
		list.push(45);
		System.out.println("After push()  : " + list);

		System.out.println("--------------------------------");

		// addLast()
		System.out.println("Before addLast() : " + list);
		list.addLast(100);
		System.out.println("After addLast()  : " + list);

		System.out.println("--------------------------------");

		// getFirst()
		System.out.println("Current List : " + list);
		System.out.println("getFirst() : " + list.getFirst());

		System.out.println("--------------------------------");

		// getLast()
		System.out.println("Current List : " + list);
		System.out.println("getLast() : " + list.getLast());

		System.out.println("--------------------------------");

		// removeFirst()
		System.out.println("Before removeFirst() : " + list);
		System.out.println("Removed Element : " + list.removeFirst());
		System.out.println("After removeFirst()  : " + list);

		System.out.println("--------------------------------");

		// removeLast()
		System.out.println("Before removeLast() : " + list);
		System.out.println("Removed Element : " + list.removeLast());
		System.out.println("After removeLast()  : " + list);

		System.out.println("--------------------------------");

		// offerFirst()
		System.out.println("Before offerFirst() : " + list);
		list.offerFirst(56);
		System.out.println("After offerFirst()  : " + list);

		System.out.println("--------------------------------");

		// offerLast()
		System.out.println("Before offerLast() : " + list);
		list.offerLast(99);
		System.out.println("After offerLast()  : " + list);

		System.out.println("--------------------------------");

		// peek()
		System.out.println("Current List : " + list);
		System.out.println("peek() : " + list.peek());

		System.out.println("--------------------------------");

		// peekFirst()
		System.out.println("Current List : " + list);
		System.out.println("peekFirst() : " + list.peekFirst());

		System.out.println("--------------------------------");

		// peekLast()
		System.out.println("Current List : " + list);
		System.out.println("peekLast() : " + list.peekLast());

		System.out.println("--------------------------------");

		// poll()
		System.out.println("Before poll() : " + list);
		System.out.println("Removed Element : " + list.poll());
		System.out.println("After poll()  : " + list);

		System.out.println("--------------------------------");

		// pollFirst()
		System.out.println("Before pollFirst() : " + list);
		System.out.println("Removed Element : " + list.pollFirst());
		System.out.println("After pollFirst()  : " + list);

		System.out.println("--------------------------------");

		// pollLast()
		System.out.println("Before pollLast() : " + list);
		System.out.println("Removed Element : " + list.pollLast());
		System.out.println("After pollLast()  : " + list);

		System.out.println("--------------------------------");

		// push()
		System.out.println("Before push() : " + list);
		list.push(89);
		System.out.println("After push()  : " + list);

		System.out.println("--------------------------------");

		// pop()
		System.out.println("Before pop() : " + list);
		System.out.println("Removed Element : " + list.pop());
		System.out.println("After pop()  : " + list);

		System.out.println("--------------------------------");

		// descendingIterator()

		LinkedList<Integer> list1 = new LinkedList<>();

		list1.add(9);
		list1.add(17);
		list1.add(45);
		list1.add(3);
		list1.add(15);

		System.out.println("Before descendingIterator() : " + list1);

		System.out.print("Descending Order : ");

		Iterator<Integer> itr = list1.descendingIterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		System.out.println("After descendingIterator()  : " + list1);

		System.out.println("--------------------------------");

		System.out.println("Final List : " + list1);
	}
}