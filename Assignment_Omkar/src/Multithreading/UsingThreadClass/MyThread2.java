package Multithreading.UsingThreadClass;

public class MyThread2 extends Thread {
    int i = 0;

    @Override
    public void run() {
        while (i < 10) {
            try {
                sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("I am playing volleyball");
            i++;
        }
    }
}