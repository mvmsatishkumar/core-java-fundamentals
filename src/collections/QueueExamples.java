package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);

        System.out.println(queue.peek()); // Reads head without removing.
        System.out.println(queue.poll()); // Reads and removes head.
    }
}
// Interview trap: poll()/peek() return null when empty; remove()/element() throw an exception.
