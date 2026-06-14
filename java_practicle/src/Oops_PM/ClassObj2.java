package Oops_PM;

class Student
{
	int a ;
	String name;
	float  marks;
 
	
	void get(int b, String Name,float mark) {
		
		a = b;
		name = Name;
		marks = mark;
	}
	void set() {
		
		System.out.println("Id: "+a);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
		
	}
}
public class ClassObj2 {

	public static void main(String[] args) {
		
		test t1 = new test();
		test t2 = new test();
		
		t1.get(10, "Rohan", 72.45F);
		t1.set();
		
		System.out.println("================================================");
 	 
		t2.get(45, "Chavan", 77.56F);
		t2.set();
		
//		System.out.println("Identity HashCode for t1: "+System.identityHashCode(t1));
//		System.out.println("Identity HashCode for t2: "+System.identityHashCode(t2));
	}
}
