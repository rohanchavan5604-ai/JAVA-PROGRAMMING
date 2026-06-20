package Oops_PM;

class a1 {

	void show() {

		System.out.println("First");

	}

}

class b2 extends a1 {

	void show() {

		super.show();
		System.out.println("Second");

	}

}

public class SuperKeywordMethod {
	public static void main(String[] args) {

		b2 b1 = new b2();
		b1.show();

	}
}
