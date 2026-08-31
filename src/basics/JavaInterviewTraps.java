package basics;

public class JavaInterviewTraps {

    static void change(int value) {
        value = 99;
    }

    static void reassign(StringBuilder builder) {
        builder = new StringBuilder("new object");
    }

    static void mutate(StringBuilder builder) {
        builder.append(" changed");
    }

    public static void main(String[] args) {
        int n = 10;
        change(n);
        System.out.println(n); // Java is always pass-by-value; the primitive value is copied.

        StringBuilder sb = new StringBuilder("original");
        reassign(sb);
        System.out.println(sb); // Reassigning the copied reference does not change the caller's reference.

        mutate(sb);
        System.out.println(sb); // The copied reference still points to the same mutable object.
    }
}

// Interview trap: Java passes object references by value; it never passes references themselves by reference.
