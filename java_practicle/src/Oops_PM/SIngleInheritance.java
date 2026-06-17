package Oops_PM;

class Animal{
	
	  Animal() {
		 System.out.println("Run");
	 }
	
}

class Dog  extends Animal{
	
	Dog() {
		System.out.println("Bark");
	}
	
}

public class SIngleInheritance {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		
	}
	
}
