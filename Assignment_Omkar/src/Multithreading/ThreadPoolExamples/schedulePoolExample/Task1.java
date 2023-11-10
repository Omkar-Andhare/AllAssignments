package Multithreading.ThreadPoolExamples.schedulePoolExample;

import java.util.concurrent.TimeUnit;

public class Task1 implements Runnable{
    @Override
    public void run() {
        System.out.println("I am Task 1     "+ System.currentTimeMillis());

    }
}
