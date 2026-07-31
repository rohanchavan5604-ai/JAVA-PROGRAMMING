package Collection_PM;

import java.util.PriorityQueue;

public class SumofDigit {

	public static void main(String[] args) {

		int num = 234;
		int sum = 0;
		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();

		int rem = 0;

		while (num > 0) {

			rem = num % 10;
			p1.add(rem);
			num = num / 10;

		}
		System.out.println(p1);
		for (Integer q : p1) {

			sum = sum + q;
		}
		System.out.println(sum);
	}

}
