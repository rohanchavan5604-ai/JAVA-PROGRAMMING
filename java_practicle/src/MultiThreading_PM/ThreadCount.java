package MultiThreading_PM;

class test35 extends Thread {

	public void run() {
 
		for (int i = 1; i <= 3; i++) {
			
		    // return count of current active threads
			System.out.println(Thread.currentThread().activeCount());
		}
	}
}
public class ThreadCount {

	public static void main(String[] args) {
		
		test35 t = new test35();
		t.start();
		
		test35 t1 = new test35();
		t1.start();
		
		test35 t2 = new test35();
		t2.start();
		
	}
	
}
