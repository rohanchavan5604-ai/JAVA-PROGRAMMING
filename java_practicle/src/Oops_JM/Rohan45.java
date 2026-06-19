package Oops_JM;

class rc45{
	
	void rohan(){
		System.out.println("Rohan");
	}
	
	public String toString() {    // To String Method 
		return "Rohan Chavan";
	}
	
}
class r10 extends  rc45{
	
	void rohan(int a) {
		
		System.out.println("Rohan Chavan Bastawade "+a);
		
	}
	
}
public class Rohan45 {

	public static void main(String[] args) {
		
		r10 r1 = new r10();
		r1.rohan(45);
		
		System.out.println(r1);
		
	}
	
}
