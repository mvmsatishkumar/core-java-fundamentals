package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        Map<Boolean, List<Integer>> result =
                nums.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(result);
    }
}
// Interview distinction: partitioningBy groups by a boolean predicate; groupingBy supports arbitrary keys.
