package String_JM;

public class AccNumberMasking {

	public static void main(String[] args) {

//		Masking / hiding in String  

		StringBuilder s = new StringBuilder("9665885942");

		for (int i = 0; i < s.length(); i++) {

			if (i < s.length() - 4) {
				System.out.print("X");
			} else {
				System.out.print(s.charAt(i));
			}

		}

	}

}
