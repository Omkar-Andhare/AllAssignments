package Multithreading.ObjectLevelLock;

public class Thread1 extends Thread {

    ObjectLevelLockExample objectLevelLockExample = new ObjectLevelLockExample();



    @Override
    public void run() {
        objectLevelLockExample.m1();
        objectLevelLockExample.m2();
    }
}
