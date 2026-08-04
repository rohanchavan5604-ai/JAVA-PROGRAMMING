package Collection_PM;

import java.util.HashSet;

public class StringCode {

	public static void main(String[] args) {

		String s1[] = { "Rohan", "Rohan", "Chavan" };
		HashSet<String> h = new HashSet<>();
		for (String s : s1) {

			h.add(s);

		}
		System.out.println(h);
	}
}
