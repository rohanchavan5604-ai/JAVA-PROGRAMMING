package Oops_PM;

class Main
{
	
 int add(int a,int b) {
	 
	 return a+b;
 }
		
	byte sub(byte a, byte b) {
		
		return (byte)(a-b);
		
	}
		
	short mul(short a , short b) {
		
		return (short)(a*b);
	}
	
	 String mul1 (short a , short b) {
		
		return "Multiplication is: " + (a*b);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Main m1 = new Main();
		 
		System.out.println("Addition Method: "+m1.add(10,45)); 
		
		System.out.println("Subtraction Method: "+m1.sub((byte) 5, (byte) 3));
		
		System.out.println("Multiplication Method: "+m1.mul((short)3,(short) 4));
				
		System.out.println(m1.mul1((short)5,(short)9));
	}
	
}
