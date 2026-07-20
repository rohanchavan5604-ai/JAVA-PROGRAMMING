package String_PM;

public class StringReverseWordWise {

	public static void main(String[] args) {

		String s = "hello java";

		String s1[] = s.split(" ");

		for (int i = 0; i < s1.length; i++) {

			String rev = "";
			for (int j = s1[i].length() - 1; j >= 0; j--) {

				rev = rev + s1[i].charAt(j);

			}
			System.out.print(rev);

		}

	}

}
