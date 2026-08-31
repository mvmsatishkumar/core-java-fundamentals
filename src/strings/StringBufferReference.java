package strings;

public class StringBufferReference {
	
    public static void main(String[] args) {
    	
        StringBuffer buffer = new StringBuffer("Java");
        buffer.append(" Backend");

        System.out.println(buffer);
    }
}
// Interview question: StringBuffer is synchronized; StringBuilder is not and is usually preferred for single-threaded work.
