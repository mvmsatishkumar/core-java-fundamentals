package generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {

    static double sum(List<? extends Number> numbers) {
        double total = 0;
        for (Number number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }

    static void addIntegers(List<? super Integer> numbers) {
        numbers.add(10);
        numbers.add(20);
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);

        System.out.println(sum(integers));

        List<Number> numbers = new ArrayList<>();
        addIntegers(numbers);
        System.out.println(numbers);
    }
}

// PECS: Producer Extends -> read from ? extends; Consumer Super -> write values into ? super.
// Interview trap: List<Integer> is not a subtype of List<Number>, even though Integer extends Number.
