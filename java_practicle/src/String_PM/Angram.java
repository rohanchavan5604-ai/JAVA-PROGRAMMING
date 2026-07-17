package String_PM;

import java.util.Arrays;

public class Angram {

	public static void main(String[] args) {

		String s = "abc";
		String s1 = "bca";

		if (s.length() == s1.length()) {

			char ch[] = s.toCharArray();
			char ch1[] = s1.toCharArray();

			Arrays.sort(ch);
			Arrays.sort(ch1);

			System.out.println(ch);
			System.out.println(ch1);

			int c = 0;

			for (int i = 0; i < ch.length; i++) {

				if (ch[i] == ch1[i]) {

					c++;

				}

			}
			if (c == ch.length) {

				System.out.println("Angram");

			} else {
				System.out.println("Not Angram");
			}

		} else {

			System.out.println("Length not same ");

		}

	}

}
