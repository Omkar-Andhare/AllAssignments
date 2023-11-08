package Multithreading.UsingThreadClass;

public class MyThread1 extends Thread {
    int i = 0;

    @Override
    public void run() {
        while (i < 10) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I am playing cricket");
            i++;
        }
    }
}