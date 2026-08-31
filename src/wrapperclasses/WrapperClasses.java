package wrapperclasses;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer a = 100; // Autoboxing.
        int b = a;       // Unboxing.

        System.out.println(a + b);
    }
}
// Interview trap: == on wrapper objects can compare references; do not rely on Integer caching outside the documented cache range.
