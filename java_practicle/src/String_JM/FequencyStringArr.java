package String_JM;

public class FequencyStringArr {

	public static void main(String[] args) {

		String st = "aaabbc";
		String ans = "";

		int c = 1;

		for (int i = 0; i < st.length(); i++) {

			if (i < st.length() - 1 && st.charAt(i) == st.charAt(i + 1)) {

				c++;

			} else {

				ans = ans + st.charAt(i) + c;
				c = 1;

			}

		}
		System.out.println(ans);

	}

}
