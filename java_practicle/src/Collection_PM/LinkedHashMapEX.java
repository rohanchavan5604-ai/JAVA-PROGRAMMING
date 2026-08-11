package Collection_PM;

import java.util.LinkedHashMap;

public class LinkedHashMapEX {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> h = new LinkedHashMap<Integer, String>();

		h.put(1, "Rohan");
		h.put(2, "Chavan");
		h.put(6, "Rohan RC");
		h.put(3, "Bastawde");

		System.out.println(h);

		System.out.println(h.get(1));

		System.out.println(h.containsKey(2));

		System.out.println(h.containsValue("Rohan"));

		h.remove(6);

		System.out.println(h);

		System.out.println(h.keySet());
		System.out.println(h.values());

		h.putIfAbsent(4, "Full Stack Devloper");

		System.out.println(h);
 

	}

}
