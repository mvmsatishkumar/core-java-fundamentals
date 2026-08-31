package basics;

public class TypeCasting {
    public static void main(String[] args) {
        int n = 100;
        long l = n; // Widening conversion: implicit and generally safe.

        double d = 9.8;
        int i = (int) d; // Narrowing conversion: explicit and truncates the fraction.

        System.out.println(l);
        System.out.println(i);
    }
}
// Interview trap: narrowing a floating-point value does not round; (int) 9.8 becomes 9.
