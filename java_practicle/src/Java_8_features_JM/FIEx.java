package Java_8_features_JM;

import java.util.function.Predicate;

public class FIEx {

	public static void main(String[] args) {

		Predicate<String> palindrome = s -> s.equals(new StringBuilder(s).reverse().toString());
		System.out.println(palindrome.test("madam"));
	}

}
