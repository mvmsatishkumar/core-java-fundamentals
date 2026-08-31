package java8;

import java.util.Optional;

public class OptionalBasics {
	
    public static void main(String[] args) {
    	
        Optional<String> value = Optional.of("Java");

        value.map(String::toUpperCase)
             .ifPresent(System.out::println);

        String fallback = Optional.<String>empty().orElse("Default");
        System.out.println(fallback);
    }
}
// Interview trap: Optional.of(null) throws NullPointerException; use Optional.ofNullable() when null is possible.
