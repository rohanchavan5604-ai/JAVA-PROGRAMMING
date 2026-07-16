package String_JM;

public class StringComparision {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		
		System.out.println(s1.equals(s2)); // TRUE
		System.out.println(s2.equals(s3)); // TRUE
		
		System.out.println("=========================");
		
		
		System.out.println(s1==s2); // TRUE
		System.out.println(s2==s3); // FALSE
		
		System.out.println("=========================");
		
		String p1 = "Java";
		String p2 = "Programming";
		String p3 = new String("Java");
		
		System.out.println(p1.compareTo(p2));
		System.out.println(p1.compareTo(p3));
		System.out.println(p2.compareTo(p3));
		
		System.out.println("=========================");
		
		String r1 = "AB";
		String r2 = "ABC";
		String r3 = new String("AB");
		
		System.out.println(r1.compareTo(r2));
		System.out.println(r1.compareTo(r3));
		System.out.println(r2.compareTo(r3));
		
		System.out.println("=========================");
		
		String b1 = "A";
		String b2 = "Z";
		String b3 = new String("A");
		
		System.out.println(b1.compareTo(b2));
		System.out.println(b1.compareTo(b3));
		System.out.println(b2.compareTo(b3));
		
		System.out.println("=========================");
		
		String a1 = " ";
		String a2 = "A";
		String a3 = new String(" ");
		
		System.out.println(a1.compareTo(a2));
		System.out.println(a1.compareTo(a3));
		System.out.println(a2.compareTo(a3));
		
		System.out.println("=========================");
		
//		IGNORECASE METHOD
		
		String c1 = "pune";
		String c2 = "pune";
		System.out.println(c1.equals(c2));
		System.out.println(c1.equalsIgnoreCase(c2));
	}
	
}
