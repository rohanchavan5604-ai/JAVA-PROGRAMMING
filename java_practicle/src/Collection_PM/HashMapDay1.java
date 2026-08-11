package Collection_PM;

import java.util.HashMap;

public class HashMapDay1 {

	public static void main(String[] args) {
		
		
//		collection<generic> = key*
//		map <genric, genric>
		
		
		HashMap<Integer,String> h= new HashMap<Integer,String>();
		
		h.put(1, "Rohan");
		h.put(2, "Chavan");
		h.put(1, "Rohan RC");
		h.put(3, "Bastawde");
		
		System.out.println(h);
		
	}
	
}
