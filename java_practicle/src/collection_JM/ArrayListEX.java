package collection_JM;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEX {

	public static void main(String[] args) {

		// List
		List<String> list = new ArrayList<>();

		list.add("Java");
		list.add("Python");
		list.add("SQL");
		list.add(null);
		list.add("C++");

		System.out.println("List : " + list);
		System.out.println("=========================================");

		// List2
		List<String> list2 = new ArrayList<>();

		// addAll() - Copy all elements from one list to another
		list2.addAll(list);

		System.out.println("List2 : " + list2);
		System.out.println("=========================================");

		// clear()

		// list.clear();
		// System.out.println(list);

		// contains() - Check single element
		// containsAll() - Check whole list/object

		System.out.println("Contains SQL : " + list.contains("SQL"));
		System.out.println("Contains All : " + list.containsAll(list2));
		System.out.println("=========================================");

		// equals() - Equality check
		// Same Size + Same Order + Same Elements

		list.add("Rohan");
		System.out.println("Equals : " + list.equals(list2));
		System.out.println("=========================================");

		// get() - Return value of that index

		System.out.println("Element at Index 1 : " + list.get(1));
		System.out.println("=========================================");

		// set() - Update value of that index
		// Returns old value

		System.out.println("Old Value : " + list.set(2, "MySQL"));
		System.out.println("Updated List : " + list);
		System.out.println("=========================================");

		// isEmpty() - Check list is empty or not

		System.out.println("Is Empty : " + list.isEmpty());
		System.out.println("=========================================");

		// subList() - Return sublist
		// fromIndex -> Inclusive
		// toIndex -> Exclusive

		System.out.println("Sub List : " + list.subList(0, 2));
		System.out.println("=========================================");

		// indexOf() - Return index of first occurrence

		System.out.println("Index Of Rohan : " + list.indexOf("Rohan"));
		System.out.println("=========================================");

		// lastIndexOf() - Return last occurrence

		System.out.println("Last Index Of C++ : " + list.lastIndexOf("C++"));
		System.out.println("=========================================");

		// retainAll() - Return matching values from both
		// Remove unique elements

		list2.add("Chavan");

		System.out.println("Before retainAll()");
		System.out.println("List  : " + list);
		System.out.println("List2 : " + list2);

		list.retainAll(list2);

		System.out.println("\nAfter retainAll()");
		System.out.println("List  : " + list);
		System.out.println("List2 : " + list2);
		System.out.println("=========================================");

		// replaceAll() - Add ! at end

		list.replaceAll(str -> str == null ? null : str + "!");

		list2.replaceAll(str -> str == null ? null : str.toUpperCase());

		System.out.println("After replaceAll() List  : " + list);
		System.out.println("After replaceAll() List2 : " + list2);
		System.out.println("=========================================");

		// replaceAll() with Integer

		ArrayList<Integer> num = new ArrayList<>();

		num.add(2);
		num.add(5);
		num.add(9);

		System.out.println("Before : " + num);

		num.replaceAll(n -> n * n);

		System.out.println("After  : " + num);
		System.out.println("=========================================");

		List<String> list3 = new ArrayList<>();

		list3.add("Java");
		list3.add("Python");
		list3.add("SQL");

		System.out.println("Before : " + list3);

		list3.replaceAll(str -> str + " (" + str.length() + ")");

		System.out.println("After : " + list3);
		
	}

}