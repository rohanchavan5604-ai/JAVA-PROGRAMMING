package Oops_JM;

class Metro{
	
	   String MetroName;
	   int totalStations; 
	   double ticketPrice;
	   
	   Metro(){ }
	   
	   Metro(String name, int st, double tp)
	   {
		MetroName = name;
		totalStations = st;
		ticketPrice = tp;
	   }
	   void display() {
		   
		   System.out.println("Metro Name: "+MetroName);
		   System.out.println("Total Stations: "+totalStations);
		   System.out.println("Ticket Price: "+ticketPrice);
		   
	   }
}

public class Constructor {

	public static void main(String[] args) {
		
		System.out.println("==============================================\nNonparameterized Constructor");
		
		 Metro m1 = new Metro();
		 m1.display();
		 
		System.out.println("==============================================\nparameterized Constructor");
		 
		Metro m2 = new Metro("Pune Metro", 10, 30.0);
		m2.display();
	}
	
}
