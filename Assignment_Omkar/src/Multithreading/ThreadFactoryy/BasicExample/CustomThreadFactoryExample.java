package Multithreading.ThreadFactoryy.BasicExample;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactoryExample {
    public static void main(String[] args) {
        // Create a custom thread factory
        ThreadFactory customThreadFactory = new CustomThreadFactory();

        customThreadFactory.newThread(new MyRunnable()).start();
        customThreadFactory.newThread(new MyRunnable()).start();
        customThreadFactory.newThread(new MyRunnable()).start();


        // Use the custom thread factory to create threads
//        for (int i = 1; i <= 5; i++) {
//            customThreadFactory.newThread(new MyRunnable(i)).start();
//        }
    }
}
