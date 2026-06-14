package Oops_PM;

class test
{
	int Id ;
	String name;
	float  marks;
	
	void get(int b, String Name,float mark) {
		
		Id = b;
		name = Name;
		marks = mark;
	}
	void set() {
		
		System.out.println("Id: "+Id);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
		
	}
}
public class ClassObj {

	public static void main(String[] args) {
		
		test t1 = new test();
		
		t1.get(10, "Rohan", 72.45F);
		t1.set();

		
//		new test();
//		System.out.println(new test().Id);

		
	}
}
