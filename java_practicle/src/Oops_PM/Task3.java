package Oops_PM;

/*	// Hybrid Inheritance  Dia  Hierarchical + Multi Multilevel's	
 * 
 *       ro1           // Hierarchical inheritance
 *      /   \
 *    ro2    ro3  
 *     |      |		  // Multiple Multilevel's	Inheritance						
 *    ro4    ro6
 *     |      |
 *    ro5	 ro7
 * 
 */

class ro1 {
	void ro1() {
		System.out.println("Ro1");
	}
}

class ro2 extends ro1{
	void ro2() {
		System.out.println("Ro2");
	}
}

class ro3 extends ro1{
	void ro3() {
		System.out.println("Ro3");
	}
}

class ro4 extends ro2{
	void ro4() {
		System.out.println("Ro4");
	}
}

class ro5 extends ro4{
	void ro5() {
		System.out.println("Ro5");
	}
}

class ro6 extends ro3{
	void ro6() {
		System.out.println("Ro6");
	}
}

class ro7 extends ro6{
	void ro7() {
		System.out.println("Ro7");
	}
}

public class Task3 {

	public static void main(String[] args) {
		
		ro5 r1 = new ro5();
		r1.ro1();
		r1.ro2();
		r1.ro4();
		r1.ro5();
		
		System.out.println("=========================");
	
		ro7 r = new ro7();
		r.ro1();
		r.ro3();
		r.ro6();
		r.ro7();
	}
	
}
