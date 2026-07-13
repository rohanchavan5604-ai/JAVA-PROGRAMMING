package Array;

public class MultiDimCharArr {

	public static void main(String[] args) {
		
		char a[][][] = {
				
				{{'A','B','R'}, {'C','D','P'}},
				{{'E','F'}, {'G','H'}}
				
		};
		
		for(int k=0; k<a.length; k++) {
			
			for(int i=0; i<a[k].length; i++) {
				
				for(int j=0; j<a[k][i].length; j++) {
					
					System.out.print(a[k][i][j]+" ");
					
				}
				System.out.println();
				
			}
			System.out.println();
			
		}
		
	}
	
}
