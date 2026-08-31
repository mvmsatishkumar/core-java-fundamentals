package streams;

import java.util.Arrays;

public class PrimitiveStreams {
    public static void main(String[] args) {
        double average = Arrays.stream(new int[]{1, 2, 3, 4}).average().orElse(0);

        System.out.println(average);
    }
}
// Interview question: IntStream/LongStream/DoubleStream avoid repeated boxing when processing primitive values.
