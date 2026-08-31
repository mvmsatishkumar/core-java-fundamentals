package basics;

public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // Integer division truncates the fractional part.
        System.out.println(a % b);

        System.out.println(a > b && b > 0);
        System.out.println(a == 10 ? "yes" : "no");
    }
}
// Interview trap: 10 / 3 is 3 when both operands are int; use 10.0 / 3 for floating-point division.
