package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Java", 1);
        map.put("Spring", 2);
        map.put("Java", 3); // Same key replaces the previous value.

        System.out.println(map.get("Java"));
        System.out.println(map.getOrDefault("Missing", 0));
        System.out.println(map.containsKey("Spring"));
    }
}
// Interview trap: HashMap allows one null key and multiple null values; key equality depends on equals()/hashCode().
