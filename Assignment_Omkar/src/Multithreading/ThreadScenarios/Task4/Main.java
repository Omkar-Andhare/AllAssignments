package Multithreading.ThreadScenarios.Task4;

class ThreadA implements Runnable {
    int i = 0;
    Test test = new Test();


    @Override
    public void run() {
        synchronized (test) {
            i++;
            System.out.println(i);
            System.out.println("--start----"+Thread.currentThread().getName());

            test.m1();
            System.out.println("--end--"+Thread.currentThread().getName());
        }
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
