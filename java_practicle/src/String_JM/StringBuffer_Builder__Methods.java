package String_JM;

public class StringBuffer_Builder__Methods {

	public static void main(String[] args) {

		System.out.println("--------------- StringBuilder ----------------\n");

		StringBuilder st = new StringBuilder();

		// append() - Add data at the end
		st.append("1234567891234567891234567891234567891");

		// capacity() - Returns current capacity
		System.out.println("Capacity : " + st.capacity());

		System.out.println("\n--------------- StringBuffer Capacity ----------------\n");

		StringBuffer st2 = new StringBuffer();

		// capacity() - Returns current capacity
		System.out.println("Default Capacity : " + st2.capacity());

		System.out.println("\n--------------- ensureCapacity() ----------------\n");

		// ensureCapacity() - Sets minimum capacity
		st2.ensureCapacity(35);

		System.out.println("New Capacity : " + st2.capacity());

		System.out.println("\n--------------- delete() ----------------\n");

		// delete() - Deletes characters from start index to end-1 index
		st2.append("Hello Java");

		System.out.println("Before Delete : " + st2);

		st2.delete(0, 4);

		System.out.println("After Delete  : " + st2);

		// capacity() - Capacity remains the same
		System.out.println("Capacity      : " + st2.capacity());

		System.out.println("\n--------------- deleteCharAt() ----------------\n");

		StringBuffer st3 = new StringBuffer();

		st3.append("Rohan");

		System.out.println("Before Delete : " + st3);

		// deleteCharAt() - Deletes character at given index
		st3.deleteCharAt(2);

		System.out.println("After Delete  : " + st3);

		System.out.println("\n--------------- indexOf() ----------------\n");

		// indexOf() - Returns first occurrence index
		System.out.println("String : " + st3);
		System.out.println("Index of 'n' : " + st3.indexOf("n"));

		System.out.println("\n--------------- insert() ----------------\n");

		// insert() - Inserts data at given index
		StringBuffer st5 = new StringBuffer("BCA");

		System.out.println("Before Insert : " + st5);

		st5.insert(3, " Student");

		System.out.println("After Insert  : " + st5);

		System.out.println("\n--------------- reverse() ----------------\n");

		// reverse() - Reverses the string
		StringBuffer st6 = new StringBuffer("Bastawade");

		System.out.println("Before Reverse : " + st6);

		st6.reverse();

		System.out.println("After Reverse  : " + st6);

		System.out.println("\n--------------- replace() ----------------\n");

		// replace() - Replaces characters from start index to end-1 index
		StringBuffer st7 = new StringBuffer("Bastawade");

		System.out.println("Before Replace : " + st7);

		st7.replace(0, 4, "Kol");

		System.out.println("After Replace  : " + st7);

		System.out.println("\n--------------- toString() ----------------\n");

		// toString() - Converts StringBuffer into String
		StringBuffer st8 = new StringBuffer("Java");

		System.out.println("StringBuffer : " + st8);

		String st4 = st8.toString();

		System.out.println("String       : " + st4);

		st4 = st4.concat(" Full Stack");

		System.out.println("After Concat  : " + st4);

	}
}