package String_JM;

public class CapitalFirstCharOfStringArr {

	public static void main(String[] args) {

		String arr[] = { "rohan", "arun", "chavan" };

		for (int i = 0; i < arr.length; i++) {

			String nm[] = arr[i].split(" ");

			StringBuilder sb = new StringBuilder();

			for (String ch : nm) {

				sb.append(Character.toUpperCase(ch.charAt(0))).append(ch.substring(1)).append(" ");

			}
			arr[i] = sb.toString();

		}

		for (String name : arr) {

			System.out.println(name);

		}

	}

}
