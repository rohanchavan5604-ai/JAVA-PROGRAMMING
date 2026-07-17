package String_PM;

public class RemoveDuplicateSecondWay {

	public static void main(String[] args) {

		String s = "aabbcc";

		for (int i = 0; i < s.length(); i++) {
			int c = 0;
			for (int j = 0; j < i; j++) {

				if (s.charAt(i) == s.charAt(j)) {

					c++;

				}

			}
			if (c == 0) {
				System.out.println(s.charAt(i)+" index "+i);
			}

		}

	}

}
