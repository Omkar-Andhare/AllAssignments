package Multithreading.Callable;

import java.util.concurrent.Callable;

import static java.lang.Thread.sleep;

public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        sleep(100);
        return 10;
    }
}
