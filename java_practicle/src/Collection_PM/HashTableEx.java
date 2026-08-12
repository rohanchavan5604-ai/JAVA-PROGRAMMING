package Collection_PM;
 
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {

		Hashtable h1 = new Hashtable();

//		legacy class
//		hetro
//		no order
//		no duplicate allowed(override)

//		no null allowed*
//		synchronized*
//		Thread Safe*

		h1.put(11, "abc");
		h1.put("xyz", 45);
		h1.put(11, "Rohan");

		System.out.println(h1);

		System.out.println(h1.keySet());
		
		Enumeration  e1 = h1.keys();
		while(e1.hasMoreElements()) {
			
			System.out.println(e1.nextElement());
			
		}
		
		System.out.println(h1.values());
		
		Enumeration  e2 = h1.elements();
		while(e1.hasMoreElements()) {
			
			System.out.println(e2.nextElement());
			
		}
		
		
		System.out.println(h1.get(11));

		h1.remove("xyz");

		System.out.println(h1.containsKey("xyz") + " " + h1.containsValue("Rohan"));

		System.out.println(h1.keySet());

		System.out.println(h1.values());

		h1.putIfAbsent(12, "Chavan");
		System.out.println(h1);
		
		h1.putIfAbsent(13, "Bastawade");
		System.out.println(h1);

		h1.clear();

		System.out.println(h1.isEmpty());
		System.out.println(h1);
	}

}
