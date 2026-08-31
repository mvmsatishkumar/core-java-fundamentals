package basics;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) System.out.println(i);

        int i = 0;
        while (i < 3) {
            System.out.println(i++);
        }

        int j = 0;
        do {
            System.out.println(j++);
        } while (j < 1);
    }
}
// Interview question: do-while executes its body at least once because the condition is checked after the body.
