package String_PM;

public class StringIndexChange {

	public static void main(String[] args) {

		String s = "Mohan";

		String s1 = "";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'M') {

				s1 = s1 + 'R';

			} else {

				s1 = s1 + s.charAt(i);

			}

		}
		System.out.println(s1);
	}

}
