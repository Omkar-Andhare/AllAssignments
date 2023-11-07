package Multithreading.threadgroup.SimpleExample;

import static java.lang.Thread.sleep;

public class Test implements Runnable {
    @Override
    public void run() {
        try {
            sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
