package streams;

import java.util.List;

public class StreamInterviewTraps {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);

        var stream = numbers.stream().filter(n -> {
            System.out.println("filter: " + n);
            return n % 2 == 0;
        });

        System.out.println("Pipeline created");
        System.out.println(stream.findFirst().orElse(-1)); // Processing starts when the terminal operation runs.

        var reusable = numbers.stream();
        System.out.println(reusable.count());

        // reusable.count(); // IllegalStateException: a stream cannot normally be reused after a terminal operation.
    }
}

// Interview trap: intermediate operations are lazy; short-circuiting terminals such as findFirst() can avoid processing later elements.
// Streams do not automatically mutate the source collection.
