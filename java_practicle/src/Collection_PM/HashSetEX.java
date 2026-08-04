package Collection_PM;

import java.util.HashSet;

public class HashSetEX {

	public static void main(String[] args) {

		HashSet<Integer> h = new HashSet();

		h.add(10);
		h.add(1);
		h.add(20);
		
		System.out.println("H: "+h);
		
		

//		shallow -> online -> clone
		HashSet h2 = new HashSet();
		
		h2 = (HashSet<Integer>)h.clone();
		
		
		h2.add(1);
		h2.add(45);
		System.out.println("H2: "+h2);
		h.retainAll(h2);
		System.out.println("Retain All: "+h);
		
		
//		Collection Methods:-
		
		System.out.println(h.size());

		System.out.println(h.contains(1));
//		h.clear();
		System.out.println(h.isEmpty());

		h.remove(1);

		System.out.println(h);
		HashSet h1 = new HashSet();

		h1.addAll(h);
		System.out.println(h1);

		System.out.println(h.containsAll(h1));
		h.removeAll(h1);
		System.out.println(h);

	}

}
