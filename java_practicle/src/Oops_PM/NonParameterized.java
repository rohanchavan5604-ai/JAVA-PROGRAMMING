package Oops_PM;

class test1 {

	void get() {
		System.out.println("Get");
	}
	
	
	static void get1() {
		System.out.println("Get1");
	}
	
	
	static  void display(int a, String name) {
		
		System.out.println("Integer Parameterized Method: "+a+"\nName: "+name);
		
	}
	

//	void num(int a) {
//
//		System.out.println("Integeral: " + a);
//	}
//
//	void num(float a) {
//
//		System.out.println("Floating: " + a);
//
//	}

}

public class NonParameterized {

	public static void main(String[] args) {

		test1 t1 = new test1();

		t1.get();
		test1.display(5,"Rohan");
		
//		t1.get1();  		// Not Mandatary
//		test1.get1();
		

		
//		t1.num(2);
//		t1.num((float) 4);

	}

}
