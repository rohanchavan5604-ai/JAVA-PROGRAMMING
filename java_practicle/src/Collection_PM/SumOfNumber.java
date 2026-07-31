package Collection_PM;

import java.util.PriorityQueue;

public class SumOfNumber {

	public static void main(String[] args) {

		int num = 10;

		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();

		for (int i = 1; i <= num; i++) {

			p1.add(i);

		}

		System.out.println(p1);

		int sum = 0;

		for (Integer a : p1) {

			sum = sum + a;

		}
		System.out.println(sum);
	}

}
