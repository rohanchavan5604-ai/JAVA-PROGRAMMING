package String_JM;

public class StringMethods {

	public String toString() {
		
		return "I am class Object";
		
	}
	
	public static void main(String[] args) {
		
		
		
		String s1 = "Java";
		System.out.println(s1.length());
		
		System.out.println("=======================");
		
		// replace()
		
		String s2 = "Hefshine";
		String s3 = "hefshinePune";
		
		System.out.println(s2.replace(s2, s3));
		
		System.out.println("=======================");
		
		// replace() - single char
		
		String r = "Mohan";
		System.out.println(r.replace("M", "R")); // Rohan
		
		System.out.println("=======================");
		
//		substring() 
		
		String st = "My name is Rohan";
		System.out.println(st.substring(2)); // with space
		System.out.println(st.substring(3, 12)); // start - end
		
		System.out.println("=======================");
		
//		lowercase()
		
		System.out.println(st.toLowerCase());
		
//		UPPERCASE()
		
		System.out.println(st.toUpperCase());
		
		System.out.println("=======================");
		
		
//		toString() 
		
		StringMethods sc = new StringMethods();
		System.out.println(sc);
		
		System.out.println("=======================");
		
//		valueof()
		
		int x = 20;
		int y = 30;
		
		System.out.println(x+y);
		
		String x1= String.valueOf(x);
		String y1= String.valueOf(y);
		
		System.out.println(x1+y1);
		
	}
	
}
