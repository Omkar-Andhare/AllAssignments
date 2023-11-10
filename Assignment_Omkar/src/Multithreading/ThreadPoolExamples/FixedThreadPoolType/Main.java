package Multithreading.ThreadPoolExamples.FixedThreadPoolType;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        //  ExecutorService executorService = Executors.newFixedThreadPool(10);
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
        //  System.out.println("wait for mentioned sec");

        for (int i = 0; i < 2; i++) {

//            executorService.execute(new Task());
//            executorService.execute(new Task2());

            executorService.schedule(new Task(), 3, TimeUnit.SECONDS);

            //task to run repeatedly every 10 sec
            executorService.scheduleAtFixedRate(new Task2(), 1, 3, TimeUnit.SECONDS);
        }
        //initiate shutdown
//        executorService.shutdown();

        //will true if shutdown has begun
      //  System.out.println(executorService.isShutdown());

        //will return true if all task completed
      //  System.out.println(executorService.isTerminated());


        //will throw .RejectedExecutionException
//        executorService.execute(new Task());


    }
}
