package Oops_PM;

class main
{
   void cal() {
	   
	   System.out.println("Simple Method ");
	   
   }
   void cal(int a) {
	   
	   System.out.println("Calculate Square: "+(a*a));
	   
   }
   
   void cal(int a , int b)
   {
	   System.out.println("Addition of two Num: "+(a+b));
   }
}

public class NonParameterized2 {

	public static void main(String[] args) {
		
		main m1 = new main();
		
		m1.cal();
		m1.cal(5);
		m1.cal(6,9);
		
	}
	
}
