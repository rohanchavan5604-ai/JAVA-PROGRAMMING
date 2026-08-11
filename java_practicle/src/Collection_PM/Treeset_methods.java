package Collection_PM;

import java.util.TreeSet;

public class Treeset_methods {

	public static void main(String[] args) {

		TreeSet<Integer> t = new TreeSet<Integer>();

		t.add(4);
		t.add(8);
		t.add(2);

		System.out.println(t);
		
//		lower:- 
		
		System.out.println(t.lower(5));
		System.out.println(t.lower(1));
		System.out.println(t.lower(12));
		
//		higher :-  near greater
		
//		System.out.println(t.higher(3));
//		System.out.println(t.higher(4));
//		System.out.println(t.higher(15));
		

//		navigable set - interface
//		floor:- it return near smaller or equal to given obj
//		if not present relatable then retun null
		
//		System.out.println(t.floor(3));
//		System.out.println(t.floor(4));
//		System.out.println(t.floor(1));
		
		
		
//		navigable set - interface
//		ceiling:- it return near grater then equal to given obj
//		if not present relatable then return null

//		System.out.println(t.ceiling(3));
//		System.out.println(t.ceiling(10));
//		System.out.println(t.ceiling(1));

		
		
		
//		System.out.println(t.pollFirst());
//		
//		System.out.println(t.pollLast());

//		System.out.println(t.first() + " " + t.last());

	}

}
