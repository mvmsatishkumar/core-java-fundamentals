package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMapAndJoining {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Spring", "Java");

        Map<String, Integer> lengths = names.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        String::length,
                        (oldValue, newValue) -> oldValue // Merge function handles duplicate keys.
                ));

        String joined = names.stream().distinct().collect(Collectors.joining(", "));

        System.out.println(lengths);
        System.out.println(joined);
    }
}
// Interview trap: Collectors.toMap() throws on duplicate keys unless a merge function is supplied.
