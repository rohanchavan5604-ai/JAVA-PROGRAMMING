package MultiThreading_PM;

class test398 extends Thread {

	public void run() {
//		use to know the name of class of currentThread
//		System.out.println(Thread.currentThread().getClass());

	}

}

public class GetClassMethod {

	public static void main(String[] args) {

		test398 t = new test398();

		t.start();
		System.out.println(t.getClass());

	}

}
