package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExamples {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);
        deque.addLast(20);

        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
// Interview question: ArrayDeque can act as both a stack and a queue and generally outperforms legacy Stack.
