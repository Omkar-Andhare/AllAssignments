package Multithreading.UsingRunnableInterface;

import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;

public class Thread1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            try {
                sleep(100);
                yield();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hi Omkar Here");
            i++;
        }

    }
}
