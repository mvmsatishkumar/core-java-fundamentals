package java8;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> even = n -> n % 2 == 0;
        Function<Integer, String> stringify = String::valueOf;
        Consumer<String> print = System.out::println;
        Supplier<Double> random = Math::random;

        System.out.println(even.test(4));
        System.out.println(stringify.apply(10));
        print.accept("Java");
        System.out.println(random.get());
    }
}
// Interview map: Predicate -> boolean test; Function -> transform; Consumer -> consume; Supplier -> produce.

//A functional interface has exactly one abstract method
//A functional interface can have multiple default or static methods.