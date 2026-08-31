package concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private final ReentrantLock lock = new ReentrantLock();
    private int count;

    void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock(); // Always unlock in finally to avoid leaving the lock held.
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockExample demo = new ReentrantLockExample();
        Thread a = new Thread(demo::increment);
        Thread b = new Thread(demo::increment);
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println(demo.count);
    }
}
// Interview point: ReentrantLock provides explicit locking and features such as tryLock() that synchronized does not.
