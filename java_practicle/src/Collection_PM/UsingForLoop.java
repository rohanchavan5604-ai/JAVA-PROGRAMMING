package Collection_PM;

import java.util.PriorityQueue;

public class UsingForLoop {

	public static void main(String[] args) {

		PriorityQueue p1 = new PriorityQueue();

		p1.add(4);
		p1.add(2);
		p1.add(7);
		p1.add(3);
		p1.add(9);

		int n = p1.size();
		for (int i = 1; i <= n; i++) {
			System.out.println(p1.poll());
		}

	}

}
