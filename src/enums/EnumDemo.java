package enums;

enum Status {
    NEW, IN_PROGRESS, DONE
}

public class EnumDemo {
    public static void main(String[] args) {
        Status status = Status.IN_PROGRESS;

        if (status == Status.IN_PROGRESS) {
            System.out.println("Working");
        }
    }
}
// Interview question: enum constants are singleton-like instances of the enum type and can have fields, constructors, and methods.
