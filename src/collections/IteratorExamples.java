package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExamples {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) it.remove(); // Safe structural removal through this iterator.
        }

        ListIterator<Integer> lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
    }
}
// Interview trap: removing from a list directly inside an enhanced for-loop can cause ConcurrentModificationException.
