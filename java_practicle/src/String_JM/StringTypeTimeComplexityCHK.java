package String_JM;

public class StringTypeTimeComplexityCHK {

	public static void main(String[] args) {

	        int iterations = 100000;
	        
	        // Using String concatenation
	        long startTime = System.currentTimeMillis();
	        String str = "";
	        for (int i = 0; i < iterations; i++) {
	            str += "a";
	        }
	        long endTime = System.currentTimeMillis();
	        System.out.println("Time taken with String: " + (endTime - startTime) + " ms");
	        
	        // Using StringBuilder
	        startTime = System.currentTimeMillis();
	        StringBuilder builder = new StringBuilder();
	        for (int i = 0; i < iterations; i++) {
	            builder.append("a");
	        }
	        String resultBuilder = builder.toString();
	        endTime = System.currentTimeMillis();
	        System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + " ms");
	        
	        // Using StringBuffer
	        startTime = System.currentTimeMillis();
	        StringBuffer buffer = new StringBuffer();
	        for (int i = 0; i < iterations; i++) {
	            buffer.append("a");
	        }
	        String resultBuffer = buffer.toString();
	        endTime = System.currentTimeMillis();
	        System.out.println("Time taken with StringBuffer: " + (endTime - startTime) + " ms");
		
	}
	
}
