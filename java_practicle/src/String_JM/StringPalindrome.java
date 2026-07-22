package String_JM;

public class StringPalindrome {

	public static void main(String[] args) {

		String nm = "Madam";

		String rev = "";

		nm = nm.toLowerCase();

		for (int i = nm.length() - 1; i >= 0; i--) {

			rev = rev + nm.charAt(i);

		}
		if (nm.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
