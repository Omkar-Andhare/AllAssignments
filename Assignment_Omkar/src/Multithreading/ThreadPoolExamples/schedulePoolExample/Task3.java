package Multithreading.ThreadPoolExamples.schedulePoolExample;

public class Task3 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am Task 3     " + System.currentTimeMillis());
    }
}
