package Collection_PM;

import java.util.PriorityQueue;

public class FactorialUsingPrioQueue {

	public static void main(String[] args) {

		int num = 5;
		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();

		for (int i = 1; i <= num; i++) {

			p1.add(i);

		}
		System.out.println(p1);

		int fact = 1;
		for (Integer p : p1) {
			fact = fact * p;
		}
		System.out.println("Factorial: "+fact);
	}

}
