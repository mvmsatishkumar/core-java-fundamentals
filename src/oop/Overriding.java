package oop;

class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Parent ref = new Child();
        ref.show();
    }
}
// Interview trap: reference type controls accessible members; the runtime object controls an overridden instance method.
//Reference type determines what members are accessible at compile time.