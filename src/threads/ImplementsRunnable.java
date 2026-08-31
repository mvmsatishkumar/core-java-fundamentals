package threads;

public class ImplementsRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Runnig Thread");
	}
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new ImplementsRunnable());   // Thread receiving Runnable object 
		t.start();
	}
}

//The Thread uses the Runnable's run().
