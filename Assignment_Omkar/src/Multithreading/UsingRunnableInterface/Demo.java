package Multithreading.UsingRunnableInterface;


import static java.lang.Thread.sleep;

class Thread1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hi Omkar Here");
            i++;
        }

    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
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


public class Demo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread thread1 = new Thread(t1);
        Thread2 t2 = new Thread2();
        Thread thread2 = new Thread(t2);
        thread2.start();
        thread1.start();


    }
}
