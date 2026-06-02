package com.ClassWorkJM;

public class PatternAtoZ {

	public static void main(String[] args) {
	
//		Z LETTER
		
		int n = 7;
		for(int i =1; i<=7;i++) {
			for(int j=7;j>=1;j--) {
				
				if (i==1 || i==7 || j==i) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		

//		Y LETTER
		
//		int n = 7;
//		for(int i =1; i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				
//				if((i <= n/2 + 1 && (i == j || i + j == n + 1))
//			            ||
//			            (j == n/2 + 1 && i > n/2 + 1)){
//					System.out.print("* ");
//	 			}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		
//	X  LETTER
		
//		int n = 7;
//		for(int i =1; i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				
//				if ( i==j || i+j ==7+1) {
//					System.out.print("* ");
//	 			}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
	
		
		
//		W LETTER
		
			
//		int n = 7;
//		for(int i =1; i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				
//				if (j==1 || j==n||
//						(i == j && i >= n/2 + 1) ||
//		           (i + j == n + 1 && i >= n/2 + 1)) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		
		
//	V LETTER
		
//		int n = 9;
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=(n*2)-1;j++) {
//				
//				if( j ==i || j ==(n*2)-i){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		
		
		
//	U LETTER
		
//		for(int i=1; i<=7; i++) {
//			for(int j=1; j<=7;j++) {
//				
//				if(j==1 || j==7 ||  i ==7){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		
//		T LETTER
		
//		for(int i = 1; i<=7;i++) {
//			for(int j=1; j<=7;j++) {
//				
//				if(i==1 || j==4) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		
		
		
//		S LETTER
		
//		for(int i = 1; i <= 7; i++) {
//		    for(int j = 1; j <= 5; j++) {
//
//		        if( i==1 || i == 6/2 +1 || i==7 ||
//		        		(j==1 && i< 7/2+1) ||
//		        		(j==5 && i> 7/2+1))
//		       
//		         {
//		            System.out.print("* ");
//		        } else {
//		            System.out.print("  ");
//		        }
//		    }
//		    System.out.println();
//		}
		

//		R LETTER IN ROHAN 
		
//		for(int i = 1; i <= 7; i++) {
//	    for(int j = 1; j <= 6; j++) {
//
//	        if( j == 1 || 
//	        (i==1 && j<5) ||
//	        (i==7/2+1 && j<5)||
//	         (i-j == 2 && i>=4)||
//	        (j==5 && i>1 && i<7/2 +1)
//	        ) {
//	            System.out.print("* ");
//	        } else {
//	            System.out.print("  ");
//	        }
//	    }
//	    System.out.println();
//	}
	
//	OUTPUT:-
		
//		* * * *     
//		*       *   
//		*       *   
//		* * * *     
//		*   *       
//		*     *     
//		*       *  
		
		
//		Q LETTER
		
//		for(int i=1;i<=7;i++) {
//		for(int j = 1;j<=7;j++) {
//			
//		 	if(i==1 || i==7||
//		 	  j==1|| j==7 ||
//		 	  (i==5 && j==5)||
//		 	  (i==6 && j==6))
//			{
//				System.out.print("* ");
//			}else {
//				System.out.print("  ");
//			}
//		}
//		System.out.println();
//	}
		
		
		
		
//		P LETTER
		
//		for(int i = 1; i <= 7; i++) {
//		    for(int j = 1; j <= 5; j++) {
//
//		        if( j == 1 || 
//		        (i==1 && j<5) ||
//		        (i==7/2+1 && j<5)||
//		        (j==5 && i>1 && i<7/2 +1)
//		        ) {
//		            System.out.print("* ");
//		        } else {
//		            System.out.print("  ");
//		        }
//		    }
//		    System.out.println();
//		}
		
		
		
		
//		O LETTER
		
//		for(int i=1;i<=7;i++) {
//			for(int j = 1;j<=7;j++) {
//				
//			 	if(i==1 || j==7|| j==1|| i==7)
//				{
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
//		N LETTER
		
//		for(int i=1;i<=7;i++) {
//			for(int j = 1;j<=7;j++) {
//				
//				if(j==1 || j==7||i==j)
//				{
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		M LETTER
		
//		for(int i=1;i<=7;i++) {
//			for(int j = 1;j<=7;j++) {
//				
//				if(j==1 || j==7 ||
//						(i==j&& i<= 7/2+1)||
//						 (i+j == 7 +1 && i<= 7/2 +1) )
//				{
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
//		L LETTER
		
//		for(int i=1;i<=7;i++) {
//			for(int j = 1;j<=4;j++) {
//				
//				if(i==7 || j==1)
//				{
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
	
//		K LETTER
		
//		for(int i=1;i<=7;i++) {
//			for(int j = 1;j<=5;j++) {
//				
//				if (j==1|| i+j ==5 || i-j ==3)
//				{
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
//		J LETTER
		
//		for(int i=1;i<=7;i++) {
//			for(int j = 1;j<=7;j++) {
//				
//				if(i==1 || j==4||
//						(i==7 && j<5)||
//						(j==1 && i>5))
//				{
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		
//		I LETTER
		
//		for(int i=1;i<=7;i++) {
//			for(int j = 1;j<=5;j++) {
//				
//				if(i==1|| i==7 || j==3)
//				{
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		
//	H LETTER
		
//		for(int i=1;i<=7;i++) {
//			for(int j = 1;j<=5;j++) {
//				
//				if(i==4 || j==1 || j==5)
//				{
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		
		
//		G LETTER
		
//		for(int i=1;i<=7;i++) {
//			for(int j = 1;j<=5;j++) {
//				
//				if((i==1 || j==1 || i==7 ||
//						(i== 7/2 +1 && j>=3) ||
//						(j==5 && i>=7/2+1)))
//				{
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
//		F LETTER
		
//		for(int i=1;i<=8;i++) {
//			for(int j = 1;j<=5;j++) {
//				
//				if(i==1 || j==1 || i==4){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
//		E LETTER 
		
//		for(int i=1;i<=7;i++) {
//			for(int j = 1;j<=6;j++) {
//				
//				if(i==1 || j==1 || i==7 || i==4){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
				
		

//		D LETTER PATTERN
		
//		for(int i = 1; i<=7;i++) {
//			for(int j= 1; j<=5;j++) {
//				
//				if(j==1 || 
//				(i==1 &&  j<5)
//				||(i==7 && j<5)
//				||(j==5 && i>1 && i<7))
//				{
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
			
		
//		C LETTER PATTERN 
		
//		for(int i =1; i<=7; i++) {
//			for(int j=1;j<=5; j++) {
//				
//				if(j==1 || i==1||i==7) {
//					System.out.print("* ");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
 	
		
		
		
//		B LETTER PATTERN PRINT
		
//		int n = 7;
//		
//		for(int i =1; i<=n;i++) {
//			for(int j =1; j<=n;j++) {
//				if(j==1 ||
//				  (i==1 && j<n)||
//				  (i == n /2+1 && j<n)||
//				  (i==n && j<n)||
//				  (j == n && i > 1 && i < n / 2 + 1) ||
//					(j == n && i > n / 2 + 1 && i < n)) {
//
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//			}
//		}
//		System.out.println();
//		}
		
		
		
//		A LETTER PATTERN PRINT
		
//		int n = 7;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				if ((i == 1 && j > 1 && j < n) || 
//					(j == 1 && i > 1) || 
//					(j == n && i > 1)||
//					(i == n / 2 + 1))
//
//				{
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//			
//		}

			
		
	}
}
