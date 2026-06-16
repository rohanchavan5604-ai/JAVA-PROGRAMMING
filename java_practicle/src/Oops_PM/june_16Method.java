package Oops_PM;

class m1 {

	m1() {

		this(2);
		System.out.println("First");
	}

	m1(int a) {
		System.out.println("Second");
	}
}

public class june_16Method {

	public static void main(String[] args) {

		m1 m = new m1();

	}
}
