package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> hash = new HashSet<>();
        Set<Integer> linked = new LinkedHashSet<>();
        Set<Integer> tree = new TreeSet<>();

        for (int n : new int[]{3, 1, 3, 2}) {
            hash.add(n);
            linked.add(n);
            tree.add(n);
        }

        System.out.println(hash);
        System.out.println(linked);
        System.out.println(tree);
    }
}
// Interview distinction: HashSet has no ordering guarantee; LinkedHashSet preserves insertion order; TreeSet maintains sorted order.
