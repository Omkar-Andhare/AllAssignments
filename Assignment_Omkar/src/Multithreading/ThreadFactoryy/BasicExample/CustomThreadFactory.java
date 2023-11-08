package Multithreading.ThreadFactoryy.BasicExample;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);

        thread.setName("-Thread-" + thread.getId());

        return thread;
    }

}
