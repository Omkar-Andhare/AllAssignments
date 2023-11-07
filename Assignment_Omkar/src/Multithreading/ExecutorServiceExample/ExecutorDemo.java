package Multithreading.ExecutorServiceExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed-size thread pool (3 threads)
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Define some tasks as Runnable objects
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 1 executed by thread: " + Thread.currentThread().getId());
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 2 executed by thread: " + Thread.currentThread().getId());
            }
        };

        Runnable task3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 3 executed by thread: " + Thread.currentThread().getId());
            }
        };

        // Submit tasks for execution
        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);

        // Shutdown the ExecutorService when done
        executorService.shutdown();
    }
}
