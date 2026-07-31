package Exeption_Handling_JM;

class Xyz29 {

	int n = 10;

	protected void finalize() {

		System.out.println("Garbage Collector");

	}

}

public class GarbageCollecterWildCard {

	public static void main(String[] args) {

		Xyz29 x = new Xyz29();

		x = null;

		System.gc();
		
//		System.out.println(x.n);  //Testing Part

	}

}
