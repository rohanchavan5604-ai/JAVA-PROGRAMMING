package String_PM;

public class StringIndexChangeUsingConversion {

	public static void main(String[] args) {

		String s = "Mohan";

		char ch[] = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {

			if (ch[i] == 'M') {

				ch[i] = 'R';

			}

		}
		System.out.println(ch);

	}

}
