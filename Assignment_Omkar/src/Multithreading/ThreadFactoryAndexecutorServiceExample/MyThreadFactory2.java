package Multithreading.ThreadFactoryAndexecutorServiceExample;

import java.util.concurrent.ThreadFactory;

public class MyThreadFactory2 implements ThreadFactory {
    @Override
    public Thread newThread(Runnable runnable) {

        Thread thread = new Thread(runnable);
        thread.setName("MyAppThread");
        thread.setPriority(10);

        return thread;
    }
}
