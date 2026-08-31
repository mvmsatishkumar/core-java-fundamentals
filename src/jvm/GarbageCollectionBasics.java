package jvm;

public class GarbageCollectionBasics {
    public static void main(String[] args) {
        Object object = new Object();
        object = null; // The object becomes unreachable and eligible for garbage collection.

        System.out.println("Object is no longer strongly reachable");
    }
}
// Interview trap: System.gc() is only a request/hint; Java does not guarantee immediate garbage collection.
