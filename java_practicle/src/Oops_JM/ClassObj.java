package Oops_JM;


class student{
	
	int rollNo = 105;
	String name = "Rohan";
	
	void display() {
		
		System.out.println("Student Details :- ");
		System.out.println("Roll No: "+rollNo+"\nName: "+name);
		
	}
	
}

class Trainer{
	
	String name = "MySelf";
	long mob = 9988776665L;
 
	void display() {
		
		System.out.println("Trainer details :- ");
		System.out.println("Trainer Name: "+ name+"\nMobile Number: "+mob);
	}
}

public class ClassObj {

	public static void main(String[] args) {
		
		student st = new student();
		st.display();
		
		Trainer tr = new Trainer();
		tr.display();
		
	}
}
