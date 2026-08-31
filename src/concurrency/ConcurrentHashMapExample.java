package concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("Java", 1);
        map.merge("Java", 1, Integer::sum);

        System.out.println(map);
    }
}
// Interview trap: ConcurrentHashMap does not allow null keys or null values.
