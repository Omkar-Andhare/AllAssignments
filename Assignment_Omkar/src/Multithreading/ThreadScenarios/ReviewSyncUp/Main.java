package Multithreading.ThreadScenarios.ReviewSyncUp;

public class Main {

    static final Demo ob1 = new Demo();
    static final Demo ob2 = new Demo();


    public static void main(String[] args) {
//
//        Demo ob1 = new Demo();
//        Demo ob2 = new Demo();

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);
//        Thread t3 = new Thread(ob1);

        t1.start();
        t2.start();
//        t3.start();


    }
}
