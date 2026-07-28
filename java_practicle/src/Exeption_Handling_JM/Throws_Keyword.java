package Exeption_Handling_JM;

class Hello {

	static void three() throws ArithmeticException{

		System.out.println(20 / 0);

	}

	static void two() {

		three();

	}

	static void one() {

		two();

	}

}

public class Throws_Keyword {

	public static void main(String[] args) {

		try {
			Hello.one();
		} catch (Exception e) {
			System.out.println("Exception Handled: \n"+e);
		}

	}

}
