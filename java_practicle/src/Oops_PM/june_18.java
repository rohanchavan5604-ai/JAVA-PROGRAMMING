package Oops_PM;

class RC4 {
	
	void get() {
		System.out.println("Rc");
	}
	
}
class Chavan extends RC4{
	
	void get1() {
		System.out.println("Chavan");
	}
	
}
class Rohan5 extends Chavan{
	void get2() {
		System.out.println("Rohan");
	}
}
class rc extends Chavan{
	void get3() {
		System.out.println("Rohan Chavan");
	}
}

public class june_18 {

	public static void main(String[] args) {
		
	Rohan5 r1 = new Rohan5();
	r1.get();
	r1.get1();
	r1.get2();
		
	rc r = new rc();
	r.get();
	r.get1();
	r.get3();
	}
	
}
