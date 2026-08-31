package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Deadlock {

    public static void main(String[] args) throws InterruptedException {
        Lock first = new ReentrantLock();
        Lock second = new ReentrantLock();

        Thread t1 = new Thread(() -> {
            first.lock();
            try {
                second.lock();
                try {
                    System.out.println("T1 acquired both");
                } finally {
                    second.unlock();
                }
            } finally {
                first.unlock();
            }
        });

        Thread t2 = new Thread(() -> {
            first.lock(); // Same lock acquisition order prevents circular wait.
            try {
                second.lock();
                try {
                    System.out.println("T2 acquired both");
                } finally {
                    second.unlock();
                }
            } finally {
                first.unlock();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}

// Deadlock requires conditions such as mutual exclusion, hold-and-wait, no preemption, and circular wait.
// Interview solution: enforce a consistent lock ordering or use timed tryLock() where appropriate.
