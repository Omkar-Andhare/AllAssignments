package Multithreading.Synchronization;

import static java.lang.Thread.sleep;

public class Table {


    void printTable(int n) {
        synchronized (TestSynchronization.class) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n * i);
                try {
                    sleep(100);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
