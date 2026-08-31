package oop;

class CompositionEngine {
    void start() {
        System.out.println("Engine starts");
    }
}

class CompositionCar {
    private final CompositionEngine engine = new CompositionEngine();

    void start() {
        engine.start();
    }
}

public class Composition {
    public static void main(String[] args) {
        new CompositionCar().start();
    }
}
// Interview distinction: composition models a has-a relationship; inheritance models an is-a relationship.
