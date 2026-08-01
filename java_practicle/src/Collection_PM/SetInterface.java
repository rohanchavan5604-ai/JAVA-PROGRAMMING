package Collection_PM;

import java.util.HashSet;

public class SetInterface {

	public static void main(String[] args) {

//		hetro
//		duplicate not allowed
//		null allow But only Once
//		no order
//		?

		HashSet set = new HashSet();

		set.add(300);
		set.add(200);
		set.add(100);
		set.add(500);

		System.out.println(set);
	}

}
