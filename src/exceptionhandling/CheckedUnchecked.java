package exceptionhandling;

import java.io.FileReader;
import java.io.IOException;

public class CheckedUnchecked {
    public static void main(String[] args) {
    	
        try (FileReader reader = new FileReader("missing.txt")) {
            System.out.println(reader.read());
            
        } catch (IOException e) {
            System.out.println("Checked exception handled");
        }

        int[] a = {1};
        try {
            System.out.println(a[2]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked exception handled");
        }
    }
}
// Interview distinction: checked exceptions are compiler-enforced; RuntimeException subclasses are unchecked.
