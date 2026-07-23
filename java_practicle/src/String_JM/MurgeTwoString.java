package String_JM;

public class MurgeTwoString {

	public static void main(String[] args) {

		String arr1[] = { "aaa", "bbb" };
		String arr2[] = { "ccc", "ddd" };

		String result[] = new String[arr1.length + arr2.length];

		int index = 0;
		for (int i = 0; i < arr1.length; i++) {
			result[index++] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			result[index++] = arr2[i];
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
