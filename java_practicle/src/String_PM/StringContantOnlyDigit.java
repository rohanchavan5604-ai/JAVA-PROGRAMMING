package String_PM;

public class StringContantOnlyDigit {

	public static void main(String[] args) {

		String s = "45Rohan45";

		int c = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {

				c++;

			}

		}
		if (c == s.length()) {

			System.out.println("String contains only digit ");

		} else {
			System.out.println("String contains not only digit");
		}

	}

}
