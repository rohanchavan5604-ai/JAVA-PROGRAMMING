package Oops_PM;

class Calculate {
 
	void add(int a, int b) {
		System.out.println("Addition is: "+(a+b));
	}
	
	void mul(int a, int b) {
		
		System.out.println("Multiplication is: "+(a*b));
	}
}

public class AddMulMethod {
	
	public static void main(String[] args) {	
		
		Calculate add = new Calculate();
	 
		add.add(10, 34);
		 
		Calculate mul = new Calculate();

		mul.mul(10, 5);
	}
}
