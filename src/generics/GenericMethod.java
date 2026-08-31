package generics;

public class GenericMethod {
    static <T> void print(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        print("Java");
        print(100);
    }
}
// Interview trap: generic type parameters are compile-time constructs; Java implements generics through type erasure.
