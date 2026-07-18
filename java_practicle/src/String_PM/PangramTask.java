package String_PM;

public class PangramTask {

	public static void main(String[] args) {

		String s = "qwertyudbbfjjiopasdfgabbfhhkrjdrchjehjklzxcvbnm";

		int c = 0;

		for (char ch = 'a'; ch <= 'z'; ch++) {

			for (int i = 0; i < s.length(); i++) {

				if (ch == s.charAt(i)) {

					c++;
					break;
					

				}

			}
		}
		if (c == 26) {
			System.out.println("Pangram");
		} else {
			System.out.println("not pangram");
		}

	}

}
