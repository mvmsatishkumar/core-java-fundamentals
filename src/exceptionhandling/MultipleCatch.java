package exceptionhandling;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] values = {10, 20};
            System.out.println(values[2]);
            
        } catch (ArithmeticException e) {
        	
            System.out.println("Arithmetic error");
            
        } catch (ArrayIndexOutOfBoundsException e) {
        	
            System.out.println("Invalid array index");
        }
    }
}
// Interview trap: catch blocks must go from more specific to more general exception types.
