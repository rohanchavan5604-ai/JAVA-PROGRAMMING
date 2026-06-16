package Oops_PM;

class test2{
	
//	Names of Overloading
	
//	method overloading
//	compile time overloading
//	static overloading
	
	static void get() {
		System.out.println("Get");
	}
	
	static void get(int a) {
		System.out.println("Get1");
	}
	
}

public class StaticOverloading {

	public static void main(String[] args) {
		
		test2.get();
		test2.get(10);
		
	}
	
}
