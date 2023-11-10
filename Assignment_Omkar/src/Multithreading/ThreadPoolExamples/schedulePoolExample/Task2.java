package Multithreading.ThreadPoolExamples.schedulePoolExample;

public class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am Task 2     " + System.currentTimeMillis());
    }
}
