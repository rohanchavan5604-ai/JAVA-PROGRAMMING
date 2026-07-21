package String_JM;

public class StringBuffer1 {

	public static void main(String[] args) {

//		STRINGBUFFER

		StringBuffer name = new StringBuffer("Rohan");

		System.out.println(System.identityHashCode(name));

		name = name.append("Chavan");
		System.out.println(System.identityHashCode(name));

		System.out.println(name);

		System.out.println("------------------------------------");
		

//		STRINGBUILDER

		StringBuilder name1 = new StringBuilder("Hefshine");

		System.out.println(System.identityHashCode(name1));

		name1 = name1.append("Pune");
		System.out.println(System.identityHashCode(name1));

		System.out.println(name1);

		System.out.println("------------------------------------");
		
		

	}

}
