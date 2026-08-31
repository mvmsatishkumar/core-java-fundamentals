package streams;

import java.util.Arrays;
import java.util.List;

public class MatchFindReduce {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        boolean anyEven = nums.stream().anyMatch(n -> n % 2 == 0);
        int sum = nums.stream().reduce(0, Integer::sum);
        int first = nums.stream().findFirst().orElse(-1);

        System.out.println(anyEven);
        System.out.println(sum);
        System.out.println(first);
    }
}
// Interview trap: reduce() combines stream elements into one result; choose identity carefully because it participates in the result.
