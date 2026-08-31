package threads;

public class ExtendThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Executing Thread");
	}
	
	public static void main(String[] args) {
		
		ExtendThread t = new ExtendThread();
		t.start();
	}
}


//You can start a Thread without overriding run(), but some run() implementation is always executed. Without custom run() logic, the thread simply does no useful work.