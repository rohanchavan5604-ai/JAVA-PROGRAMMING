package Oops_PM;

public class Interface implements third, second, first {

	@Override
	public void show() {
		// TODO Auto-generated method stub

		System.out.println("First");
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub

		System.out.println("Second");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Third");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interface t1 = new Interface();
		t1.display();
		t1.get();
		t1.show();
		
	}

}
