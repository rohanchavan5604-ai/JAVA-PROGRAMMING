package String_PM;

public class primeChkInString {

	public static void main(String[] args) {

		String s = "Rohan63782";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {

				int num = s.charAt(i) - '0';

				int c = 0;
				for (int j = 1; j <= num; j++) {

					if (num % j == 0) {

						c++;

					}

				}
				if (c == 2) {
					System.out.println(num);
				}

			}

		}

	}

}
