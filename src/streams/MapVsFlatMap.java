package streams;

import java.util.List;

public class MapVsFlatMap {

    public static void main(String[] args) {
        List<String> names = List.of("Java", "Spring");

        List<Integer> lengths = names.stream()
                .map(String::length)
                .toList();

        List<String> words = List.of("Java Streams", "Spring Boot");

        List<String> flattened = words.stream()
                .flatMap(sentence -> List.of(sentence.split(" ")).stream())
                .toList();

        System.out.println(lengths);
        System.out.println(flattened);
    }
}

// map() transforms one element into one result; flatMap() transforms each element into a stream and flattens the results.
// Interview trap: map(List::stream) produces Stream<Stream<T>>; flatMap is used when the nested streams should be flattened.
