package Collection_PM;

import java.util.HashMap;

public class HashMapEx{

	public static void main(String[] args) {

		HashMap<Integer, String> s1 = new HashMap<Integer, String>();

		s1.put(1, "om");
		s1.put(11, "pranay");
		s1.put(3, "Rohan");    
		s1.put(9, "tushar");

		System.out.println(s1);

//		fetch the value by the help of key
		System.out.println(s1.get(9));

//		chk key is present or not
		System.out.println(s1.containsKey(11));

//		chk value is present or not
		System.out.println(s1.containsValue("Rohan"));

//		if key is present then skip
//		if not present then add
//		no override the value

		s1.putIfAbsent(12, "Prathamesh");
		System.out.println(s1);

//		remove the entry by the help of key
		s1.remove(11);
		System.out.println(s1);

//		return set of keys
		System.out.println(s1.keySet());

//		return set of values
		System.out.println(s1.values());
	}

}
