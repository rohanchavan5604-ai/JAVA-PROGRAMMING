package Oops_PM;

class A3 {

	void get() {

		System.out.println("Get");

	}

}

class B3 {

	A3 a = new A3();

	void set() {

		System.out.println("set");

	}

}

class C3 {

	B3 b = new B3();

	void show() {

		System.out.println("show");

	}

}

public class june_20 {

	public static void main(String[] args) {

		C3 c = new C3();

		c.show();
		c.b.set();
		c.b.a.get();

	}

}
