package Oops_PM;

class c1 {

	c1(int r) {
		System.out.println("Rohan");
	}

}

class c2 extends c1 {
	c2() {
		super(45);
		System.out.println("Chavan");
	}

}

public class SuperKeywordConst {

	public static void main(String[] args) {

		c2 c = new c2();

	}

}
