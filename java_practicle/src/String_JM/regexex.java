package String_JM;

public class regexex {

	public static void main(String[] args) {
		
//		Mobile No validation
		
		String mobno = "+91-9665885942";
		
		String pattern = "^\\+[0-9]{2}+\\-+[0-9]{10}$";
		
		if(mobno.matches(pattern)) {
			System.out.println("Correct");
		}else {
			System.out.println("Incorrect");
		}
		
	}
	
}
