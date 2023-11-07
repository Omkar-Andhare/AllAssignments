package Multithreading.UsingRunnableInterface;

import static java.lang.Thread.sleep;

public class Thread2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hi Shubham here");
            i++;
        }

    }
}
