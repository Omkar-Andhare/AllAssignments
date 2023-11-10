package Multithreading.CollableAndFutureExample;

import java.util.Random;
import java.util.concurrent.Callable;

public class Task implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("generating random number : ");
        return new Random().nextInt();
    }
}
