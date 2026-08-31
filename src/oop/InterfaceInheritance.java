package oop;

interface Calculator {
    int add(int a, int b);
}

interface AdvancedCalculator extends Calculator {
    int cube(int n);
}

class CalculatorImpl implements AdvancedCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int cube(int n) {
        return n * n * n;
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Calculator basic = new CalculatorImpl();
        AdvancedCalculator advanced = new CalculatorImpl();

        System.out.println(basic.add(2, 3));
        System.out.println(advanced.cube(3));
    }
}
// Interview trap: the reference type determines which interface methods the caller can access.
