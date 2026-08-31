package java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {
	
    public static void main(String[] args) {
    	
        List<String> names = Arrays.asList("Java", "Spring");
        names.forEach(System.out::println);
    }
}
// Interview question: method reference is shorthand for certain lambdas when an existing method already matches the functional interface signature.
