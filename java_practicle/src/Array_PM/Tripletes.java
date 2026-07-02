package Array_PM;

public class Tripletes {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5,6,7};
		
//			print triplet in single loop
		
//		int r = 3;
//		
//		for(int p=0; p<a.length-(r-1); p++){
//
//			System.out.println(a[p]+" "+a[p+1]+" "+a[p+2]);
//			
//		}
	
//		System.out.println("======================================================");	
		
//		print triplet using Two loop
		
		//Find The Min Sum && Find the Max Sum
		
	int r = 3;
	int index =0;
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	for(int p=0; p<a.length-(r-1); p++){

	
		
		int add = 0;
		for(int s=p; s<p+r;s++) {
	 
		System.out.print(a[s]+" " );
		add = add + a[s];
		}
		System.out.println("  Sum: "+add);
		
		if(add < min) {
			min = add;
			index = p;
		}
		
		if(add>max) {
			max = add;
		}
		
	}
	System.out.println("Min: "+min );
	System.out.println(max);
	
	
	
//	System.out.println("======================================================");
	
	
//		print triplet  using three loop
		
		
//		for(int i=0; i<a.length; i++) {
//			
//			for(int j= 0; j<a.length; j++) {
//				
//				for(int k=0; k<a.length;k++) {
//					
//					int sum = a[i]+a[j]+a[k];
//					
//					if(sum>=20) {
//					System.out.println(a[i]+" " +a[j]+" "+a[k]+" Sum = "+sum);
//					}
//				}
//				
//			}
//			
//			
//		}
		
	}
	
}
