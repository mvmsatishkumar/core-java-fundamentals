package strings;

public class StringPool {
	
    public static void main(String[] args) {
    	
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b); // Same pooled literal reference.
        System.out.println(a == c); // Different object reference.
        System.out.println(a.equals(c)); // Same content.
    }
}
// Interview question: intern() returns the canonical pooled representation of a String.
