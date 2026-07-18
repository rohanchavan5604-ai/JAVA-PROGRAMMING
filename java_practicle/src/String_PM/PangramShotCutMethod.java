package String_PM;

public class PangramShotCutMethod {

	public static void main(String[] args) {

		String s = "qwertyuiopasdfghjklzxcvbnm";

		int c = 0;

		for (char ch = 'a'; ch <= 'z'; ch++) {

			if (s.indexOf(ch) != -1) {

				c++;

			}

		}
		if (c == 26) {
			System.out.println("Pangram");
		} else {
			System.out.println("Not Pangram");
		}

	}

}
