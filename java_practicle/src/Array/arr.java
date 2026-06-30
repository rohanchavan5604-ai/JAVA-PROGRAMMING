package Array;

public class arr {

	public static void main(String[] args) {
		
		int m_marks [] [] = {{1,2},{1,2,3,4},{1,2,3}};
		
		for(int i=0; i<m_marks.length; i++) {
			
			System.out.println("Row Length:- "+m_marks[i].length);
			
			for(int j=0; j<m_marks[i].length; j++) {
				
				System.out.print(m_marks[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
	}
	
}
