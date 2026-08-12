package Collection_PM;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> h = new TreeMap<Integer, String>();

		h.put(1, "Rohan");
		h.put(2, "Chavan");
		h.put(6, "Rohan RC");
		h.put(5, "Bastawde");
		
		System.out.println(h);

		System.out.println(h.get(1));

		System.out.println(h.containsKey(2));

		System.out.println(h.containsValue("Rohan"));

		h.remove(6);

		System.out.println(h);

		System.out.println(h.keySet());
		System.out.println(h.values());
		
		System.out.println(h.firstKey());
		
		System.out.println(h.lastKey());
		
		System.out.println(h.ceilingKey(4));
		
		System.out.println(h.floorKey(3));
		
		System.out.println(h.putIfAbsent(8, "Full stack Developer"));
		
		System.out.println(h);
		
	}
	
}
