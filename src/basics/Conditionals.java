package basics;

public class Conditionals {
    public static void main(String[] args) {
        int marks = 82;

        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 75) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        int day = 2;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            default -> System.out.println("Other");
        }
    }
}
// Interview trap: switch without break in the traditional syntax falls through to the next case.
