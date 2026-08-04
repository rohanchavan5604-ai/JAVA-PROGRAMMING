package Collection_PM;

import java.util.HashSet;

public class RemoveTheGivenEle {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 33, 22, 1 };
		int ele = 33;

		HashSet<Integer> h = new HashSet<>();

		for (Integer h1 : a) {

			h.add(h1);

		}
		System.out.println(h);

		if (h.contains(ele)) {

			h.remove(ele);
			System.out.println(h);
		} else {
			System.out.println("Element Not Present");
		}

	}
}
