package String_JM;

import java.util.Scanner;

public class StringreverseUsingBuilder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");

		String word = sc.next();

		int i = 0, j = word.length() - 1;
		int x = 0;

		while (i < j) {

			if (word.charAt(i) != word.charAt(j)) {

				x++;
				break;

			}
			i++;
			j--;
		}

		if (x >= 1) {
			System.out.println("Not Palindrome");
		} else {
			System.out.println("Palindrome");
		}

		// First Way
		word = word.toLowerCase();
		String ori = word;

		StringBuilder stb = new StringBuilder(word);
		word = stb.reverse().toString();

		if (ori.equals(word)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

		// Second Way

		String word2 = "mam";

		String rev = new StringBuilder(word2).reverse().toString();

		if (word2.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
 
	}
}