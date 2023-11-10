package Multithreading.ThreadScenarios.ReviewSyncUp;

import static Multithreading.ThreadScenarios.ReviewSyncUp.Main.ob1;
import static Multithreading.ThreadScenarios.ReviewSyncUp.Main.ob2;

public class Demo implements Runnable {


    @Override
    public void run() {
        m1();
    }

    public void m1() {
        synchronized (ob2) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("I am Run method");
            System.out.println(Thread.currentThread().getName());
        }

    }
}
