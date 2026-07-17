package String_PM;

public class FindCapitalVowel {

	public static void main(String[] args) {

		String s = "ARIYYTsUjaskjk78327";

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

//			if (ch >= 'A' && ch <= 'Z') {

				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

					System.out.println(ch);

				}

//			}

		}

	}

}
