package collection_JM;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Ex {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();

		// Adding Elements
		v.add(10);
		v.add(20);
		v.add(30);
		v.addElement(47);
		v.addFirst(56);
		v.insertElementAt(88, 0);
		System.out.println("After addFirst(56)          : " + v);

		v.addLast(null);
		System.out.println("After addLast(null)         : " + v);

		System.out.println("\n------------------------------------------------------------");

		
		// elements()
		Enumeration<Integer> e = v.elements();

		System.out.print("Elements Using Enumeration  : ");
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}
		System.out.println();

		System.out.println("\n------------------------------------------------------------");

		// clone()
		Vector<Integer> v2 = (Vector<Integer>) v.clone();

		System.out.println("Original Vector             : " + v);
		System.out.println("Cloned Vector               : " + v2);

		System.out.println("\n------------------------------------------------------------");

		// trimToSize()
		System.out.println("Capacity Before trimToSize(): " + v.capacity());

		v.trimToSize();

		System.out.println("Capacity After trimToSize() : " + v.capacity());

		System.out.println("\n------------------------------------------------------------");

		// size()
		System.out.println("Size                        : " + v.size());

		// capacity()
		System.out.println("Capacity                    : " + v.capacity());

		// ensureCapacity()
		v.ensureCapacity(25);
		System.out.println("After ensureCapacity(25)    : " + v.capacity());

		// isEmpty()
		System.out.println("Is Empty                    : " + v.isEmpty());

		// contains()
		System.out.println("Contains(47)                : " + v.contains(47));

		// indexOf()
		System.out.println("Index Of(20)                : " + v.indexOf(20));

		System.out.println("\n------------------------------------------------------------");

		// get()
		System.out.println("get(3)                      : " + v.get(3));

		// firstElement()
		System.out.println("firstElement()              : " + v.firstElement());

		// lastElement()
		System.out.println("lastElement()               : " + v.lastElement());

		// set()
		System.out.println("Old Value                   : " + v.set(1, 11));
		System.out.println("After set(1,11)             : " + v);

		System.out.println("\n------------------------------------------------------------");

		// remove(index)
		v.remove(2);
		System.out.println("After remove(2)             : " + v);

		// removeElement(Object)
		v.removeElement(47);
		System.out.println("After removeElement(47)     : " + v);

		// remove(Object)
		v.remove(v);
		System.out.println("After remove(v)             : " + v);

		System.out.println("\n------------------------------------------------------------");

		// clear()
		v.clear();
		System.out.println("After clear()               : " + v);

		// removeAllElements()
		v.removeAllElements();
		System.out.println("After removeAllElements()   : " + v);

		System.out.println("\n------------------------------------------------------------");
	}
}