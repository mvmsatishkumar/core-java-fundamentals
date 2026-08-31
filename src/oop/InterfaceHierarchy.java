package oop;

interface BasicCalculator {
    int sum(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);
}

interface AdvancedCalculatorContract extends BasicCalculator {
    int square(int n);
    int cube(int n);
}

class InterfaceHierarchyCalculatorImpl implements AdvancedCalculatorContract {
    public int sum(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public int square(int n) { return n * n; }
    public int cube(int n) { return n * n * n; }
}

public class InterfaceHierarchy {
    public static void main(String[] args) {
        BasicCalculator basic = new InterfaceHierarchyCalculatorImpl();
        AdvancedCalculatorContract advanced = new InterfaceHierarchyCalculatorImpl();

        System.out.println(basic.sum(2, 3));
        System.out.println(advanced.cube(3));
    }
}
// Interview trap: interface inheritance lets a child interface add contracts while retaining parent-interface methods.
