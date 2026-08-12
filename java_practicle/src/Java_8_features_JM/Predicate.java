package Java_8_features_JM;

import java.util.function.Function;

public class Predicate {

	public static void main(String[] args) {
		
		 Function<Integer,Integer> fact = n ->{
			 
			 int result =1;
			 for(int i=1; i<=n; i++) {
				 
				 result *=i;
				 
				 
			 }
			 return result;
			 
		 };
		 
		 System.out.println("Factorial : "+fact.apply(5));
		
	}
	
}
