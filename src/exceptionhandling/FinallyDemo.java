package exceptionhandling;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } finally {
            System.out.println("Cleanup runs regardless of normal/exceptional completion");
        }
    }
}
// Interview trap: finally normally executes even when an exception is thrown or a return is encountered.
