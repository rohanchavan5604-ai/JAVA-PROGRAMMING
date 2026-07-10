package Array_PM;

public class Char_Sort {

	public static void main(String[] args) {
		
		char ch []= {'r','o','h','a','n'};
		
		for(char c = 'a'; c<='z'; c++) {
			
			for(int i=0; i<ch.length; i++) {
				
				if(c==ch[i]) {
					
					System.out.println(c);
					
				}
				
			}
			
		}
		
	}
	
}
