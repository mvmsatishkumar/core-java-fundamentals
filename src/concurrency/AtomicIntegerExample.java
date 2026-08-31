package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger count = new AtomicInteger();

        Thread t1 = new Thread(() -> { for (int i = 0; i < 1000; i++) count.incrementAndGet(); });
        Thread t2 = new Thread(() -> { for (int i = 0; i < 1000; i++) count.incrementAndGet(); });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(count.get());
    }
}
// Interview question: AtomicInteger provides lock-free atomic operations for supported updates such as incrementAndGet().
