package Multithreading.TaskBySonalMam.Task5;

class ThreadA implements Runnable {
    int i = 0;
    int sum = 0;

    @Override
    public void run() {
        i++;
        synchronized (this) {
            sum = 10 + i;
            System.out.println(sum);
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
