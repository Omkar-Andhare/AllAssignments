package Multithreading.UsingThreadClass;


public class Demo {

    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
//      myThread1.join(); // it is for complete one thread first and then start next thread
        myThread2.start();
    }
}
