package String_PM;

public class StringEvenfact {

	public static void main(String[] args) {

		String s = "12304567";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {

				int num = s.charAt(i) - '0';

				int fact = 1;

				if (num % 2 == 0) {

					for (int j = 1; j <= num; j++) {

						fact = fact * j;

					}
					System.out.println("Fact of "+num+" is: "+fact);

				}

				
			}

		}

	}

}
