package threads;

class Counter {
	
	int count;
	// void increment()  -> output may not be 2000 due to race condition
	synchronized void increment() {   // solves the race condition
		count++;
	}
}

public class RaceCondition {
	public static void main(String[] args) throws InterruptedException {
		
		Counter c = new Counter();
		Thread obj1 = new Thread(() -> {
			
			for (int i = 0; i < 1000; i++) {
				c.increment();
//				System.out.println("T1 started");
			}
		});
		
		Thread obj2 = new Thread(() -> {
			
			for (int i = 0; i < 1000; i++) {
				c.increment();
//				System.out.println("T2 started");
			}
		});
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Main: " + c.count);
		
	}
}

//A race condition happens when multiple threads compete to read/write shared data without proper synchronization,
//causing unpredictable and often incorrect results. In Java, it is commonly prevented using:

//- synchronized
//- `Lock` implementations from java.util.concurrent.locks
//- Atomic classes like `AtomicInteger`
//- Thread-safe collections from java.util.concurrent
