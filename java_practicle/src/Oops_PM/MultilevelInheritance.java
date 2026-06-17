package Oops_PM;

class Animal1{
	
	Animal1(){
		
		System.out.println("Animal");
	}
	
}
class Dog1 extends Animal1{
	
 Dog1(){
	 System.out.println("Barks");
 }
	
}
class BabyDog extends Dog1{
	
	BabyDog(){
		
		System.out.println("Eat");
		
	}
	
}

public class MultilevelInheritance {
	
	public static void main(String[] args) {
		
		BabyDog b1 = new BabyDog();
		
	}

}
