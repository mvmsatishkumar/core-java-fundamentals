package oop;

public class OverloadingTraps {
    static void show(int n) {
        System.out.println("int");
    }

    static void show(long n) {
        System.out.println("long");
    }
    
//    static int show(int n) {
//        System.out.println("can't");
//        return n;
//    }

    public static void main(String[] args) {
        show(10);   // Exact match wins.
        show(10L);  // long overload.
//      int a = show(20);   can't
    }
}
// Interview trap: Java cannot overload methods using only a different return type.
