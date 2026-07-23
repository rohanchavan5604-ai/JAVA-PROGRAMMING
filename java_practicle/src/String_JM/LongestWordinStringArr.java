package String_JM;

public class LongestWordinStringArr {

	public static void main(String[] args) {

		String s = "Rohan Chavan Bastawade";

		String arr[] = s.split("\\s");

		int max = 0;
		String word2 = "";

		for (String word : arr) {

			int l = word.length();
			if (l > max) {

				max = l;
				word2 = word;

			}
		}
		System.out.println("Longest Word: " + word2);

	}

}
