package oop;

public class CopySemantics {

    static class Address {
        String city;

        Address(String city) {
            this.city = city;
        }
    }

    static class Person {
        String name;
        Address address;

        Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        Person(Person other) {   // Copy constructor
            this.name = other.name;
            this.address = new Address(other.address.city); // Deep copy of the mutable nested object.
        }
    }

    public static void main(String[] args) {
        Person original = new Person("A", new Address("Hyderabad"));
        Person shallow = new Person(original.name, original.address);
        Person deep = new Person(original);

        shallow.address.city = "Chennai";
        System.out.println(original.address.city); // Chennai -> both objects share the same Address.

        deep.address.city = "Bengaluru";
        System.out.println(original.address.city); // Chennai -> deep copy has a separate Address.
    }
}

// Interview distinction: shallow copy duplicates the outer object but shares referenced mutable objects; deep copy duplicates the reachable mutable state.
// Object.clone() is a separate topic with pitfalls around Cloneable and shallow copying; copy constructors are often clearer.
