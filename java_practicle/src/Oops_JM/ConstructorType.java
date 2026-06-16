package Oops_JM;

class Metro2 {

    String MetroName;
    int totalStations;
    double ticketPrice;

 
    Metro2() {}

 
    Metro2(String name, int st, double tp) {
        MetroName = name;
        totalStations = st;
        ticketPrice = tp;
    }

     
    Metro2(Metro2 ob) {
        MetroName = ob.MetroName;
        totalStations = ob.totalStations;
        ticketPrice = ob.ticketPrice;
    }
    
    public String toString() {
    	return "Metro Details: "+ MetroName+" "+totalStations+" "+ticketPrice;
    }
    

//    void display() {
//        System.out.println("Metro Name: " + MetroName);
//        System.out.println("Total Stations: " + totalStations);
//        System.out.println("Ticket Price: " + ticketPrice);
//    }
}

public class ConstructorType {

    public static void main(String[] args) {

	 	System.out.println(" Default Constructor");
        	
    	    Metro2 m = new Metro2();
    	    
    	    System.out.println(m);
    	    
//    	    m.display();
       
    	    System.out.println("=============================================");
    	    
    	 	System.out.println("Parameterized Constructor");
  	    
        Metro2 m1 = new Metro2("Pune Metro", 10, 30.0);
        
        System.out.println(m1);
        
//        m1.display();

	    System.out.println("=============================================");

        
        System.out.println("\nCopy Constructor");

        Metro2 m2 = new Metro2(m1);
        
        System.out.println(m2);
        
//        m2.display();
        
	    System.out.println("=============================================");

    }
}