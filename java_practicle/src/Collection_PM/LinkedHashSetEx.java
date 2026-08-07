package Collection_PM;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {

//		Hetro
//		no duplicates
//		null once 
//		insertion order
//		background -> Hashtable + Linkedlist

		LinkedHashSet<Integer> l1 = new LinkedHashSet<Integer>();

		l1.add(93);
		l1.add(45);
		l1.add(18);

		System.out.println(l1);

		LinkedHashSet l2 = new LinkedHashSet();

//		l2 = (LinkedHashSet) l1.clone();

		l2.add(2);
		l2.add(35);
		l2.add(45);
		l2.add(18);
		System.out.println(l2);

		l2.retainAll(l1);
		System.out.println(l2);
	}

}
