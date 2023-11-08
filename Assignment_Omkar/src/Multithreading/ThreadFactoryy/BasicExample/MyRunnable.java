package Multithreading.ThreadFactoryy.BasicExample;

public class MyRunnable implements Runnable{
//    private int taskId;
//
//    public MyRunnable(int taskId) {
//        this.taskId = taskId;
//    }

    @Override
    public void run() {
        System.out.println("running on thread: " + Thread.currentThread().getName());
    }
}
