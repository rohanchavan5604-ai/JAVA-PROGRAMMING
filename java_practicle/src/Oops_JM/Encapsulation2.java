package Oops_JM;

class Add {
	
private	int num1 , num2;

// Using Constructor

Add(int n1, int n2){
	
	num1 = n1;
	num2 = n2;
	
}

int display() {
	
 return	num1 + num2;
 
}

//	Methods 

//public int getNum() {
//	return num1 + num2;
//}
//
//public void setNum(int num1,int num2) {
//	this.num1 = num1;
//	this.num2 = num2;
//
//	
//}	
}

public class Encapsulation2 {

	public static void main(String[] args) {
		
		// using Constructor
		
		Add a = new Add(12,56);
		 System.out.println("Using Constructor Addition is: "+a.display());

		 
		 // Using Methods 
		 
//		a.setNum(20, 35);
//		int  add = a.getNum();
//		System.out.println("Addition: "+add);
		
	}
	
}
 