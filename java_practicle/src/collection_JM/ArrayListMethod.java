package collection_JM;

import java.util.*;

public class ArrayListMethod {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Rohan");
		list.add("Chavan");
		list.add("Bastawde");

		System.out.println(list);

		
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

		
		for (Object o : list) {

			System.out.println(o);

		}

	}

}
