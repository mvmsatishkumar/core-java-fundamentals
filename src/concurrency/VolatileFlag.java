package concurrency;

public class VolatileFlag {
    private volatile boolean running = true;

    void stop() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileFlag demo = new VolatileFlag();

        Thread worker = new Thread(() -> {
            while (demo.running) {
                // Work until another thread changes the flag.
            }
            System.out.println("Stopped");
        });

        worker.start();
        Thread.sleep(10);
        demo.stop();
        worker.join();
    }
}
// Interview trap: volatile gives visibility/order guarantees, not compound-operation atomicity.
