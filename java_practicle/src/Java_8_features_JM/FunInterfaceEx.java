package Java_8_features_JM;

import java.util.function.Function;

public class FunInterfaceEx {

	public static void main(String[] args) {
		
		Function<Integer,String> binary = 
				n -> Integer.toBinaryString(n);
		
				System.out.println(binary.apply(10));
				
	}
	
}
