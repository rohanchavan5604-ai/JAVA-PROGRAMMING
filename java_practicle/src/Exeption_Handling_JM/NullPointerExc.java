package Exeption_Handling_JM;

public class NullPointerExc {

	public static void main(String[] args) {

		try {

			String s = null;

			System.out.println(s.length());

		} catch (Exception e) {

			System.err.println(e.getMessage());
			System.out.println(e);
			System.out.println(e.getStackTrace());

		}
		System.out.println("Hello");
	}

}
