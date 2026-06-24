package Oops_PM;

interface one {

	abstract void show();

}

interface two{
	
	abstract void get();
	
}

class R45 implements one,two {

	public void show() {

		System.out.println("Show");

	}

	public void get() {
		
		System.out.println("Get");
		
	}
}

public class June_23 {

	public static void main(String[] args) {

		R45 r = new R45();
		r.show();
		r.get();

	}

}
