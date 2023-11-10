package Multithreading.UsingRunnableInterface;


public class Demo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread thread1 = new Thread(t1);
        Thread2 t2 = new Thread2();
        thread1 = new Thread(t2);
//        thread2.setName("ij");
//
//
//        thread2.start();
        thread1.start();
//        System.out.println("-----------------------");
//        t1.run();


    }
}
