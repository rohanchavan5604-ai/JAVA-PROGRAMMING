package Oops_PM;

class A {

	A(){
		System.out.println("First");
	}
	
	
//	void get() {
//		System.out.println("Get");
//	}
//
//	void data() {
//
//		System.out.println("Data");
//	}
	
}

class B extends A {

	B(){
		System.out.println("Second");
	}
	
	
//	void get1() {
//
//		System.out.println("Get1");
//
//	}

}

public class Inheritance {

	public static void main(String[] args) {

		B ob = new B();

//		ob.get();
//		ob.get1();
//		ob.data();

	}

}
