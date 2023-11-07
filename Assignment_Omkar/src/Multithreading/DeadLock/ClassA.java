package Multithreading.DeadLock;


public class ClassA {


    public synchronized void foo(ClassB b) {
        System.out.println("thread 1 starts execution of foo() method");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println("Thread 1 trying to call ClassB.last()");
        b.last();
    }

    public synchronized void last() {
        System.out.println("inside classA, this is last method");
    }
}