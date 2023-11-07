package Multithreading.DeadLock;


public class DeadLock implements Runnable {
    ClassB b;
    ClassA a;

    DeadLock(ClassA a, ClassB b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
//        synchronized (a) {
//            System.out.println("Thread 1 has lock on ClassA");
//            try {
//                Thread.sleep(100); // Introducing a delay to ensure both threads are blocked
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Thread 1 is waiting for ClassB lock");
//            synchronized (b) {
//                a.foo(b);
//            }
//        }
        a.foo(b);
        b.foo(a);


    }
}