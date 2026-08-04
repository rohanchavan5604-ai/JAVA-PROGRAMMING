package collection_JM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class IteraterEx {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Java");
		list1.add("C++");
		list1.add("R");
		list1.add("C");
		list1.add("Python");
		
 

		System.out.println("Before sort: " + list1);

		Collections.sort(list1);

		System.out.println("After sort: " + list1);

		// max()
		String ans = Collections.max(list1);
		System.out.println("Max : " + ans);

		// min()
		String ans1 = Collections.min(list1);
		System.out.println("Min : " + ans1);

		// reverse()
		Collections.reverse(list1);
		System.out.println("Reverse : " + list1);
		
		
		ArrayList<String> list = new ArrayList<>();

		list.add("Rohan");
		list.add("Chavan");
		list.add("Bastawde");
		
		
		
		Iterator<String> it = list.iterator();

		System.out.println("----------Forward---------");

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		
		System.out.println("----------Backward---------");

		ListIterator<String> ltr = list.listIterator(list.size());

		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		
		
	}
}