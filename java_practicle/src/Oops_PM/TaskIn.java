package Oops_PM;

/*
 
//    	DIAGRAM / STRUCTURE OF HYBRID INHERITANCE
       
		 Hello 
		   |
		 Hello1
		   |
		 Hello2             
       /        \
  Hello3	        Hello4 	

*/
class Hello{
	
	void set() {
		System.out.println("Set");
	}
	
}
class Hello1 extends Hello{
	
	void set1() {
		System.out.println("Set1");
	}
	
}
class Hello2 extends Hello1{
	
	void set2() {
		System.out.println("Set2");
	}
	
}class Hello3 extends Hello2{
	
	void set3() {
		System.out.println("Set3");
	}
	
}
class Hello4 extends Hello2{
	
	void set4() {
		System.out.println("Set4");
	}
	
}

public class TaskIn {

	public static void main(String[] args) {
		
		
		Hello3 h1 = new Hello3();
		h1.set();
		h1.set1();
		h1.set2();
		h1.set3();
	
		System.out.println("==============================================");
		
		Hello4 h2 = new Hello4();
		h2.set();
		h2.set1();
		h2.set2();
		h2.set4();
		
	}
	
}
