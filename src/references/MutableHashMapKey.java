package references;

import java.util.HashMap;
import java.util.Map;

class StudentKey {
    int id;

    StudentKey(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentKey other)) return false;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

public class MutableHashMapKey {
    public static void main(String[] args) {
        StudentKey key = new StudentKey(1);
        Map<StudentKey, Integer> map = new HashMap<>();

        map.put(key, 100);
        key.id = 2;

        System.out.println(map.get(key)); // May be null because the key's hash changed after insertion.
    }
}
// Interview trap: do not mutate fields used by equals()/hashCode() while an object is a HashMap/HashSet key.
