package oop;

abstract class Shape {
    abstract double area();

    void describe() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Shape shape = new Circle(2);
        shape.describe();
        System.out.println(shape.area());
    }
}
// Interview question: an abstract class can have state, constructors, concrete methods, and abstract methods.
