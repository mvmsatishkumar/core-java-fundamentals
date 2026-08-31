package strings;

public class StringBasics {
    public static void main(String[] args) {
        String s = "Java";

        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.substring(1, 3));
        System.out.println(s.contains("av"));
        System.out.println(s.equals("Java"));
        System.out.println(s.equalsIgnoreCase("java"));
    }
}
// Interview trap: use equals() for String content; == compares references.
