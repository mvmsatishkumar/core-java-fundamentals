package streams;

import java.util.Arrays;
import java.util.List;

public class StreamBasics {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 5, 3, 1, 4, 5, 7);

        long uniqueCount = nums.stream().distinct().count();
        List<Integer> values = nums.stream().skip(2).limit(3).toList();

        System.out.println(uniqueCount);
        System.out.println(values);
    }
}
// Interview trap: intermediate operations are lazy; a stream normally starts processing when a terminal operation is invoked.
