package Multithreading.TaskBySonalMam.Task3;

class ThreadA implements Runnable {


    @Override
    public synchronized void run() {
        int i = 0;
        i++;
        System.out.println(i);
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
