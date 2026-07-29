package Exeption_Handling_JM;

public class FinallyKeyword {

	public static void main(String[] args) {

		String s = null;

		try {

			System.out.println(s.length());

		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {

			System.out.println("Thank you visit again...!");

			try {
				System.out.println(20 / 0);
			} catch (ArithmeticException e) {
				System.out.println(e);
			} finally {

				System.out.println("Arithmetic Exception Chance");

			}

		}

	}

}
