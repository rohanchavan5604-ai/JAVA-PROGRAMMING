package String_PM;

public class panagramusingRemoveDuplicate {

	public static void main(String[] args) {

		String s = "qwertyuiopasdf@#ghjklzxcvbfggfnmh";

		String s1 = "";

		for (int i = 0; i < s.length(); i++) {

			int c = 0;

			for (int j = 0; j < i; j++) {

				if (s.charAt(i) == s.charAt(j)) {

					c++;

				}

			}
			if (c == 0) {

				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {

					s1 = s1 + s.charAt(i);
				}

			}
		}

		if (s1.length() == 26) {

			System.out.println("pangram");

		} else {
			System.out.println("Not pangram");
		}

	}

}
