package threads;

class Hi extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hi" + " ");
			
			try {
				Thread.sleep(10); // to Wait certain time 
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello" + " ");
			
			try {
				Thread.sleep(10); // to Wait certain time 
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ParallelExecution {
	
	public static void main(String[] args) throws InterruptedException {
		
		Hi t1 = new Hi();
		Hello t2 = new Hello();
		
		t1.start();
		Thread.sleep(2);
		t2.start();
		
//		System.out.println(Thread.MAX_PRIORITY); // 10
//		System.out.println(Thread.MIN_PRIORITY); // 1
//		System.out.println(Thread.NORM_PRIORITY); // 5
	}
}
