package String_JM;

public class Regex {

	public static void main(String[] args) {
		
		String ch ="1";
		System.out.println("Single digit: "+ch.matches("\\d"));    // single digit 
		
		String ch2 = "123";
		System.out.println("one or more Digit: "+ch2.matches("\\d+"));  // one or more digit
		
		String ch3 = "a";
		System.out.println("Single char: "+ch3.matches("\\w"));   // single char
		
		String ch4 = "abc";
		System.out.println("one or more char: "+ch4.matches("\\w+"));  // one or more char
		
		String ch5 = "U";
		System.out.println("No digit: "+ch5.matches("\\D"));   // no digit
		
		String ch6 = " ";
		System.out.println("Space: "+ch6.matches("\\s"));   // Check space
		
		String ch7 = "$";
		System.out.println("Spacial characters: "+ch7.matches("\\W+")); //Special character
		
		String ch8 = "ab cd";
		System.out.println("Chk non-Space: "+ch8.matches("\\S+"));   // Check non-space
		
		String ch9 = "";
		System.out.println("Chk 0-more: "+ch9.matches("\\w*")); //chk 0-more char because w*
		
		String ch10 = "ab";
		System.out.println("Chk 0-1: "+ch10.matches("\\w?")); //chk 0-1 char because w? if d? 
		
		String ch11 = "123456";
		System.out.println("chk Exact Digit of {}: "+ch11.matches("\\d{6}"));
		
		String ch12 = "abc";
		System.out.println("chk Exact Digit of {}: "+ch12.matches("\\w{3}"));
		
		String ch13 = "ab";
		System.out.println("chk Exact {3} or more then {3}: "+ch13.matches("\\w{3,}"));
		
		String ch14 = "abcd"; // 3,4,5 true
		System.out.println("chk Exact {3} betwn in range of {5}: "+ch14.matches("\\w{3,5}"));
		
		String ch15 = "abc";
		System.out.println("chk range [a-z] of char: "+ch15.matches("[a-z]+"));
		
		String ch16 = "AD";
		System.out.println("chk range [A-F] of char: "+ch16.matches("[A-F]+"));
		
		String ch17 = "CD";
		System.out.println("chk range !in[^A-F] of char: "+ch17.matches("[^A-F]+"));
		
		String ch18 = "Java";
		System.out.println("Chk | betwn (--|--): "+ch18.matches("Java|Python"));
		
	}
	
}
