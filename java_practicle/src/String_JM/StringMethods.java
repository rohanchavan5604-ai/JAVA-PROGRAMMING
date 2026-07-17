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
		System.out.println("=======================");

		
//		trim
		String s10="Hello world";
		System.out.println(s10.trim());
		System.out.println("=======================");

//		contains
		System.out.println(s10.contains("world"));
		System.out.println("=======================");

		boolean result=s10.contentEquals("Hello world");
		System.out.println(result);
		System.out.println("=======================");

//		endsWith
		String g1="rohan@gmail.com";
		System.out.println(g1.endsWith(".com"));
		System.out.println("=======================");

		System.out.println(g1.startsWith("rohan"));
		System.out.println("=======================");

//		format
		g1=g1.format("chavn@.COM");
		System.out.println(g1);
		System.out.println("=======================");

//		indexof
		String g2="Java and advt. java";
		System.out.println(g2.indexOf('v'));
		System.out.println(g2.lastIndexOf('a'));
		System.out.println("=======================");

//		isEmpty
		String x4=" ";
		System.out.println("isempty : "+x4.isEmpty());//space  counted
		System.out.println("isblank : "+x4.isBlank());//space not counted
		System.out.println("=======================");

//		repeat
		String x5=" bye ";
		x5=x5.repeat(5);
		System.out.println(x5);
	
	}
	
}
