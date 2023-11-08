package Multithreading.PracticeScenario;

public class Demo implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("----start------");

        System.out.println("---out----");
        System.out.println(Thread.currentThread().getName());
    }
}
