package Oops_PM;

class vehicle{
	
	vehicle()
	{
		System.out.println("vehicle");
	}	
}

class Bike extends vehicle{
	
	
	Bike(){
		
		System.out.println("Vehicle is Bike");
		
	}
	
}
class car extends vehicle{
	
	car(){
		
		System.out.println("Vehicle is car");
		
	}
	
}

public class HierachicleInheritance {

	public static void main(String[] args) {
		
		Bike b1 = new Bike();
		car c1 = new car();
		
	}
	
	
}
