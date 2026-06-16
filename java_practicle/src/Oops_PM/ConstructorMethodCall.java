package Oops_PM;

class test3 {
	
	int n;
	String name;
	float marks;
	
	test3(int n, String name,float marks) 
	{
		this.n=n;
		this.name = name;
		this.marks = marks;
	}
	void set() {
		
		System.out.println(n);
		System.out.println(name);
        System.out.println(marks);		
	}
}

public class ConstructorMethodCall {

	public static void main(String[] args) {
		
		test3 t1 = new test3(5,"Rohan",75.0f);
		t1.set();
		
	}
	
}
