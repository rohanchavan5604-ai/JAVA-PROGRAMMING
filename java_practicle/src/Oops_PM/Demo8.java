
package Oops_PM;

interface one34 {

//	@FunctionalInterface
	void rc();

	void RC();

}

interface one35 extends one34{
	
	void Cr();
	
}
interface one36 extends one35{
	
	void rohan();
	
}
public class Demo8 {
	public static void main(String[] args) {

		one36 o = new one36() {

			public void rc() {
				System.out.println("Rohan");
			}

			public void RC() {

				System.out.println("RC");

			}
			public void Cr() {
				System.out.println("Chavan Rohan");
			}
			public void rohan() {
				
				System.out.println("Rohan Chavan");
				
			}
				

		};
		o.rc();
		o.RC();
		o.Cr();
		o.rohan();
	}
}
