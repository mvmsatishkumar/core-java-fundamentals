package generics;

class Box<T> {
    private T value;

    void set(T value) { this.value = value; }
    T get() { return value; }
}

public class GenericClass {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.set(100);
        System.out.println(box.get());
    }
}
// Interview question: generics provide compile-time type safety and avoid many explicit casts.
