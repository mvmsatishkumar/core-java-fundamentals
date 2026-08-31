package oop;

class ClassesAndObjectsEmployee {
    String name;
    int id;

    void display() {
        System.out.println(id + " " + name);
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        ClassesAndObjectsEmployee e = new ClassesAndObjectsEmployee();
        e.id = 101;
        e.name = "Satish";
        e.display();
    }
}
// Interview distinction: a class is a blueprint; an object is an instance created from that class.
