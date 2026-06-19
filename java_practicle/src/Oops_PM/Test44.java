package Oops_PM;

class t1 {
	int a = 20;
}

class t2 extends t1 {

	int a = 200;

	void test() {
		System.out.println(" Child "+a + " Parent " + super.a);

	}

}

public class Test44 {
	public static void main(String[] args) {

		t2 tt = new t2();
		tt.test();
	}
}
