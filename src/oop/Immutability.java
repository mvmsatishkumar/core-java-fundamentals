package oop;

//class You extends Immutability {  can't Do this
//	public You() {
//		System.out.println("hello");
//	}
//}

public final class Immutability {
    private final String name;
    private final int age;

    public Immutability(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Immutability person = new Immutability("Java", 25);
        System.out.println(person.getName() + " " + person.getAge());
    }
}

// Interview checklist: final class prevents subclassing; final fields prevent reassignment.

// no setters preserve state after construction. No setters means external code has no method through which it can change the object's state after construction.
//💯 If a field is mutable, defensive copies are also required to make the class truly immutable.
