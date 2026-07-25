package MultiThreading_PM;

//Priority
//10 
//1 to 10
//1 -> min
//5 -> norm
//10-> max

class demo232 extends Thread {

	public void run() {

//		use to get the priority
		System.out.println(Thread.currentThread().getPriority());

	}

}

public class PriorityMethod {

	public static void main(String[] args) {

		System.out.println("Main: " + Thread.currentThread().getPriority());

//		use to get the priority
		Thread.currentThread().setPriority(10);

		System.out.println("Main: " + Thread.currentThread().getPriority());

		demo232 d = new demo232();
		d.setPriority(Thread.MIN_PRIORITY);
//		d.setPriority(4); // This is also valid
		d.start();

		demo232 d1 = new demo232();
		d1.setPriority(Thread.NORM_PRIORITY);
		d1.start();

	}

}
