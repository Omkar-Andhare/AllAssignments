package Multithreading.ObjectLevelLock;


public class Thread2 extends Thread {

    ObjectLevelLockExample objectLevelLockExample = new ObjectLevelLockExample();



    @Override
    public void run() {
        objectLevelLockExample.m1();
        objectLevelLockExample.m2();
    }
}