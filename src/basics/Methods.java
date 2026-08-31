package basics;

public class Methods {
    static int add(int a, int b) {
        return a + b;
    }

    static void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        greet();
        System.out.println(add(2, 3));
    }
}
// Interview question: Java is always pass-by-value; for objects, the value passed is a copy of the reference.
