package Multithreading.ThreadScenarios.Task2;

import java.util.concurrent.atomic.AtomicInteger;

class ThreadA implements Runnable {
     AtomicInteger i=new AtomicInteger(0);

    public static  AtomicInteger m1(AtomicInteger i) {
        i.getAndIncrement();
        return i;

    }

    @Override
    public void run() {
        System.out.println(m1(i));
    }

}


public class Main {
    public static void main(String[] args) {


        ThreadA a = new ThreadA();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);
        Thread t3 = new Thread(a);
        Thread t4 = new Thread(a);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}

