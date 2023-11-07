package Multithreading.threadgroup.SimpleExample;

public class ThreadGroupExample {
    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        ThreadGroup threadGroup = new ThreadGroup("group");

        Thread t1 = new Thread(threadGroup, test, "thread1");
        t1.start();


        Thread t2 = new Thread(threadGroup, test, "thread2");
        t2.start();


        Thread t3 = new Thread(threadGroup, test, "thread3");
        t3.start();

        Thread t4 = new Thread(threadGroup, test, "thread4");
        t4.start();


        System.out.println("ThreadGroup Name is: " + threadGroup.getName());
        System.out.println("Number of active thread " + threadGroup.activeCount());
        threadGroup.list();
    }
}
