package String_PM;

public class RemoveDuplicateInString {

	public static void main(String[] args) {

		String s = "abcbca";

		for (int i = 0; i < s.length(); i++) {
			int c = 0;
			for (int j = i + 1; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {

					c++;

				}

			}
			if (c == 0) {
				System.out.println(s.charAt(i));
			}

		}

	}

}
