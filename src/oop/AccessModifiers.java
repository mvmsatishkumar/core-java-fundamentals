package oop;

class AccessModifiersParent {
    private int privateValue = 1;
    protected int protectedValue = 2;
    public int publicValue = 3;

    void print() {
        System.out.println(privateValue + protectedValue + publicValue);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        new AccessModifiersParent().print();
    }
}
// Interview map: private -> class only; default -> package; protected -> package plus subclasses; public -> everywhere subject to access.
