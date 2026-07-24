package MultiThreading_PM;

class t1 extends Thread {

	public void run() {

		for (int i = 1; i <= 3; i++) {

			System.out.println(Thread.currentThread().getName());

		}

		try {

		} catch (Exception e) {
			System.out.println("Exception occur");
		}

	}

}

public class JoinMethodInThread {

	public static void main(String[] args) {

		t1 t = new t1();
		t.start();

//		// Use to stop the execution of thread for while
////		t.stop();
//
//		// Use to suspend the thread
////		t.suspend();
//		// use to resume those threads which are suspended
////		t.resume();

		t1 t2 = new t1();
		t2.start();
	}

}
