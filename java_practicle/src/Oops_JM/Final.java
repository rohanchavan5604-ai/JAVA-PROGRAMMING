package Oops_JM;

class f{
	
	final int i = 1000;
	final void show() {
		
		System.out.println("Rohan");
		
	}
	
}

final class b9 extends f{
	
	void run() {
		 
		System.out.println("Going to home");
		
	}
	
}

public class Final extends f {

public static void main(String[] args) {
	
	f f1 = new f();
	
//	System.out.println(i);  //  Final keyword not Print directly
	
	System.out.println(f1.i);       
	
//	    f1.i = 145;       // it also not modify 
	
//	f1.show();
	
}

}
