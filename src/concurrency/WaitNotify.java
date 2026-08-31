package concurrency;

public class WaitNotify {

    private final Object lock = new Object();
    private boolean ready;

    void awaitReady() throws InterruptedException {
        synchronized (lock) {
            while (!ready) {
                lock.wait(); // Releases the monitor and waits until notified or interrupted.
            }
        }
    }

    void signalReady() {
        synchronized (lock) {
            ready = true;
            lock.notifyAll();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WaitNotify demo = new WaitNotify();

        Thread worker = new Thread(() -> {
            try {
                demo.awaitReady();
                System.out.println("Worker continues");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        worker.start();
        Thread.sleep(50);
        demo.signalReady();
        worker.join();
    }
}

// Interview trap: wait()/notify()/notifyAll() must be used while owning the same object's monitor.
// Always re-check the condition in a while loop because wake-ups do not guarantee the condition is true.
