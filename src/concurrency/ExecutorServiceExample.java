package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        try {
            pool.submit(() -> System.out.println("Task 1"));
            pool.submit(() -> System.out.println("Task 2"));
        } finally {
            pool.shutdown();
            pool.awaitTermination(1, TimeUnit.SECONDS);
        }
    }
}
// Interview question: ExecutorService manages a pool of reusable worker threads instead of creating one thread per task.
