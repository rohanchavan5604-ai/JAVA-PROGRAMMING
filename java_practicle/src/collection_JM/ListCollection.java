package collection_JM;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");

		System.out.println(list);
		
//		Iterator itr = list.iterator();
//
//		while (itr.hasNext()) {
//
//			System.out.println(itr.next());
//
//		}
		
		
	}

}
