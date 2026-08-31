package oop;

public class Overloading {
    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(2.5, 3.5));
    }
}
// Interview trap: overloading is compile-time polymorphism; changing only the return type does not overload a method.
