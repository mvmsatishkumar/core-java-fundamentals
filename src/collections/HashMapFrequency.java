package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapFrequency {
    public static void main(String[] args) {
        String s = "banana";
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println(freq);
    }
}
// Interview pattern: getOrDefault() makes frequency counting concise without a separate containsKey() check.
