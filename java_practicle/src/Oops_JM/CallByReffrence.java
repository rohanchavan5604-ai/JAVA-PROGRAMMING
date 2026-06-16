package Oops_JM;

class callByRef{
	
	int x = 10;
	int y = 20;
	
	void input(callByRef add) {
		
		add.x = 100;
		add.y = 200;
		
	} 
	  
}

public class CallByReffrence {

	public static void main(String[] args) {
		
		callByRef  call = new callByRef();
		
		System.out.println(call.x +" "+ call.y);
		
		call.input(call);
		
		System.out.println(call.x +" "+ call.y);
	}
	
}
