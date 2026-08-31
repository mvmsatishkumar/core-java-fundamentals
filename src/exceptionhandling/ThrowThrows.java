package exceptionhandling;

public class ThrowThrows {
	
    static void validateAge(int age) {
        if (age < 18) throw new IllegalArgumentException("Underage");
    }

    static void riskyMethod() throws Exception {
        throw new Exception("Checked exception");
    }

    
    public static void main(String[] args) {
    	
        try {
            validateAge(16);
            riskyMethod();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
// Interview distinction: throw actually throws an exception object; throws declares possible exceptions in a method signature.
