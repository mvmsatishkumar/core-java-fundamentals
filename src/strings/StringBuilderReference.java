package strings;

public class StringBuilderReference {
	
    public static void main(String[] args) {
    	
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Backend").insert(0, "Core ");
        sb.setCharAt(0, 'c');
        sb.delete(0, 1);
        sb.reverse();

        System.out.println(sb);
    }
}
// Interview trap: StringBuilder methods mutate the same object and usually return the builder for chaining.
