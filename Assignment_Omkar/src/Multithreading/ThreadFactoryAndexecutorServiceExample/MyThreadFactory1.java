package Multithreading.ThreadFactoryAndexecutorServiceExample;

import java.util.concurrent.ThreadFactory;


public class MyThreadFactory1 implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        synchronized (this) {
            Thread thread = new Thread(r, "MyThread-" + Thread.currentThread().getName());
            System.out.println(thread.getState());

            return thread;
        }
    }
}
