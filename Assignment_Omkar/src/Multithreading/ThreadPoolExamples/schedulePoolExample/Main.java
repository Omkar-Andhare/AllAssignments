package Multithreading.ThreadPoolExamples.schedulePoolExample;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        scheduledExecutorService.schedule(new Task1(), 3, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new Task2(), 5, 5, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new Task3(), 1, 3, TimeUnit.SECONDS);
        sleep(5000);
//        List<Runnable> unfinishedTasks = scheduledExecutorService.shutdownNow();
//        for (Runnable task : unfinishedTasks) {
//            System.out.println(task.toString());
//
//        }
        scheduledExecutorService.shutdown();


    }
}
