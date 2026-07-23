package MultiThreading_PM;

class test36 extends Thread {

	public void run() {
 
	 
		
		for (int i = 1; i <= 3; i++) {
		
			try {
				
				//First print Then Timing 
//				System.out.println(Thread.currentThread().getName());
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName());
//				First Take Time Then Print
				
			}catch(Exception e){
				
				System.out.println("Their is an Exception ");
			}
			
//			System.out.println(Thread.currentThread().getName());
//			First Take Time Then Print
		 
		}
	}
}

public class SleepMethInThread {

	public static void main(String[] args) {
		
		test36 t = new test36();
		t.start();
		
		test36 t1 = new test36();
		t1.start();
		
	}
	
}
