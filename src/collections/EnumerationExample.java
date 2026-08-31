package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class EnumerationExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);

        Enumeration<Integer> values = vector.elements();
        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }

        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("Java", 1);
        table.put("Spring", 2);

        Enumeration<String> keys = table.keys();
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }
    }
}
// Interview note: Enumeration is a legacy cursor mainly associated with Vector/Hashtable; Iterator is the modern general-purpose choice.
