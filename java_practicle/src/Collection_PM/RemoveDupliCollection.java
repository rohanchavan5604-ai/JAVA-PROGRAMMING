package Collection_PM;

import java.util.HashSet;

public class RemoveDupliCollection {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 3, 2, 1 };

		HashSet<Integer> h = new HashSet();

		for (Integer a1 : a) {

			h.add(a1);

		}

		System.out.println(h);

	}

}
