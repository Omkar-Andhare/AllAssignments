package Multithreading.UsingThreadClass;


class MyThread1 extends Thread {
    int i = 0;

    @Override
    public void run() {
        while (i < 1000) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I am playing cricket");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    int i = 0;

    @Override
    public void run() {
        while (i < 1000) {
            try {
                sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("I am playing volleyball");
            i++;
        }
    }
}
public class Demo {

    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
//      myThread1.join(); // it is for complete one thread first and then start next thread
        myThread2.start();
    }
}
