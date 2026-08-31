package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapInterviewTraps {

    static class Key {
        int id;

        Key(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof Key other && id == other.id;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(id);
        }
    }

    public static void main(String[] args) {
        Map<Key, String> map = new HashMap<>();
        map.put(new Key(1), "Java");

        System.out.println(map.get(new Key(1))); // Works because equals() and hashCode() agree.

        Map<String, Integer> counts = new HashMap<>();
        counts.computeIfAbsent("Java", key -> 0);
        counts.put("Java", counts.get("Java") + 1);
        System.out.println(counts);
    }
}

// Interview trap: equal keys must have equal hash codes; mutable keys can make a HashMap entry effectively unreachable after mutation.
// Modern HashMap implementations may treeify heavily-collided buckets; exact internals are implementation details, not API guarantees.
