package oop;

class Employee {
    int id;
    String name;

    Employee() {
        this(0, "Unknown"); // Constructor chaining avoids duplicated initialization logic.
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "A");
        System.out.println(e1.name);
        System.out.println(e2.name);
    }
}
// Interview trap: constructors have no return type and are not inherited or overridden.
