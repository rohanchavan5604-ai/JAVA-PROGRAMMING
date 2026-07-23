package String_JM;

public class VowelInEachWordString {

	public static void main(String[] args) {
		
		String arr[] = {"Rohan","Onkar","Tushar","Pranay","Prathamesh","Aniket","Sunit","Shubham"};
		
		String names = "";
		int max = 0 ;
		
		for(String name: arr) {
			
			int c =0;
			for(char ch : name.toLowerCase().toCharArray()) {
				
				if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					
					c++;
					
				}
				
			}
			if(c>max) {
				
			max = c;
			names = name;
				
			}
			else if(c==max) {
				
				names = names + ", "+ name;
				
			}
		}
		System.out.println("Max Vowels: "+max);
		System.out.println("Names: "+names);
		
	}
	
}
