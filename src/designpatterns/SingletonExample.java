package designpatterns;

public class SingletonExample {
    private static final SingletonExample obj = new SingletonExample();

//    private SingletonExample() {}

    public static SingletonExample getInstance() {
        return obj;
    }

    public static void main(String[] args) {
        System.out.println(SingletonExample.getInstance() == SingletonExample.getInstance());
    }
}
// Interview trap: a naive singleton can break under concurrency or reflection; enum is a robust simple singleton option in Java.
