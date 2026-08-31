package basics;

import java.util.Arrays;

public class ArraysBasic {
    public static void main(String[] args) {
        int[] nums = {4, 1, 7, 2};

        System.out.println(nums.length); // Arrays use length, not length().
        Arrays.sort(nums);

        for (int n : nums) System.out.print(n + " ");
        System.out.println();
        System.out.println(Arrays.toString(nums));
    }
}
// Interview trap: array length is a field; String length is a method.
