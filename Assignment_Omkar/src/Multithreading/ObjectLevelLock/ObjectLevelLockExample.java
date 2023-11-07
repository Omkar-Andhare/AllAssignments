package Multithreading.ObjectLevelLock;

public class ObjectLevelLockExample {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }

    public synchronized void m1() {
        System.out.println("in m1() and thread name is " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());


    }

    public synchronized void m2() {
        System.out.println("in m2() and thread name is " + Thread.currentThread().getName());
    }
}
