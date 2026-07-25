package Exeption_Handling_JM;

public class MultipleTrycatch {

	public static void main(String[] args) {

		try {

			String s = "Rohan";
			System.out.println(s.charAt(6));

		} catch (Exception e) {

			System.out.println(e);
			try {
				System.out.println(20 / 0);
			} catch (Exception e1) {
				System.out.println(e1);
			}
		}

	}

}
