package Oops_JM;

class Game {

	void game() {

		System.out.println("Indoor & Outdoor");

	}

}

class Cricket extends Game {

	void game() {

		System.out.println("Cricket");

	}

}

public class Poly {

	public static void main(String[] args) {

		Game g = new Game();
		Cricket c1 = new Cricket();

		g.game();
		c1.game();
		

		g = c1;   // g reffer to cricket obj
		
//		System.out.println( g instanceof Game);  //only testing 
		
		g.game(); // calls cricket method
		
		
		
//		System.out.println( c1 instanceof Cricket);

		

	}

}
