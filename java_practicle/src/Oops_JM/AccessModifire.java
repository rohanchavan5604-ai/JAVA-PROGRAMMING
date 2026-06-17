package Oops_JM;

class rc {
//	int r = 45;				// Accessible 
//	public int r = 45;		// Accessible
//	private int r = 45;		// Non Accessible
//	protected int r = 45;   // Accessible
	
	public int r = 10;
}

class cr extends rc {
	void display() {

		System.out.println("Parent Rc: " + r);

	}
}

public class AccessModifire {

//	int p = 7;				// Accessible
//	public int p = 7;		// Accessible
//	private int p = 7;		// Accessible
//	protected int p = 7;    // Accessible 
	
	public int p =10;

	public static void main(String[] args) {

		AccessModifire ac = new AccessModifire();

		System.out.println("Same Class: " + ac.p);

		rc r1 = new rc();
		System.out.println("Sub Class: " + r1.r);

		cr c1 = new cr();
		c1.display();

	}

}
