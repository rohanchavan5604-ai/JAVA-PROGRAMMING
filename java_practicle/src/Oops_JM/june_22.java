package Oops_JM;

abstract class t1 {

	abstract void call();
	
	void name() {
		
		String name = "Rohan Chavan";
		int id = 45;
		
		System.out.println("Name: "+ name + " Id: "+id );
		
	}

}

class june_22 extends t1 {

	void call() {
		System.out.println("Hello I Am ABSTRACT Method");
	}

	public static void main(String[] args) {

		june_22 j = new june_22();
		
//		t1 j = new june_22();    // Both Working

		j.call();
		j.name();

	}

}
