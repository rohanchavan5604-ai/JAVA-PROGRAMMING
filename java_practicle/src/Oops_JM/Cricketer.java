package Oops_JM;

class International{
	
	String name;
	int age;
	int jursyNo;
	void display() {
		
		System.out.println("International Player Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Jursy Number: "+ jursyNo);
		
	}
	
}

class Domastic{
	
	String name;
	int age;
	int jursyNo;
	void display() {
			
		System.out.println("Domastic Player Name: "+name);
		System.out.println("Age: "+age);
	}
}

public class Cricketer{

	public static void main(String[] args) {
		
		International ob = new International();
		Domastic obj = new Domastic();
		
		ob.name = " Rohit Sharma ";
		ob.age = 38;
		ob.jursyNo = 45;
		ob.display();
		
		obj.name = " Vaibhav Surywanshi ";
		obj.age = 16;
		obj.display();
		
	}
	
}
