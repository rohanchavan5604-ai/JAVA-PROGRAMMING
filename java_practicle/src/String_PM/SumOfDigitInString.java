package String_PM;

public class SumOfDigitInString {

	public static void main(String[] args) {

		String s = "45Rohan45";

		int sum = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) > '0' && s.charAt(i) <= '9') {

				int num = s.charAt(i) - '0';

				sum = sum + num;

			}

		}

		System.out.println("Sum: " + sum);

		
		
		
		
//		System.out.println('0');
//		
//		System.out.println('1' - '0');
//		System.out.println('2' - '0');
//		System.out.println('3' - '0');
//		System.out.println('4' - '0');
//		System.out.println('5' - '0');
		
		
	}

}
