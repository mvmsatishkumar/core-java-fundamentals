package streams;

import java.util.Arrays;
import java.util.List;

public class FilterMapSorted {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 2, 8, 1, 4);

        List<Integer> result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10)
                .sorted()
                .toList();

        System.out.println(result);
    }
}
// Interview map: filter selects elements; map transforms each element; sorted orders the stream.
