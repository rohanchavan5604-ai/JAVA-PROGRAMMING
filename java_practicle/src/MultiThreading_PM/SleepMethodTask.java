package MultiThreading_PM;

class Test37 extends Thread{
	
	public void run() {
		
		try {
			
			
			System.out.println("Order is placed");
			Thread.sleep(2000);
			
			System.out.println("Order request is accepted");
			Thread.sleep(3000);
			
			System.out.println("Your Order is on the way");
			Thread.sleep(2000);
			
			System.out.println("order is deliverd");
			Thread.sleep(4000);
			
		}catch(Exception e) {
			
			System.out.println("Program is Interrupted");
			
		}
		
	}
	
}

public class SleepMethodTask {

	public static void main(String[] args) {
		
		Test37 t = new Test37();
		t.start();
		
	}
	
}
