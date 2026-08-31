package jvm;

public class ClassLoadingBasics {
    static {
        System.out.println("Class initialized");
    }

    public static void main(String[] args) {
        System.out.println("main");
    }
}
// Interview topic: class loading, linking, and initialization are distinct phases in JVM class lifecycle.
