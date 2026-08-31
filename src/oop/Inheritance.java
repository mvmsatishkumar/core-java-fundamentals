package oop;

// =====================
// 1. Single Inheritance  single parent single child
// =====================

class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car drives");
    }
}

// =====================
// 2. Multilevel Inheritance    multiple level parent
// =====================

class SportsCar extends Car {

    void turbo() {
        System.out.println("SportsCar uses turbo");
    }
}

// =====================
// 3. Hierarchical Inheritance  multiple subclasses
// =====================

class Bike extends Vehicle {

    void ride() {
        System.out.println("Bike rides");
    }
}

// =====================
// 4. Multiple Inheritance
//    (Through Interfaces)
// =====================

interface Electric {

    void charge();
}

interface Connected {

    void connect();
}

class ElectricCar extends Vehicle implements Electric, Connected {

    @Override
    public void charge() {
        System.out.println("ElectricCar charges");
    }

    @Override
    public void connect() {
        System.out.println("ElectricCar connects");
    }
}


// =====================
// 5. Hybrid Inheritance - Combination of inheritance types
// =====================

interface Autonomous {

    void selfDrive();
}

class AutonomousCar extends Car implements Autonomous {

    @Override
    public void selfDrive() {
        System.out.println("AutonomousCar self-drives");
    }
}


// =====================
// Main Class
// =====================

public class Inheritance {

    public static void main(String[] args) {

        // Single Inheritance
        Car car = new Car();
        car.start();     // inherited from Vehicle
        car.drive();     // Car's own method

        System.out.println();

        // Multilevel Inheritance
        SportsCar sportsCar = new SportsCar();
        sportsCar.start();    // Vehicle
        sportsCar.drive();    // Car
        sportsCar.turbo();    // SportsCar

        System.out.println();

        // Hierarchical Inheritance
        Bike bike = new Bike();
        bike.start();     // inherited from Vehicle
        bike.ride();     // Bike's own method

        System.out.println();

        // Multiple Inheritance through Interfaces
        ElectricCar electricCar = new ElectricCar();
        electricCar.start();      // Vehicle
        electricCar.charge();     // Electric
        electricCar.connect();    // Connected

        System.out.println();

        // Hybrid Inheritance
        AutonomousCar autonomousCar = new AutonomousCar();
        autonomousCar.start();       // Vehicle
        autonomousCar.drive();       // Car
        autonomousCar.selfDrive();   // Autonomous
    }
}
// Interview trap: Java supports class inheritance through extends, but a class cannot extend multiple classes.
