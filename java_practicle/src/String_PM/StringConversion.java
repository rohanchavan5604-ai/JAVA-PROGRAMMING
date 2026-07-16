package String_PM;

public class StringConversion {

	public static void main(String[] args) {

		System.out.println("Conversion From char arr to String: ");

		char ch[] = { 'h', 'e', 'l', 'l', 'o' };

		String s1 = new String(ch);
		System.out.println(s1);

		System.out.println("\nconversion of string to char Array: ");

		String r = "Rohan";

		char c[] = new char[r.length()];

		for (int i = 0; i < r.length(); i++) {

			c[i] = r.charAt(i);

		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

		System.out.println("\nusing toCharArray() ");

		char ch1[] = r.toCharArray();
		System.out.println(ch1);

		System.out.println("\nPattern of name: ");

		String n = "Rohan";

		String n2 = new String("");
//		String n2 = "";		THIS IS ALSO VALIAD 

		for (int i = 0; i < n.length(); i++) {

			n2 = n2 + n.charAt(i) + "" + n.charAt(i);
			System.out.println(n2);
		}

	}

}
