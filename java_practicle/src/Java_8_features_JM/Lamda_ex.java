package Java_8_features_JM;

interface hello43 {

	void rc(); // by default method is abstract
//	void sp(); only one method in one functional interface. 

}

public class Lamda_ex {

	public static void main(String[] args) {

		hello43 h = () -> System.out.println("Rohan Chavan Bastawade");
		h.rc();

	}

}
