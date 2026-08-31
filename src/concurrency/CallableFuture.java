package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> task = () -> 10 + 20;
        FutureTask<Integer> future = new FutureTask<>(task);

        new Thread(future).start();

        System.out.println(future.get()); // get() waits if the computation is not finished.
    }
}
// Interview distinction: Callable can return a result and throw checked exceptions; Runnable cannot return a result.
