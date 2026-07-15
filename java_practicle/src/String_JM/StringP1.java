package String_JM;

public class StringP1 {

	public static void main(String[] args) {

		String s = "Rohan";
		String s1[] = { "Rohan", "RC", "Chavan", "Bastawade" };

		System.out.println(s); // Actual content
		System.out.println(s1); // Address of s1 obj

		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}

		System.out.println(s.hashCode()); // s & s2 are point out same memory address

		s = s.concat(" Chavan");
		System.out.println(s.hashCode()); // Immutable so Content change in diff Memory

		String s2 = "Rohan";
		System.out.println(s2.hashCode()); // s & s2 are point out same memory address

		System.out.println("=================================================");

		String p = "java";
		System.out.println(p.hashCode()); // Heap> String Constant Pool so,>>>
						// p.hashCode() point based on content
		
//		USING NEW KEYWORD
		
		String p2 = new String("java");
		System.out.println(System.identityHashCode(p2)); // Heap Memory,>>> Memory diff
						// System.identityHashCode(p2) point Actual obj in memory
		
		p = p.concat("Language");
		System.out.println(p.hashCode());

		p2 = p2.concat("Programming Language");
		System.out.println(p2.hashCode());

	}

}