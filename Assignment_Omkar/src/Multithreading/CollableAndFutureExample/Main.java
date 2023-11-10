package Multithreading.CollableAndFutureExample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Future<Integer> future = executorService.submit(new Task());
        // System.out.println(future);
        Integer result = future.get();
        System.out.println(result);
        executorService.shutdown();
    }

}
