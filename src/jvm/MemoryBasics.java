package jvm;

public class MemoryBasics {
    static int staticValue = 10;

    public static void main(String[] args) {
        int local = 20;
        Object object = new Object();

        System.out.println(staticValue + local + object.hashCode());
    }
}
// Interview model: local variables/references live in stack frames, while objects are generally allocated on the heap; exact implementation details are JVM-dependent.
