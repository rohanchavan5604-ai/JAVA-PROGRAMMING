package Collection_PM;

import java.util.TreeSet;

public class TreeSetEX {

	public static void main(String[] args) {

//		homogeneous
//		sorted order
//		null not allow
//		duplicate no allow
//		?
//		?

		TreeSet<Integer> t = new TreeSet<Integer>();

		t.add(2);
		t.add(8);
//		t.add(null);  // Null Pointer Exception
		t.add(1);
		t.add(5);

		System.out.println(t);

	}

}
