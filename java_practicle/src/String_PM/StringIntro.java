package String_PM;

public class StringIntro {

	public static void main(String[] args) {

		String s1 = "Rohan";
		String s2 = "Rohan";

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		if (s1 == s2) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}

		System.out.println("==========================================");

		String s3 = new String("Rohan");
		String s4 = new String("Rohan");

		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));

		if (s3 == s4) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}

		System.out.println("==========================================");

		String s5 = "Rohan";
		String s6 = new String("Rohan");

		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));

		if (s5 == s6) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}

		System.out.println("==========================================");

	}
}