package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);

        System.out.println(arrayList);
        System.out.println(linkedList);
    }
}
// Interview question: ArrayList is usually preferred for random access; LinkedList is not automatically faster for all insertions.
