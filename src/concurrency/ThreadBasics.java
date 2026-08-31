package concurrency;

public class ThreadBasics {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> System.out.println("Worker: " + Thread.currentThread().getName()));

        t.start(); // Starts a new thread.
        t.join();  // Waits for that thread to finish.
    }
}
// Critical interview trap: run() is an ordinary method call; start() creates/schedules a separate thread.
