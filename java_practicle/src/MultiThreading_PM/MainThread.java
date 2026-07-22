package MultiThreading_PM;

class demo289 extends Thread {

	public void run() {

//		use to know the name of current thread 
		
		System.out.println(Thread.currentThread().getName());
		
		
//		use to know the name of current thread class loader
//		System.out.println(Thread.currentThread().getContextClassLoader());
		
//		use to know that thread is in working or not
//		System.out.println(Thread.currentThread().isAlive());
		
		

	}

}

public class MainThread {

	public static void main(String[] args) {

		demo289 d = new demo289();
		d.setName("First");
		d.start();

		demo289 d1 = new demo289();
		d1.start();

		demo289 d2 = new demo289();
		d2.setName("Third");
		d2.start();

		
		System.out.println("---------------Thread In our Every Program (main) Cross Verify----------------------");
		
//		Thread Present in Our Every program (main) Cross Verify:-

		
//		System.out.println(Thread.currentThread().getName());
//
//		// Thread -> Predefined class
//		// currenThread() -> return address of current Thread
//		// getName() -> return name only from address of current Thread

	}

}
