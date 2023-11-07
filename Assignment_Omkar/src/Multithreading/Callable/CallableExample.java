package Multithreading.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();

        int result = futureTask.get();
        System.out.println("Result " + result);
    }
}
