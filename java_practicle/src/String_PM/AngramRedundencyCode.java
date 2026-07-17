package String_PM;

import java.util.Arrays;

public class AngramRedundencyCode {

	public static void main(String[] args) {

		String s = "ROhAN";
		String s1 = "nAHoR";

		if (s.length() == s1.length()) {

			char ch[] = s.toLowerCase().toCharArray();
			char ch1[] = s1.toLowerCase().toCharArray();

			Arrays.sort(ch);
			Arrays.sort(ch1);

			if (Arrays.equals(ch, ch1)) {

				System.out.println("Angram");

			} else {
				System.out.println("Not Anagram");
			}

		} else {

			System.out.println("Length not same ");

		}

	}

}
