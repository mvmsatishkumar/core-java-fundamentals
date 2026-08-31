package concurrency;

public class RunnableExample {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> System.out.println("Task running");

        Thread thread = new Thread(task);
        thread.start();
        thread.join();
    }
}
// Interview question: Runnable separates the task from the Thread object and is generally preferred to extending Thread.
