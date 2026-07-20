package String_PM;

public class StringSetDifferentstring {

	public static void main(String[] args) {

		String s = "932hello45ROHAN(*$%^&*";

		String s1 = "";
		String s11 = "";
		String s111 = "";
		String s1111 = "";

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				s1 = s1 + ch;
			} else if (ch >= 'A' && ch <= 'Z') {
				s11 = s11 + ch;
			} else if (ch >= '0' && ch <= '9') {
				s111 = s111 + ch;
			} else {
				s1111 = s1111 + ch;
			}
		}
		System.out.println("Lower char: " +s1);
		System.out.println("Upper char: " + s11);
		System.out.println("Digit: " + s111);
		System.out.println("Special symbol: " +s1111);
	}
}