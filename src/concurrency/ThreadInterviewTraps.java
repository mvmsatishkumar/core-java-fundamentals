package concurrency;

public class ThreadInterviewTraps {

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> System.out.println("worker"));

        worker.start();
        worker.join();

        Thread sleeping = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupt status when handling the interruption.
            }
        });

        sleeping.start();
        sleeping.join();
    }
}

// start() creates/schedules a new thread; run() is just a normal method invocation.
// sleep() pauses the current thread but does not release monitors; wait() releases the monitor while waiting.
// interrupt() is a cooperative cancellation signal, not a forced thread termination.
