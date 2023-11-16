package Multithreading.ThreadFactoryAndexecutorServiceExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {

    public static void main(String[] args) {
        // Create a custom thread factory
        ThreadFactory customThreadFactory = new MyThreadFactory1();

        // Create an ExecutorService using the custom thread factory
        ExecutorService executorService = Executors.newFixedThreadPool(3, customThreadFactory);

        // Submit Runnable tasks to the ExecutorService
        for (int i = 1; i <= 3; i++) {
            executorService.submit(new MyTask(i));
        }
        // Shutdown the ExecutorService
        executorService.shutdown();
    }
}
