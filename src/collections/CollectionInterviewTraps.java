package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionInterviewTraps {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 12, 12, 23, 26, 53));

        Collections.sort(numbers);  // Void return type sorts the collection
        int max = Collections.max(numbers);
        int idx = Collections.binarySearch(numbers, 26);
        int freq = Collections.frequency(numbers, 12);
        System.out.println(max + " " + idx + " " + freq);
        Collections.reverse(numbers);
        System.out.println(numbers);

        List<Integer> fixedSize = Arrays.asList(1, 2, 3);
        fixedSize.set(0, 9); // Allowed: the backing array is mutable.
        System.out.println(fixedSize);
 
        // fixedSize.add(4); // UnsupportedOperationException: Arrays.asList() is fixed-size.
    }
}

// Interview trap: Arrays.asList() is not a normal resizable ArrayList; add/remove operations are unsupported.
// Prefer new ArrayList<>(Arrays.asList(...)) when structural modification is required.
