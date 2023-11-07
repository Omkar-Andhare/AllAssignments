package Multithreading.DeadLock;


public class ClassB {
    public synchronized void foo(ClassA a) {
        System.out.println("thread 2 starts execution of foo() method");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e) {}
        System.out.println("Thread 2 trying to call ClassB.last()");
        a.last();
    }

    public synchronized void last() {
        System.out.println("inside classB, this is last method");
    }
}
